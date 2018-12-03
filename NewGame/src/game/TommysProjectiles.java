package game;

import  javax.swing.JFrame;

public class TommysProjectiles extends JFrame {

	public TommysProjectiles() {
		
		this.setSize(1200,800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
	public static void main(String [] args) {
		
		TommysProjectiles screen = new TommysProjectiles();
		Mycanvas canvas = new Mycanvas();
		screen.getContentPane().add(canvas);
		
	}
	
}