import java.awt.*;
import java.awt.event.*;

class pref_frame extends Frame{
    public pref_frame(String title){
	setTitle(title);

	addWindowListener(new WindowAdapter() {
	    public void windowClosing(WindowEvent e){
	        System.exit(0);
	    }
	});
    }
}

public class pref_test{
    public static void main(String args[]){
	pref_frame frm = new pref_frame("Master of pref data");
	frm.setLocation(300, 200);
	frm.setSize(250, 350);
	frm.setBackground(new Color(9, 150, 212));
	frm.setVisible(true);
    }
}

	
	
