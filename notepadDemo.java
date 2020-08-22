import java.awt.*;
import java.awt.event.*;
class notepadDemo
 {
	notepadDemo()
	{
	   Frame f=new Frame("NotepadDemo");
	   
	   Button b1=new Button("Button1");
	   Button b2=new Button("Button2");
	   Button b3=new Button("Button3");
	   Button b4=new Button("Button4");	   
	   Button b5=new Button("Button5");
	
	   MenuBar mb=new MenuBar();
	   
	   Menu m1=new Menu("File");
	   Menu m2=new Menu("Edit");
	   Menu m3=new Menu("Format");
	   Menu m4=new Menu("View");
	   Menu m5=new Menu("Help");
	   
	   mb.add(m1);
	   mb.add(m2);
	   mb.add(m3);
	   mb.add(m4);
	   mb.add(m5);
	   
	   MenuItem mif1=new MenuItem("New");
	   MenuItem mif2=new MenuItem("Open");
	   MenuItem mif3=new MenuItem("Save");
	   MenuItem mif4=new MenuItem("Save As");
	   MenuItem mif5=new MenuItem("PageSetup");
	   
	   MenuItem mie1=new MenuItem("Undo");
	   MenuItem mie2=new MenuItem("Cut");
	   MenuItem mie3=new MenuItem("Copy");
	   MenuItem mie4=new MenuItem("Paste");
	   MenuItem mie5=new MenuItem("Delete");
	   
	   MenuItem mifo1=new MenuItem("Word Wrap");
	   MenuItem mifo2=new MenuItem("Font");

           MenuItem miv1=new MenuItem("Zoom");
	   MenuItem miv2=new MenuItem("Status Bar");

	   MenuItem mih1=new MenuItem("View Help");
	   MenuItem mih2=new MenuItem("About Notepad");
	   	   	  
	   m1.add(mif1);
	   m1.add(mif2);
	   m1.add(mif3);
	   m1.add(mif4);
	   m1.addSeparator();
	   m1.add(mif5);

	   m2.add(mie1);
	   m2.addSeparator();
	   m2.add(mie2);
	   m2.add(mie3);
	   m2.add(mie4);
	   m2.add(mie5);
	  
	   m3.add(mifo1);
	   m3.add(mifo2);

	   m4.add(miv1);
	   m4.add(miv2);
	   
	   m5.add(mih1);
	   m5.add(mih2);

	   f.add(b1,BorderLayout.NORTH);
	   f.add(b2,BorderLayout.EAST);
	   f.add(b3,BorderLayout.WEST);
	   f.add(b4,BorderLayout.SOUTH);
	   f.add(b5,BorderLayout.CENTER);
	   
	   b1.addActionListener(new handler());
	   b2.addActionListener(new handler());
	   b3.addMouseListener(new handler());
	   b4.addMouseListener(new handler());
	   b3.addActionListener(new handler());
	   b5.addMouseMotionListener(new handler());
	   f.setSize(500,400);
	   f.setVisible(true);
	 //  f.setLayout(new FlowLayout());
	   f.setMenuBar(mb);
	}
   public static void main(String[] args)
	{
	   notepadDemo n=new notepadDemo();
	}
 }

class handler implements ActionListener,MouseListener,MouseMotionListener
 {
  public void actionPerformed(ActionEvent aa)
	{
	System.out.println("You have Entered");
	} 
 
  public void mousePressed(MouseEvent mm)
	{
	System.out.println("Mouse is pressed");
	}

  public void mouseClicked(MouseEvent mm)
	{
	System.out.println("Mouse is Clicked");
	}
  public void mouseReleased(MouseEvent mm)
	{
	System.out.println("Mouse is Released");
	}
  public void mouseEntered(MouseEvent mm)
	{
	System.out.println("Mouse is Entered");
	}
  public void mouseExited(MouseEvent mm)
	{
	System.out.println("Mouse is Exited");
	}

  public void mouseMoved(MouseEvent mm)
	{
	System.out.println("Mouse is moved");
	}
  public void mouseDragged(MouseEvent mm)
	{
	System.out.println("Mouse is Dragged");
	}
 }