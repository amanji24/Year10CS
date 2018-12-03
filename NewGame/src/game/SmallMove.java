package game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;

public class SmallMove {

	private int xCoord = 0;
	private int yCoord = 0;
	private int width = 10;
	private int height = 10;
	private Image img;
	int counter = 0;
	Random rand = new Random();
	int movedist = rand.nextInt(85) + 65;
	
	public SmallMove() {
		
		setxCoord(10);
		setyCoord(10);
		setWidth(30);
		setHeight(30);
		setImg("files/badguy.png");
		
	}
	
	public SmallMove(int x, int y, int w, int h, String imgpath) {
		
		setxCoord(x);
		setyCoord(y);
		setWidth(w);
		setHeight(h);
		setImg(imgpath);
		
	}
	
	public void setImg(String imgpath) {
		
		this.img = Toolkit.getDefaultToolkit().getImage(imgpath);
		
	}

	public int getxCoord() {
		return xCoord;
	}

	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	public int getyCoord() {
		return yCoord;
	}

	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

	public void moveIt(int keyCode) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		if (counter % 2 == 0) {
			setxCoord(getxCoord() + movedist);
			movedist = rand.nextInt(85) + 65;
			if (rand.nextInt(3) != 2) {
				counter++;
			}
		} else {
			setxCoord(getxCoord() - movedist);
			movedist = rand.nextInt(85) + 65;
			if (rand.nextInt(3) % 2 == 0) {
				counter++;
			}
		}
		
		if (getxCoord() > 1150) {
			
			setxCoord(75);
			
		} else if (getxCoord() < -20) {
			
			setxCoord(1067);
			
		}
		
	}
	
}
