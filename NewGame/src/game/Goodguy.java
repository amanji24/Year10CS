package game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;


public class Goodguy {

	private int xCoord = 0;
	private int yCoord = 0;
	private int width = 10;
	private int height = 10;
	private Image img;
	public boolean attack = false;
	String facing = "right";
	String facing2 = "right";
	String facing3 = "right";
	
	public Goodguy() {
		
		setxCoord(10);
		setyCoord(10);
		setWidth(30);
		setHeight(30);
		setImg("../files/right.png");
		
	}
	
	public Goodguy(int x, int y, int w, int h, String imgpath) {
		
		setxCoord(x);
		setyCoord(y);
		setWidth(w);
		setHeight(h);
		setImg(imgpath);
		
	}
	
	public void moveIt(int direction) {
		
		int speed = 20;
		int x = getxCoord();
		int y = getyCoord();
		if (direction == 39 || direction == 68) {
			
			if (x > 1000) { x = x - speed * 3; }
			x = x + speed;
			setxCoord(x);
			if (direction == 68) {
				setImg("files/right.png");
				facing = "right";
			} else {
				setImg("files/right2.png");
				facing2 = "right";
				facing3 = "right";
			}
			
			
		} else if (direction == 37 || direction == 65) {
			
			if (x < -35) { x = x + speed * 3; }
			x = x - speed;
			setxCoord(x);
			if (direction == 65) {
				setImg("files/left.png");
				facing = "left";
			} else {
				setImg("files/left2.png");
				facing2 = "left";
				facing3 = "left";
			}
			
			
		} else if (direction == 38 || direction == 87) {
			
			if (y < -10) { y = y + speed * 3; }
			y = y - speed;
			setyCoord(y);
			if (facing2 == "right") {
				
				if (direction == 87) {
					setImg("files/right.png");
				} else {
					setImg("files/right2.png");
				}
				
			} else {
				
				if (direction == 87) {
					setImg("files/left.png");
				} else {
					setImg("files/left2.png");
				}
				
			}
			
		} else if (direction == 40 || direction == 83) {
			
			if (y > 650) { y = y - speed * 3; }
			y = y + speed;
			setyCoord(y);
			
			if (facing2 == "right") {
				
				if (direction == 83) {
					setImg("files/right.png");
				} else {
					setImg("files/right2.png");
				}
				
			} else {
				
				if (direction == 83) {
					setImg("files/left.png");
				} else {
					setImg("files/left2.png");
				}
				
			}
			
		} else if (direction == 32) {
			
			System.out.println("attack");
			
			if (facing == "left") {
				
				setImg("files/attackleft.png");
				
			} else {
				
				setImg("files/attack.png");
				
			}
			
		} else if (direction == 10) {
			
			if (facing2 == "left") {
				
				setImg("files/attackleft2.png");
				
			} else {
				
				setImg("files/attack2.png");
				
			}
			
		} else if (direction == 67) {
			
			System.out.println(Integer.toString(Mycanvas.getMoveCount()));
			if (Mycanvas.getMoveCount() % 5 == 0) {
				setyCoord(getyCoord() + 600);
			} else {
				setyCoord(getyCoord() - 150);
			}
		} else if (direction == 88) {
			
			System.out.println("attack");
			
			if (facing3 == "left") {
				
				setImg("files/attackleft.png");
				
			} else {
				
				setImg("files/attack.png");
				
			}
			
		}
	
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
	
}
