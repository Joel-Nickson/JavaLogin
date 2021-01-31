import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JavaLogin{
	static String insert="insert into logintable(name,username,password) ";
	static String select="select * from logintable ";
	static JFrame f;
	static JButton signin ,sinbutton ,signup ,supbutton ,next ,done ,retry;
	static JTextField name ,user ,pass;
	static JPanel s_up ,s_uppage ,s_upbutton ,s_in ,s_inpage ,s_inbutton ,s_login ,s_loginbutton ,s_panel ,newJpanel;
	static JPanel s_login_one ;
	static ResultSet rs;
	static String database_name, username, password ,n ,u ,p;

	JavaLogin(){
		f = new JFrame("Framey");
		
		user = new JTextField("",13);
		pass = new JTextField("",13);

		next = new JButton("Sign in");
		next.addActionListener(this);
		done = new JButton("Sign up");
		done.addActionListener(this);
		retry = new JButton("retry");
		retry.addActionListener(this);
		
		newJpanel = Login_one(); // replace the Login_one() with your methods to test them out
		
		f.add(newJpanel);

		f.setLayout(new FlowLayout());
        	f.setSize(300,200);
        	f.setVisible(true);
        	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	static JPanel Login_one(){
		
		s_login_one = new JPanel();
		s_loginbutton = new JPanel();
		s_panel = new JPanel();
		
		user = new JTextField("Username");
		JLabel label = new JLabel("\t BLA BLA BLA ");
		
		s_panel.setLayout(new BorderLayout());
		s_loginbutton.setLayout(new FlowLayout());
		s_login_one.setLayout(new BorderLayout());
		
		s_panel.add(label,BorderLayout.CENTER);
		s_panel.add(user,BorderLayout.SOUTH);

		s_loginbutton.add(next);
		
		s_login_one.add(s_panel,BorderLayout.CENTER);
		s_login_one.add(s_loginbutton,BorderLayout.SOUTH);
		return s_login_one;
		
	}	
	public static void main(String args[]){
		new JavaLogin();
	}
}
