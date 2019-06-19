
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;

import javax.swing.*;

public class recipetext extends JFrame implements ActionListener{
	
	String name;
	String explan;
	String[] mtext = new String[10];
	int cnt=0;
	int i=0;
	JPanel image = new JPanel();
	JPanel explanpal = new JPanel();
	JTextArea text= new JTextArea();
	Container c;
	JButton before;
	JButton home;
	JButton after;
	
	public recipetext(String ttext) throws FileNotFoundException
	{
		this.name = ttext;
		setTitle("asdf");
		setSize(800, 750);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		c.setLayout(new BorderLayout());
		
		String file = "src\\"+name+".txt";
		File f = new File(file);
		Scanner text = new  Scanner(f);
		mtext[cnt++] = text.nextLine();
		while(text.hasNextLine()){
			mtext[cnt++] = text.nextLine();
		}
		
		JLabel rname = new JLabel(name);
		rname.setFont(new Font("SansSerif", Font.BOLD, 20));
		c.add(rname, BorderLayout.NORTH);
		
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(1,2));
		setimage();
		center.add(image);
		setexplane();
		center.add(explanpal);
		
		c.add(center, BorderLayout.CENTER);
		
		setVisible(true);
	}

	void setimage()
	{
		image.setLayout(new BorderLayout());
		
		
		ImageIcon img1 = new ImageIcon("src\\" + name + ".jpg");
		JLabel rimage = new JLabel(img1);
		
		image.add(rimage);

	}
	
	void setexplane(){
		explanpal.setLayout(new BorderLayout());
		
		JPanel bpanel = new JPanel();
		bpanel.setLayout(new FlowLayout());
		
		JPanel textpal = new JPanel();
		text = new JTextArea();
		
		ImageIcon img1 = new ImageIcon("src\\before.png");		
		ImageIcon img2 = new ImageIcon("src\\home.png");
		ImageIcon img3 = new ImageIcon("src\\after.png");
		
		before = new JButton(img1); 		
		before.addActionListener(this);

		home =  new JButton(img2);
		home.addActionListener(this);
		
		after =  new JButton(img3);
		after.addActionListener(this);
		
		explan = mtext[0];
		
		text.setFont(new Font("SansSerif", Font.BOLD, 20));
		text.setText(explan);
		

		textpal.add(text);
		text.setLineWrap(true);
		text.setColumns(20);
		text.setRows(20);
		explanpal.add(textpal, BorderLayout.CENTER);
		
		
		bpanel.add(before);
		bpanel.add(home);
		bpanel.add(after);
		explanpal.add(bpanel, BorderLayout.SOUTH);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == before)
		{
			if(i==0)
			{
				explan = mtext[i];
				text.setText(explan);
			}else {
			explan = mtext[--i];
			text.setText(explan);
			}
		}else if(e.getSource() == after)
		{
			if(i == cnt-1)
			{
				explan = mtext[cnt-1];
				text.setText(explan);
			}
			else{
				explan = mtext[++i];
				text.setText(explan);
			}
		}else if(e.getSource() == home)
		{
			setVisible(false);
		}
		
	}
}
