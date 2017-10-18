

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class Pong {

	private JFrame  frame;

	
	public JFrame getJframe() {
		return frame;
	}
	
	
	public void Execute(){
	}
	
	public void Collision() {
		
	}
	
	public Pong() {
		frame = new JFrame();
        frame.setTitle("Pong");
        frame.setResizable(false);
        frame.setSize(1280,720);
        frame.getContentPane().setBackground(Color.lightGray);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
	}
	
	public static void main(String[] args) {
		 SwingUtilities.invokeLater(new Runnable() {
			 	@Override
	            public void run() {
	                 new Pong();
	            }     
	
		 });
	
}
}

