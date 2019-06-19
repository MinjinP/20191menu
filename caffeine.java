
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;

import javax.swing.*;

public class caffeine extends JFrame{
	private static int width = 1000;
	private static int height = 800;
	public static int NUMBER_OF_CHAR = 50;
	private JTextField search;
	
	 private class SearchListener implements ActionListener
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	        	String buttonCommand = search.getText();
	        	//String buttonCommand = e.getActionCommand();
			      
			     try {
					recipetext A = new recipetext(buttonCommand);
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
					search.setText("다시 입력하세요");
				}  
	        }
	    }
	 
	 private class ButtonListener implements ActionListener
		{
		 public void actionPerformed(ActionEvent e)
	        {
			 String buttonCommand = e.getActionCommand();
		      
		     try {
				recipetext A = new recipetext(buttonCommand);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
	        }		
		}

	
	public caffeine()
	{
		super("caffeine");
		setSize(width, height);
		setLayout(new BorderLayout());
		JPanel searchPanel = new JPanel();
		searchPanel.setLayout(new GridLayout(2, 1));
		
		search = new JTextField("메뉴이름을 검색하세요.", NUMBER_OF_CHAR);
		search.setBackground(Color.white);
		searchPanel.add(search);
		
		JButton searchButton = new JButton("search");
		searchButton.addActionListener(new SearchListener());
		searchPanel.add(searchButton);
		add(searchPanel, BorderLayout.NORTH);
		
		
		JPanel caf = new JPanel();
		caf.setLayout(new GridLayout(2,4));
		
		JPanel ameri = new JPanel();
		ameri.setLayout(new BorderLayout());
		ameri.setBackground(Color.WHITE);
		ImageIcon ameimg = new ImageIcon("src//americano.jpg");
		Image ame = ameimg.getImage();
	    Image neame = ame.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
		ImageIcon ameimg2 = new ImageIcon(neame);
		JLabel am = new JLabel(ameimg2);
		ameri.add(am, BorderLayout.CENTER);
		JButton americano = new JButton("americano");
		americano.addActionListener(new ButtonListener());
		ameri.add(americano, BorderLayout.SOUTH);
		
		JPanel lat = new JPanel();
		lat.setLayout(new BorderLayout());
		ImageIcon latimg = new ImageIcon("src//cafelatte.jpg");
		Image la = latimg.getImage();
		Image nela = la.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
		ImageIcon latimg2 = new ImageIcon(nela);
		JLabel laaa = new JLabel(latimg2);
		JButton cafelatte = new JButton("cafelatte");
		cafelatte.addActionListener(new ButtonListener());
		lat.setBackground(Color.WHITE);
		lat.add(laaa, BorderLayout.CENTER);
		lat.add(cafelatte, BorderLayout.SOUTH);
		
		JPanel moc = new JPanel(); 
		moc.setLayout(new BorderLayout());
		ImageIcon mocimg = new ImageIcon("src//cafemocha.jpg");
		Image mo = mocimg.getImage();
		Image nemo = mo.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
		ImageIcon mocimg2 = new ImageIcon(nemo);
		JLabel moo = new JLabel(mocimg2);
		JButton cafemocha = new JButton("cafemocha");
		cafemocha.addActionListener(new ButtonListener());
		moc.setBackground(Color.WHITE);
		moc.add(moo, BorderLayout.CENTER);
		moc.add(cafemocha, BorderLayout.SOUTH);
		
		JPanel van = new JPanel();
		van.setLayout(new BorderLayout());
		ImageIcon vanimg = new ImageIcon("src//vanillalatte.jpg");
		Image va = vanimg.getImage();
		Image neva = va.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
		ImageIcon vanimg2 = new ImageIcon(neva);
		JLabel vaa = new JLabel(vanimg2);
		JButton vanillalatte = new JButton("vanillalatte");
		vanillalatte.addActionListener(new ButtonListener());
		van.setBackground(Color.WHITE);
		van.add(vaa, BorderLayout.CENTER);
		van.add(vanillalatte, BorderLayout.SOUTH);
		
		JPanel haz = new JPanel();
		haz.setLayout(new BorderLayout());
		ImageIcon hazimg = new ImageIcon("src//hazelnutslatte.jpg");
		Image ha = hazimg.getImage();
		Image neha = ha.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
		ImageIcon hazimg2 = new ImageIcon(neha);
		JLabel haaa = new JLabel(hazimg2);
		JButton hazelnutslatte = new JButton("hazelnutslatte");
		hazelnutslatte.addActionListener(new ButtonListener());
		haz.setBackground(Color.WHITE);
		haz.add(haaa, BorderLayout.CENTER);
		haz.add(hazelnutslatte, BorderLayout.SOUTH);
		
		JPanel carf = new JPanel();
		carf.setLayout(new BorderLayout());
		ImageIcon carfimg = new ImageIcon("src//caramelfrappuccino.jpg");
		Image carF = carfimg.getImage();
		Image necarF = carF.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
		ImageIcon carfimg2 = new ImageIcon(necarF);
		JLabel caF = new JLabel(carfimg2);
		JButton caramelfrappuccino = new JButton("caramelfrappuccino");
		caramelfrappuccino.addActionListener(new ButtonListener());
		carf.setBackground(Color.WHITE);
		carf.add(caF, BorderLayout.CENTER);
		carf.add(caramelfrappuccino, BorderLayout.SOUTH);
		
		JPanel carm = new JPanel();
		carm.setLayout(new BorderLayout());
		ImageIcon carmimg = new ImageIcon("src//caramelmacchiato.jpg");
		Image carM = carmimg.getImage();
		Image necarM = carM.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
		ImageIcon carmimg2 = new ImageIcon(necarM);
		JLabel caM = new JLabel(carmimg2);
		JButton caramelmacchiato = new JButton("caramelmacchiato");
		caramelmacchiato.addActionListener(new ButtonListener());
		carm.setBackground(Color.WHITE);
		carm.add(caM, BorderLayout.CENTER);
		carm.add(caramelmacchiato, BorderLayout.SOUTH);
		
		JPanel No = new JPanel();
		No.setLayout(new BorderLayout());
		No.setBackground(Color.WHITE);
		JLabel text = new JLabel("                              to be continue");
		No.add(text, BorderLayout.CENTER);
		
		caf.add(ameri);
		caf.add(lat);
		caf.add(moc);
		caf.add(van);
		caf.add(haz);
		caf.add(carm);
		caf.add(carf);
		caf.add(No);
		add(caf, BorderLayout.CENTER);
		
	}		
}
