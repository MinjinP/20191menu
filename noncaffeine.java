
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;

import javax.swing.*;


public class noncaffeine extends JFrame {
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
	
	public noncaffeine()
	{
		super("noncaffeine");
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
		
		
		 JPanel noncaf = new JPanel();
	     noncaf.setLayout(new GridLayout(2,4));

	     JPanel yog = new JPanel();
	     yog.setLayout(new BorderLayout());
	     ImageIcon yogimg = new ImageIcon("src//yogurtsmoothie.jpg");
	     Image yogg = yogimg.getImage();
	     Image neyogg = yogg.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
	     ImageIcon yogimg2 = new ImageIcon(neyogg);
	     JLabel yo = new JLabel(yogimg2);
	     JButton yogurtsmoothie = new JButton("yogurtsmoothie");
	     yogurtsmoothie.addActionListener(new ButtonListener());
	     yog.setBackground(Color.WHITE);
	     yog.add(yo, BorderLayout.CENTER);
	     yog.add(yogurtsmoothie, BorderLayout.SOUTH);
	     
	     JPanel lem = new JPanel();
	     lem.setLayout(new BorderLayout());
	     ImageIcon lemimg = new ImageIcon("src//lemonade.jpg");
	     Image lemm = lemimg.getImage();
	     Image nelemm = lemm.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
	     ImageIcon lemimg2 = new ImageIcon(nelemm);
	     JLabel le = new JLabel(lemimg2);
	     JButton lemonade = new JButton("lemonade");
	     lemonade.addActionListener(new ButtonListener());
	     lem.setBackground(Color.WHITE);
	     lem.add(le, BorderLayout.CENTER);
	     lem.add(lemonade, BorderLayout.SOUTH);
	     
	     JPanel graf = new JPanel(); 
	     graf.setLayout(new BorderLayout());
	     ImageIcon grafimg = new ImageIcon("src//grapefruitade.jpg");
	     Image graff = grafimg.getImage();
	     Image negraff = graff.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
	     ImageIcon grafimg2 = new ImageIcon(negraff);
	     JLabel gr = new JLabel(grafimg2);
	     JButton grapefruitade = new JButton("grapefruitade");
	     grapefruitade.addActionListener(new ButtonListener());
	     graf.setBackground(Color.WHITE);
	     graf.add(gr, BorderLayout.CENTER);
	     graf.add(grapefruitade, BorderLayout.SOUTH);
	     
	     JPanel chol = new JPanel();
	     chol.setLayout(new BorderLayout());
	     ImageIcon choimg = new ImageIcon("src//chocolatte.jpg");
	     Image choll = choimg.getImage();
	     Image necholl = choll.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
	     ImageIcon choimg2 = new ImageIcon(necholl);
	     JLabel cl = new JLabel(choimg2);
	     JButton chocolatte = new JButton("chocolatte");
	     chocolatte.addActionListener(new ButtonListener());
	     chol.setBackground(Color.WHITE);
	     chol.add(cl, BorderLayout.CENTER);
	     chol.add(chocolatte, BorderLayout.SOUTH);
	     
	     JPanel grel = new JPanel();
	     grel.setLayout(new BorderLayout());
	     ImageIcon grelimg = new ImageIcon("src//greentealatte.jpg");
	     Image grelll = grelimg.getImage();
	     Image negrelll = grelll.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
	     ImageIcon grelimg2 = new ImageIcon(negrelll);
	     JLabel gl = new JLabel(grelimg2);
	     JButton greentealatte = new JButton("greentealatte");
	     greentealatte.addActionListener(new ButtonListener());
	     grel.setBackground(Color.WHITE);
	     grel.add(gl, BorderLayout.CENTER);
	     grel.add(greentealatte, BorderLayout.SOUTH);
	     
	     JPanel mincl = new JPanel();
	     mincl.setLayout(new BorderLayout());
	     ImageIcon mclimg = new ImageIcon("src//mintchocolatte.jpg");
	     Image mcl = mclimg.getImage();
	     Image nemcl = mcl.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
	     ImageIcon mclimg2 = new ImageIcon(nemcl);
	     JLabel mc = new JLabel(mclimg2);
	     JButton mintchocolatte = new JButton("mintchocolatte");
	     mintchocolatte.addActionListener(new ButtonListener());
	     mincl.setBackground(Color.WHITE);
	     mincl.add(mc, BorderLayout.CENTER);
	     mincl.add(mintchocolatte, BorderLayout.SOUTH);
	     
	     JPanel chof = new JPanel();
	     chof.setLayout(new BorderLayout());
	     ImageIcon cF = new ImageIcon("src//chocofrappucino.jpg");
	     Image cf = cF.getImage();
	     Image necf = cf.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
	     ImageIcon cF2 = new ImageIcon(necf);
	     JLabel cFF = new JLabel(cF2);
	     JButton chocofrappucino = new JButton("chocofrappucino");
	     chocofrappucino.addActionListener(new ButtonListener());
	     chof.setBackground(Color.WHITE);
	     chof.add(cFF, BorderLayout.CENTER);
	     chof.add(chocofrappucino, BorderLayout.SOUTH);
	     
	     JPanel gref = new JPanel();
	     gref.setLayout(new BorderLayout());
	     ImageIcon grfimg = new ImageIcon("src//greenteafrappuccino.jpg");
	     Image grf = grfimg.getImage();
	     Image negrf = grf.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
	     ImageIcon grfimg2 = new ImageIcon(negrf);
	     JLabel gF = new JLabel(grfimg2);
	     JButton greenteafrappuccino = new JButton("greenteafrappuccino");
	     greenteafrappuccino.addActionListener(new ButtonListener());
	     gref.setBackground(Color.WHITE);
	     gref.add(gF, BorderLayout.CENTER);
	     gref.add(greenteafrappuccino, BorderLayout.SOUTH);
	     
	     noncaf.add(yog);
	     noncaf.add(lem);
	     noncaf.add(graf);
	     noncaf.add(chol);
	     noncaf.add(grel);
	     noncaf.add(mincl);
	     noncaf.add(chof);
	     noncaf.add(gref);
	     
	     add(noncaf, BorderLayout.CENTER);
	}	
	
	public void actionPerformed(ActionEvent e)
	{
		String buttonCommand = e.getActionCommand();
	      
	   
			try {
				recipetext A = new recipetext(buttonCommand);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	
	}	
}
