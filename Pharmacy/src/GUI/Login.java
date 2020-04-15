package GUI;

import javax.swing.JFrame;

public class Login {


private  JFrame frame;
	
	private String title;
	private int width,height;
	
	
	public Login(String title,int width,int height) {
		this.height=height;
		this.title=title;
		this.width=width;
		
		createLogin();
		
		
		
	}
	
	public void createLogin() {
		

		frame=new JFrame(title);
		frame.setSize(width,height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}

}
