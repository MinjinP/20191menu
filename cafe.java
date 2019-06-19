import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;

import javax.swing.*;

public class cafe extends JFrame {
   private static int width = 1000;
   private static int height = 800;
   public static int NUMBER_OF_CHAR = 50;
   private JTextField search;
   caffeine menu1;
   noncaffeine menu2;
   
   private class SearchListener implements ActionListener
   {
       public void actionPerformed(ActionEvent e)
       {
       	String buttonCommand = search.getText();
       	
       	
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
	      String buttonString = e.getActionCommand();
	      
	      if(buttonString.equals("caffeine"))
	      {
	         menu1 = new caffeine();
	         menu1.setVisible(true);
	      }
	      else if(buttonString.equals("noncaffeine"))
	      {
	         menu2 = new noncaffeine();
	         menu2.setVisible(true);
	      }
	      else
	      {
	         System.out.println("unexpected error");
	      }
       }		
	}
   
   
   public cafe()
   {
      super("cafe");
      setSize(width,height);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new BorderLayout());
      
      JMenu menu = new JMenu("menu");
      JMenuItem caffeine = new JMenuItem("caffeine");
      caffeine.addActionListener(new ButtonListener());
      menu.add(caffeine);
      JMenuItem noncaffeine = new JMenuItem("noncaffeine");
      noncaffeine.addActionListener(new ButtonListener());
      menu.add(noncaffeine);
      
      JMenuBar bar = new JMenuBar();
      bar.add(menu);
      setJMenuBar(bar);
      
      JPanel searchPanel = new JPanel();
      searchPanel.setLayout(new GridLayout(2, 1));
      
      search = new JTextField("Search Menu.", NUMBER_OF_CHAR);
      search.setBackground(Color.white);
      searchPanel.add(search);
      
      JButton searchButton = new JButton("search");
      searchButton.addActionListener(new SearchListener());
      searchPanel.add(searchButton);
      add(searchPanel, BorderLayout.NORTH);
      
   
      
      setVisible(true);
   }
}