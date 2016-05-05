

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.io.*;

public class DialogViewer{
	
public static void main (String[] args) throws Exception{

   String name = JOptionPane.showInputDialog("what is your name");
   System.out.println("Hello dear  " + name);
   
   String response = JOptionPane.showInputDialog("My Name is Milli, What can I do for you?");
   System.out.println( name + "  says  " + response);  
   System.out.println("I'm sorry " + name + "  Can't do as requested :(");
 
    int question1 = JOptionPane.showConfirmDialog(null, "Anything else u need?", "choose ur answer ", JOptionPane.YES_NO_CANCEL_OPTION);
	System.out.println( name + "  says  " + question1); 
	
	try{
     URL imageLocation = new URL("http://horstmann.com/java4everyone/duke.gif");
	 JOptionPane.showMessageDialog(null, "Hello", "Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
	 
	}catch(Exception ex){		
		System.out.println("Caught URL exception : " + ex.getMessage());
		}
		finally {
			System.out.	println(" Image finally  found ");
		}
	
 }

}