// FINISH ONE PLAYER, FINISH RANDOM Q'S [2 player] [Sunday] && DO PRESENTATION [Monday]

package game;

	import java.awt.Canvas;
	import java.awt.Graphics;
	import java.awt.Image;
	import java.awt.Rectangle;
	import java.awt.Toolkit;
	import java.awt.event.KeyEvent;
	import java.awt.event.KeyListener;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Timer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import sun.audio.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.font.*;

	public class Mycanvas extends Canvas implements KeyListener, MouseListener {

		String puimg1 = "files/powerup1.png";
		String puimg2 = "files/powerup2.png";
		String puimg3 = "files/powerup3.png";
		String puimg4 = "files/powerup4.png";
		String puimg5 = "files/powerup5.png";
		
		Goodguy hero1 = new Goodguy(0,15,200,212,"files/right.png");
		Goodguy hero2 = new Goodguy(300,20,200,212, "files/right2.png");
		//
		Small s1 = new Small(400,675,50,50, "files/badguy.png");
		SmallMove s2 = new SmallMove(375,575,50,50, "files/badguy.png");
		SmallMove s3 = new SmallMove(700,425,50,50, "files/badguy.png");
		Small s4 = new Small(150,225,50,50, "files/badguy.png");
		MedThrow m1 = new MedThrow(1000,222,111,111,"files/knivesbg.png");
		boolean m1power = true;
		
		Small s21 = new Small(888,75,50,50, "files/badguy.png");
		SmallMove s22 = new SmallMove(600,275,50,50, "files/badguy.png");
		MedThrow m21 = new MedThrow(950,522,111,111, "files/knivesbg.png");
		Big b21 = new Big(900,345,133,133, "files/bigbad.png");
		
		Small s31 = new Small(400,675,50,50, "files/badguy.png");
		SmallMove s32 = new SmallMove(678,575,50,50, "files/badguy.png");
		SmallMove s33 = new SmallMove(625,725,50,50, "files/badguy.png");
		SmallMove s34 = new SmallMove(350,425,50,50, "files/badguy.png");
		MedThrow m31 = new MedThrow(1000,222,111,111, "files/knivesbg.png");
		boolean m31power = true;
		Big b31 = new Big(250,45,133,133, "files/bigbad.png");
		Big b32 = new Big(650,45,133,133, "files/bigbad.png");
		Big b33 = new Big(550,645,133,133, "files/bigbad.png");
		
		MedThrow m41 = new MedThrow(1000,222,111,111, "files/knivesbg.png");
		boolean m41power = true;
		
		Small s51 = new Small(800,675,50,50, "files/badguy.png");
		SmallMove s52 = new SmallMove(678,125,50,50, "files/badguy.png");
		SmallMove s53 = new SmallMove(625,275,50,50, "files/badguy.png");
		SmallMove s54 = new SmallMove(350,425,50,50, "files/badguy.png");
		Small s55 = new Small(875,375,50,50, "files/badguy.png");
		Small s56 = new Small(750,75,50,50, "files/badguy.png");
		Small s57 = new Small(825,225,50,50, "files/badguy.png");
		MedThrow m51 = new MedThrow(1000,522,111,111, "files/knivesbg.png");
		boolean m51power = true;
		Big b51 = new Big(85,45,133,133, "files/bigbad.png");
		Big b52 = new Big(500,45,133,133, "files/bigbad.png");
		Big b53 = new Big(420,645,133,133, "files/bigbad.png");
		Big b54 = new Big(80,495,133,133, "files/bigbad.png");
		
		MedThrow m61 = new MedThrow(1000,372,111,111, "files/knivesbg.png");
		boolean m61power = true;
		MedThrow m62 = new MedThrow(1000,522,111,111, "files/knivesbg.png");
		boolean m62power = true;
		MedThrow m63 = new MedThrow(1000,672,111,111, "files/knivesbg.png");
		boolean m63power = true;
		SmallMove s61 = new SmallMove(600,275,50,50, "files/badguy.png");
		SmallMove s62 = new SmallMove(195,275,50,50, "files/badguy.png");
		SmallMove s63 = new SmallMove(415,425,50,50, "files/badguy.png");
		SmallMove s64 = new SmallMove(675,725,50,50, "files/badguy.png");
		SmallMove s65 = new SmallMove(750,425,50,50, "files/badguy.png");
		SmallMove s66 = new SmallMove(825,575,50,50, "files/badguy.png");
		Big b61 = new Big(385,195,133,133, "files/bigbad.png");
		Big b62 = new Big(525,495,133,133, "files/bigbad.png");
		Big b63 = new Big(220,345,133,133, "files/bigbad.png");
		Big b64 = new Big(600,645,133,133, "files/bigbad.png");

		//
		Portal p1 = new Portal(1111,650,100,100,"files/portal.gif");
		
		Portal p2 = new Portal(800,650,100,100,"files/portal.gif");
		
		Random rand0 = new Random();
		int l3portal = rand0.nextInt(3) + 3;
		Portal p3 = new Portal(1050,50,100,100,"files/portal.gif");
		Portal p4  = new Portal(1050,350,100,100,"files/portal.gif");
		Portal p5 = new Portal(1050,650,100,100,"files/portal.gif");
		
		Portal p6 = new Portal(250,50,100,100,"files/portal.gif");
		Portal p7 = new Portal(575,350,100,100,"files/portal.gif");
		Portal p8 = new Portal(333,350,100,100,"files/portal.gif");
		Portal p9 = new Portal(900,650,100,100,"files/portal.gif");
		Portal p10 = new Portal(350,650,100,100,"files/portal.gif");
		Portal p11 = new Portal(800,200,100,100,"files/portal.gif");
		Portal p12 = new Portal(100,500,100,100,"files/portal.gif");
		Portal p13 = new Portal(950,500,100,100,"files/portal.gif");
		Portal p14 = new Portal(50,650,100,100,"files/portal.gif");
		Random rand44 = new Random();
		int badportal4 = rand44.nextInt(5) + 7;
		int p7p8 = rand44.nextInt(2) + 7; {
		if (badportal4 == 7 || badportal4 == 8) {
			p7p8 = 0;
		} }
		int p10p14 = rand44.nextInt(2);
		
		Portal p15 = new Portal(1050,650,100,100,"files/portal.gif");
		
		Portal p0 = new Portal(150,650,100,100,"files/portal.gif");
		
		//
		
		Boss boss = new Boss(475,10,175,175,"files/boss.png");
		boolean bossspeech1 = true;
		boolean bossspeech2 = false;
		boolean bossspeech3 = false;
		
		//
		
		boolean wave1 = false;
		boolean wave2 = false;
		boolean wave3 = false;
		
		//
		Powerup pucandy1 = new Powerup(200,650,100,100,"files/powerup1.png");
		Powerup pucandy2 = new Powerup(150,50,100,100,"files/powerup1.png");
		boolean puc2show = true;
		Powerup pucandy3 = new Powerup(750,650,100,100,"files/powerup1.png");
		boolean puc3show = true;
		//
		
		Device device = new Device(1010,202,144,123,"files/device.png");
		boolean deviceshow = false;
		boolean deviceunlocked = false;
		boolean deviceactivated = false;
		
		//
		
		Switch switch1 = new Switch(800,250,50,50,"files/switch.png");
		Switch switch2 = new Switch(150,400,50,50,"files/switch.png");
		
		//
		Image background = Toolkit.getDefaultToolkit().createImage("files/background.png");
		Image background1 = Toolkit.getDefaultToolkit().createImage("files/background1.png");
		Image menuimg = Toolkit.getDefaultToolkit().createImage("files/menu.png");
		Image instructionsimg = Toolkit.getDefaultToolkit().createImage("files/instructions.png");
		Image helper = Toolkit.getDefaultToolkit().createImage("files/helper.png");
		Image optionsimg = Toolkit.getDefaultToolkit().createImage("files/options.png");
		Image musicimg = Toolkit.getDefaultToolkit().createImage("files/musicsel.png");
		Image bgselectimg = Toolkit.getDefaultToolkit().createImage("files/bgsel.png");
		
		
		Random randl4q = new Random();
		String l4qopstr = "";
		int l4qfakeanschg = rand44.nextInt(15)+1;
		int l4qfakeans = randl4q.nextInt(2);
		int l4qansside = randl4q.nextInt(2);
		int l4qop = randl4q.nextInt(3); {
		if (l4qop == 0) {
			l4qopstr = "+";
		} else if (l4qop == 1) {
			l4qopstr = "-";
		} else if (l4qop == 2) {
			l4qopstr = "x";
		} }
		int l4q1 = randl4q.nextInt(10) + 1;
		int l4q2 = randl4q.nextInt(10) + 1;
		int l4qanswer = 0; {
		if (l4qop == 0) {
			l4qanswer = l4q1 + l4q2;
		} else if (l4qop == 1) {
			l4qanswer = l4q1 - l4q2;
		} else if (l4qop == 2) {
			l4qanswer = l4q1 * l4q2;
		} }
		
		Random randfq = new Random();
		String fqopstr = "";
		int fq1 = randl4q.nextInt(10) + 1;
		int fq2 = randl4q.nextInt(10) + 1;
		int fqfakeanschg = rand44.nextInt(40)-20;
		int fqansside = randl4q.nextInt(3);
		int fqanswer = 0;
		int fqop = randl4q.nextInt(3); {
		if (fqop == 0) {
				fqopstr = "+";
			} else if (fqop == 1) {
				fqopstr = "-";
			} else if (fqop == 2) {
				fqopstr = "x";
		}
		if (fqop == 0) {
			fqanswer = fq1 + fq2;
		} else if (fqop == 1) {
			fqanswer = fq1 - fq2;
		} else if (fqop == 2) {
			fqanswer = fq1 * fq2;
		} }
		
		LinkedList badguys = new LinkedList();
		boolean win = false;
		boolean moving = true;
		boolean bonus = false;
		boolean lose = false;
		boolean stop = false;
		int Timer = 30;
		int KnivesThrown = 0;
		int KnifeLimit = 2;
		long newTime = 0;
		boolean powers = false;
		boolean powers2 = false;
		boolean SFX = false;
		boolean menu = true;
		boolean hardmode = false;
		boolean stoptimer = false;
		String gamemode = "none";
		boolean options = false;
		boolean instructions = false;
		int hero1kills = 0;
		int hero2kills = 0;
		boolean draw = false;
		boolean player1win = false;
		boolean player2win = false;
		Image badguy = Toolkit.getDefaultToolkit().createImage("files/badguy.png");
		Font newfont = new Font ("Arial", 50);
		int health = 100;
		int level = 1;
		boolean recharging = false;
		long startTime1 = 0;
		boolean facingright = true;
		boolean pu1 = false;
		boolean pu2 = false;
		boolean puq = false;
		Image puqimg = Toolkit.getDefaultToolkit().createImage("files/background.png");
		LinkedList knives = new LinkedList();
		Random rn = new Random();
		int puqnum = rn.nextInt(10) + 1;
		//int puqnum = 1; TEST
		long newestTime = System.currentTimeMillis();
		int newestcounter = 0;
		boolean s2right = true;
		int levelcounter = 0;
		int thenewcounter = 0;
		private static int movecount = 0;
		Random rand1 = new Random();
		int smove = rand1.nextInt(4) + 4;
		int bmove = rand1.nextInt(3) + 10;
		int movecount2 = 0;
		boolean telecharging = false;
		int TeleLimit = 2;
		int TelesUsed = 0;
		long telechargetimer = 0;
		boolean timerstarted = false;
		int telechargetime = 2500;
		boolean startpu = false;
		int startpuchance = rand1.nextInt(5);
		//int startpuchance = 2;
		long ktimer = 0;
		int powercount = 1;
		int pu1num = 0;
		int pu2num = 0;
		int pu3num = 0;
		boolean godmode = false;
		boolean help = true;
		boolean musicselect = false;
		boolean bgselect = false;
		boolean healthdecreased = false;
		boolean healthdecreased2 = false;
		boolean healthdecreased3 = false;
		boolean healthdecreased4 = false;
		boolean healthdecreased5 = false;
		String soundtrack = "files/overdue.wav";
		long musiclength = 166;
		String selectedsong = "Overdue";
		long ktimer2 = 0;
		int bgsel = 1;
		boolean healthtonic = true;
		long fqtimer = 0;
		boolean slowWin = false;
		boolean regWin = false;
		int score = 0;
		boolean presentation = false;
		
		Random rand2 = new Random();
		String[] poweruplist = new String[10]; {
		//power ups ... [0-1] = Less Recharge Time, [2] = Extra Teleport (for rest of level), [3-6] = 1 Power, [7-8] = 3 Powers, [9] = God mode (for rest of level)
		poweruplist[0] = puimg1;
		poweruplist[1] = puimg1;
		poweruplist[2] = puimg2;
		poweruplist[3] = puimg3;
		poweruplist[4] = puimg3;
		poweruplist[5] = puimg3;
		poweruplist[6] = puimg3;
		poweruplist[7] = puimg4;
		poweruplist[8] = puimg4;
		poweruplist[9] = puimg5;
		//power ups ... [0-1] = Less Recharge Time, [2] = Extra teleport (for rest of level), [3-6] = 1 Power, [7-8] = 3 Powers, [9] = God mode (for rest of level)
		pu1num = rand2.nextInt(10);
		Image pu1img = Toolkit.getDefaultToolkit().createImage(poweruplist[pu1num]);
		pucandy1.setImg(pu1img);
		Random randpu2 = new Random();
		pu2num = randpu2.nextInt(10);
		Image pu2img = Toolkit.getDefaultToolkit().createImage(poweruplist[pu2num]);
		pucandy2.setImg(pu2img);
		Random randpu3 = new Random();
		pu3num = randpu3.nextInt(10);
		Image pu3img = Toolkit.getDefaultToolkit().createImage(poweruplist[pu3num]);
		pucandy3.setImg(pu3img);
		
		}
		{
		if (startpuchance == 2) {
			startpu = true;
		}
		/*if (startpuchance < 10) {
			System.out.println(startpuchance);
			startpu = true;
		}*/
		}
		
		
		{
		
		// Power Up Question 
		
		if (puqnum == 1) {
			puqimg = Toolkit.getDefaultToolkit().createImage("files/Q1.png");
		} else if (puqnum == 2) {
			puqimg = Toolkit.getDefaultToolkit().createImage("files/Q2.png");
		} else if (puqnum == 3) {
			puqimg = Toolkit.getDefaultToolkit().createImage("files/Q3.png");
		} else if (puqnum == 4) {
			puqimg = Toolkit.getDefaultToolkit().createImage("files/Q4.png");
		} else if (puqnum == 5) {
			puqimg = Toolkit.getDefaultToolkit().createImage("files/Q5.png");
		} else if (puqnum == 6) {
			puqimg = Toolkit.getDefaultToolkit().createImage("files/Q6.png");
		} else if (puqnum == 7) {
			puqimg = Toolkit.getDefaultToolkit().createImage("files/Q7.png");
		} else if (puqnum == 8) {
			puqimg = Toolkit.getDefaultToolkit().createImage("files/Q8.png");
		} else if (puqnum == 9) {
			puqimg = Toolkit.getDefaultToolkit().createImage("files/Q9.png");
		} else if (puqnum == 10) {
			puqimg = Toolkit.getDefaultToolkit().createImage("files/Q10.png");
		} }
		
		public Mycanvas() {
			
			this.setSize(1200,800);
			this.addKeyListener(this);
			movecount = 0;
			addMouseListener(this);
			
			Random rand = new Random();
			int winwidth = this.getWidth() - 100;
			int winheight = this.getHeight() - 50;
			for(int i = 0; i < 10; i++) {
				
				Badguy bg = new Badguy(rand.nextInt(winwidth),rand.nextInt(winheight),50,50,"files/badguy.png");
				Rectangle r = new Rectangle(100,100,30,30);
				if (r.contains(hero1.getxCoord(), hero1.getyCoord())) {
					System.out.println("Badguy on top of hero");
					continue;
				
				}
				
				badguys.add(bg);
				
			}
			
		}
		
		private void setMoveCount(int movecount) {
			// TODO Auto-generated method stub
			this.movecount = movecount;
		}
		
		public static int getMoveCount() {
			return movecount;
		}

		public Mycanvas(int movecount) {
			setMoveCount(movecount);
		}
		
		public void playIt(String filename) {
			
			try {
				InputStream in = new FileInputStream(filename);
				AudioStream as = new AudioStream(in);
				AudioPlayer.player.start(as);
			} catch (IOException e) {
				System.out.println(e);
			}
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
			if (menu == true) {
			if (e.getButton() == 1 && e.getX() > 10 && e.getX() < 588 && e.getY() > 10 && e.getY() < 394) {
				
				menu = false;
				playIt(soundtrack);
				System.out.println("1 player");
				gamemode = "1 player";
				hero1.setxCoord(10);
				hero1.setyCoord(586);
				ktimer = System.currentTimeMillis()/1000;
				/*hero1.setxCoord(0);
				hero1.setyCoord(-14);
				movecount = 4;
				TEST */
				
			} else if (e.getButton() == 3 && e.getX() > 10 && e.getX() < 588 && e.getY() > 10 && e.getY() < 394) {
				
				presentation = true;
				System.out.println("presentation mode on");
				
				menu = false;
				playIt(soundtrack);
				System.out.println("1 player");
				gamemode = "1 player";
				hero1.setxCoord(10);
				hero1.setyCoord(586);
				ktimer = System.currentTimeMillis()/1000;
				startpu = true;
				while (pu1num == 9) {
					pu1num = rand2.nextInt(10);
					Image pu1img = Toolkit.getDefaultToolkit().createImage(poweruplist[pu1num]);
					pucandy1.setImg(pu1img);
				}
				
			} else if (e.getButton() == 1 && e.getX() > 612 && e.getX() < 1190 && e.getY() > 406 && e.getY() < 790) {
				
				System.out.println("Quit Game...");
				System.exit(1);
				
			} else if (e.getButton() == 3 && menu == true) {
				
				hardmode = true;
				
			} else if (e.getButton() == 1 && e.getX() > 10 && e.getX() < 588 && e.getY() > 406 && e.getY() < 790) {
				
				System.out.println("options");
				menu = false;
				options = true;
				
			} else if (e.getButton() == 1 && e.getX() > 612 && e.getX() < 1190 && e.getY() > 10 && e.getY() < 394) {
				
				menu = false;
				playIt(soundtrack);
				puq = true;
				newTime = System.currentTimeMillis();
				System.out.println("2 player");
				gamemode = "2 player";
				ktimer2 = System.currentTimeMillis()/1000;
				
			}
			
			} else if (options) {
				
				if (e.getButton() == 1 && e.getX() > 10 && e.getX() < 588 && e.getY() > 10 && e.getY() < 394) {
					
					System.out.println("instructions");
					instructions = true;
					options = false;
					
				} else if (e.getButton() == 1 && e.getX() > 612 && e.getX() < 1190 && e.getY() > 406 && e.getY() < 790) {
					
					options = false;
					menu = true;
					
				} else if (e.getButton() == 3 && menu == true) {
					
					hardmode = true;
					
				} else if (e.getButton() == 1 && e.getX() > 10 && e.getX() < 588 && e.getY() > 406 && e.getY() < 790) {
					
					musicselect = true;
					options = false;
					
				} else if (e.getButton() == 1 && e.getX() > 612 && e.getX() < 1190 && e.getY() > 10 && e.getY() < 394) {
					
					options = false;
					bgselect = true;
					
				}
				
			} else if (instructions == true) {
				
				if (e.getButton() == 1) {
					instructions = false;
					options = true;
				}
				
			} else if (musicselect) {
				
				musicselect = false;
				options = true;
				
			} else if (bgselect) {
				
				bgselect = false;
				options = true;
				
			}
			
		}
			
		@Override
		public void paint(Graphics g) {

			if (menu == true) {
				
				System.out.println(Integer.toString(puqnum));
				g.drawImage(menuimg, 0, 0, 1200, 800, this);
				g.drawString("After you click any button, you must press the command button...", 33, 33);
				
			} else if (instructions == true) {
				
				g.drawImage(instructionsimg, 0, 0, 1200, 777, this);
				
			} else if (options) {
			
				g.drawImage(optionsimg, 0, 0, 1200, 777, this);
		
			} else if (musicselect) {
				
				g.drawImage(musicimg, 0, 0, 1200, 777, this);
				g.drawString(selectedsong, 933, 580);
			
			} else if (bgselect) {	
			
				g.drawImage(bgselectimg, 0, 0, 1200, 777, this);
				if (bgsel == 1) {
					g.drawOval(518, 262, 55, 93);
				} else if (bgsel == 2) {
					g.drawOval(636, 262, 75, 96);
				} else if (bgsel == 3) {
					g.drawOval(505, 420, 75, 96);
				} else if (bgsel == 4) {
					g.drawOval(636, 420, 75, 96);
				}
			
			/////////////// 1 PLAYER
				
			} else if (gamemode.equals("1 player")) {
				
				if (health < 1) {
					
					lose = true;
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					};
					
				}
				
				if (lose) {
				
					g.drawString("Game over. Try again!", 525, 200);
					playIt("files/lose.wav");
					try {
						Thread.sleep(290000000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					};
				
				}
				
				g.drawImage(background1, 0, 0, 1200, 800, this);
				g.drawString("Hero Health: " + health, 15, 104);
				if (level != 6) {
					g.drawString("Level: " + Integer.toString(level), 15, 25);
				} else {
					g.drawString("Level: BOSS", 15, 25);
				}
				g.drawString("Powers: " + Integer.toString(powercount), 15, 45);
				if (telecharging) {
					g.drawString("Teleport Charges:", 15, 65);
					g.drawString("Recharging", 31, 84);
				} else {
					g.drawString("Teleport Charges: " + Integer.toString(Math.abs(TelesUsed - TeleLimit)), 15, 65);
				}
				g.drawString(Integer.toString(hero1.getxCoord()) + "," + Integer.toString(hero1.getyCoord()), 1100, 25);
				
				if (moving == true) {
					if ((hero1.getyCoord() < 100 && level == 1) || (hero1.getyCoord() < 100 && level == 6)) {
						hero1.setyCoord(hero1.getyCoord() + 600);
					} else if ((hero1.getyCoord() > 600 && level == 1) || (hero1.getyCoord() > 600 && level == 6)) {
						hero1.setyCoord(hero1.getyCoord() - 750);
					}
					g.drawImage(hero1.getImg(), hero1.getxCoord(), hero1.getyCoord(), hero1.getHeight(), hero1.getWidth(), this);
				}
				
				if (level == 1) {

				if (startpu) {
					g.drawImage(pucandy1.getImg(), pucandy1.getxCoord(), pucandy1.getyCoord(), pucandy1.getHeight(), pucandy1.getWidth(), this);
					Rectangle pu1rect = new Rectangle(pucandy1.getxCoord(), pucandy1.getyCoord(), pucandy1.getHeight(), pucandy1.getWidth());
					if (pu1rect.contains(hero1.getxCoord()+100, hero1.getyCoord()+100)) {
						//power ups ... [0-1] = Less Recharge Time, [2] = Extra teleport (for rest of level), [3-6] = 1 Power, [7-8] = 3 Powers, [9] = God mode (for rest of level)
						if (pu1num < 2) {
							telechargetime = 1250;
							System.out.println("Less recharge Time");
						} else if (pu1num == 2) {
							TeleLimit = 3;
							System.out.println("Extra teleport");
						} else if (pu1num > 2 && pu1num < 7) {
							powercount++;
							System.out.println("1 power");
						} else if (pu1num > 6 && pu1num < 9) {
							powercount = powercount + 3;
							System.out.println("3 power");
						} else if (pu1num == 9) {
							godmode = true;
							System.out.println("god mode");
						}
						startpu = false;
					}
				}
				g.drawImage(p1.getImg(), p1.getxCoord(), p1.getyCoord(), p1.getHeight(), p1.getWidth(), this);
				g.drawString("T U T O R I A L", 565, 50);
				g.drawString("L E V E L", 588, 133);
				g.drawRect(144, 10, 945, 150);
				g.drawLine(142, 10, 1088, 160);
				g.drawLine(142, 160, 1088, 10);
				g.drawLine(s1.getxCoord()+25, -50, s1.getxCoord()+25, s1.getyCoord()+10);
				g.drawImage(s1.getImg(), s1.getxCoord(), s1.getyCoord(), s1.getHeight(), s1.getWidth(), this);
				g.drawLine(175, -50, 175, 235);
				g.drawImage(s4.getImg(), s4.getxCoord(), s4.getyCoord(), s4.getHeight(), s4.getWidth(), this);
				Rectangle r10 = new Rectangle(s1.getxCoord() - 125, s1.getyCoord() - 93, s1.getWidth() + 60, s1.getHeight() + 55);
				if (r10.contains(hero1.getxCoord(), hero1.getyCoord())) {
					
					health = health - 5;
					hero1.setxCoord(hero1.getxCoord() - 150);
					if (level == 1) {
						try {
							Thread.sleep(250);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						g.drawString("You must avoid touching enemies.", 100, 500);
						try {
							Thread.sleep(1250);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}

				}
				Rectangle r13 = new Rectangle(s4.getxCoord() - 125, s4.getyCoord() - 93, s4.getWidth() + 60, s4.getHeight() + 55);
				if (r13.contains(hero1.getxCoord(), hero1.getyCoord())) {
					
					health = health - 5;
					hero1.setxCoord(-50);
					if (level == 1) {
						try {
							Thread.sleep(250);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						g.drawString("You must avoid touching enemies.", 500, 250);
						try {
							Thread.sleep(1250);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}

				}
				g.drawImage(s2.getImg(), s2.getxCoord(), s2.getyCoord(), s2.getHeight(), s2.getWidth(), this);
				Rectangle r11 = new Rectangle(s2.getxCoord(), s2.getyCoord()-33, s2.getWidth(), s2.getHeight()+39);
				if (r11.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
					
					health = health - 5;
					hero1.setxCoord(hero1.getxCoord() - 150);
					if (level == 1) {
						try {
							Thread.sleep(250);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						g.drawString("You must avoid touching enemies.", 100, 500);
						try {
							Thread.sleep(1250);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				
					}
				
				}
				g.drawImage(s3.getImg(), s3.getxCoord(), s3.getyCoord(), s3.getHeight(), s3.getWidth(), this);
				Rectangle r12 = new Rectangle(s3.getxCoord(), s3.getyCoord()-33, s3.getWidth(), s3.getHeight()+39);
				if (r12.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
					
					health = health - 5;
					hero1.setxCoord(hero1.getxCoord() - 150);
					if (level == 1) {
						try {
							Thread.sleep(250);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						g.drawString("You must avoid touching enemies.", 100, 500);
						try {
							Thread.sleep(1250);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				
					}
				
				}
				g.drawImage(m1.getImg(), m1.getxCoord(), m1.getyCoord(), m1.getHeight(), m1.getWidth(), this);
				Rectangle r15 = new Rectangle(m1.getxCoord(), m1.getyCoord()-33, m1.getWidth(), m1.getHeight()+39);
				if (r15.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
					
					health = health - 10;
					hero1.setxCoord(hero1.getxCoord() - 150);
					if (level == 1) {
						try {
							Thread.sleep(250);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						g.drawString("You must avoid touching enemies.", 100, 500);
						try {
							Thread.sleep(1250);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				
					}
				
				}
				
				
				if ((System.currentTimeMillis()/1000 - ktimer) % 3 == 1) {
					if (m1power) {
					g.drawLine(-100, m1.getyCoord()+25, m1.getxCoord()+20, m1.getyCoord()+25);
					g.drawLine(-100, m1.getyCoord()+26, m1.getxCoord()+20, m1.getyCoord()+26);
					if (m1.getyCoord() - hero1.getyCoord() == 86) {
						if (powers == false) {
						health = health - 5;
						if (level == 1) {
							try {
								Thread.sleep(250);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							g.drawString("You must avoid touching enemies.", 100, 500);
							try {
								Thread.sleep(1250);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					
						} } else {
							m1power = false;
						}
					} }
				}
				
				if (hero1.getxCoord() > 1000 && hero1.getyCoord() > 500) {
					
					telechargetime = 2500;
					TeleLimit = 2;
					godmode = false;
					level = 2;
					
				}
					
				} else if (level == 2) {
					
					if (levelcounter == 0) {
						hero1.setxCoord(10);
						hero1.setyCoord(586);
						movecount = 0;
					}
					
					g.drawImage(helper, 500, 686, 75, 75, this);
					
					if (hero1.getxCoord() > 100 && help) {
						try {
							Thread.sleep(1250);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						g.drawString("Hello adventurer! Can you rescue this nation from the evil power in the castle?", 350, 654);
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						g.drawString("Yes? That's great! Just be careful of enemies along the way...", 350, 675);
						try {
							Thread.sleep(1250);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						g.drawLine(s21.getxCoord()+25, -50, s21.getxCoord()+25, s21.getyCoord()+10);
						g.drawImage(s21.getImg(), s21.getxCoord(), s21.getyCoord(), s21.getWidth(), s21.getHeight(), this);
						g.drawString("These small, stationary enemies deal 5-10 damage each time you touch them.", 250, s21.getyCoord());
						try {
							Thread.sleep(1200);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						g.drawImage(s22.getImg(), s22.getxCoord(), s22.getyCoord(), s22.getWidth(), s22.getHeight(), this);
						g.drawString("These small, moving enemies deal 5 damage each time you touch them.", 250, s22.getyCoord()-20);
						try {
							Thread.sleep(1200);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						g.drawImage(m21.getImg(), m21.getxCoord(), m21.getyCoord(), m21.getWidth(), m21.getHeight(), this);
						g.drawString("These medium, stationary enemies deal 10 damage if touch them and  shoot lasers (which can be disabled with powers) every 3 seconds dealing 5 damage.", 125, m21.getyCoord());
						try {
							Thread.sleep(350);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						g.drawLine(-100, m21.getyCoord()+25, m21.getxCoord()+20, m21.getyCoord()+25);
						g.drawLine(-100, m21.getyCoord()+26, m21.getxCoord()+20, m21.getyCoord()+26);
						try {
							Thread.sleep(1250);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}	
						g.drawString("These big, moving enemies deal 15-20 damage each time you touch them. They move more slowly and in smaller distances.", 150, b21.getyCoord()+25);
						g.drawImage(b21.getImg(), b21.getxCoord(), b21.getyCoord(), b21.getWidth(), b21.getHeight(), this);
						try {
							Thread.sleep(12000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						help = false;
					}
					
					g.drawLine(s21.getxCoord()+25, -50, s21.getxCoord()+25, s21.getyCoord()+10);
					g.drawImage(s21.getImg(), s21.getxCoord(), s21.getyCoord(), s21.getWidth(), s21.getHeight(), this);
					g.drawImage(s22.getImg(), s22.getxCoord(), s22.getyCoord(), s22.getWidth(), s22.getHeight(), this);
					g.drawImage(m21.getImg(), m21.getxCoord(), m21.getyCoord(), m21.getWidth(), m21.getHeight(), this);
					if ((System.currentTimeMillis()/1000 - ktimer) % 3 == 1) {
						g.drawLine(-100, m21.getyCoord()+25, m21.getxCoord()+20, m21.getyCoord()+25);
						g.drawLine(-100, m21.getyCoord()+26, m21.getxCoord()+20, m21.getyCoord()+26);
					}
					g.drawImage(b21.getImg(), b21.getxCoord(), b21.getyCoord(), b21.getWidth(), b21.getHeight(), this);
					g.drawImage(p2.getImg(), p2.getxCoord(), p2.getyCoord(), p2.getHeight(), p2.getWidth(), this);
					Rectangle portal2 = new Rectangle(p2.getxCoord(), p2.getyCoord(), p2.getHeight(), p2.getWidth());
					if (portal2.contains(hero1.getxCoord()+100, hero1.getyCoord()+100)) {
						
						level = 3;
						
					}
					
					if (presentation) {
						
						g.drawImage(p0.getImg(), p0.getxCoord(), p0.getyCoord(), p0.getHeight(), p0.getWidth(), this);
						Rectangle portal0 = new Rectangle(p0.getxCoord(), p0.getyCoord(), p0.getHeight(), p0.getWidth());
						if (portal0.contains(hero1.getxCoord()+100, hero1.getyCoord()+100)) {
							
							level = 6;
							levelcounter = 4;
							
						}
						
					}
					

				} else if (level == 3) {
					
					if (levelcounter == 1) {
						hero1.setxCoord(10);
						hero1.setyCoord(436);
						movecount = 1;
						levelcounter++;
					}
					
					g.drawLine(s31.getxCoord()+25, -50, s31.getxCoord()+25, s31.getyCoord()+10);
					g.drawImage(s31.getImg(), s31.getxCoord(), s31.getyCoord(), s31.getWidth(), s31.getHeight(), this);
					g.drawImage(s32.getImg(), s32.getxCoord(), s32.getyCoord(), s32.getWidth(), s32.getHeight(), this);
					g.drawImage(s33.getImg(), s33.getxCoord(), s33.getyCoord(), s33.getWidth(), s33.getHeight(), this);
					g.drawImage(s34.getImg(), s34.getxCoord(), s34.getyCoord(), s34.getWidth(), s34.getHeight(), this);
					g.drawImage(m31.getImg(), m31.getxCoord(), m31.getyCoord(), m31.getWidth(), m31.getHeight(), this);
					if ((System.currentTimeMillis()/1000 - ktimer) % 3 == 1) {
						if (m31power) {
							g.drawLine(-100, m1.getyCoord()+25, m1.getxCoord()+20, m1.getyCoord()+25);
							g.drawLine(-100, m1.getyCoord()+26, m1.getxCoord()+20, m1.getyCoord()+26);
							if (m1.getyCoord() - hero1.getyCoord() == 86) {
								if (powers == false) {
									if (!healthdecreased) {
									health = health - 5;
									healthdecreased = true;
									}
								} else {
									m31power = false;
								}
							}
						}
					} else {
						healthdecreased = false;
					}
					g.drawImage(b31.getImg(), b31.getxCoord(), b31.getyCoord(), b31.getWidth(), b31.getHeight(), this);
					g.drawImage(b32.getImg(), b32.getxCoord(), b32.getyCoord(), b32.getWidth(), b32.getHeight(), this);
					g.drawImage(b33.getImg(), b33.getxCoord(), b33.getyCoord(), b33.getWidth(), b33.getHeight(), this);
					
					Random rand30 = new Random();
					
					Rectangle r31 = new Rectangle(s31.getxCoord(), s31.getyCoord()-33, s31.getWidth(), s31.getHeight()+39);
					if (r31.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
						
						health = health - (rand30.nextInt(5) + 5);
						hero1.setxCoord(hero1.getxCoord() - 150);
					
					}
					Rectangle r32 = new Rectangle(s32.getxCoord(), s32.getyCoord()-33, s32.getWidth(), s32.getHeight()+39);
					if (r32.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
						
						health = health - 5;
						hero1.setxCoord(hero1.getxCoord() - 150);
					
					}
					Rectangle r33 = new Rectangle(s33.getxCoord(), s33.getyCoord()-33, s33.getWidth(), s33.getHeight()+39);
					if (r33.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
						
						health = health - 5;
						hero1.setxCoord(hero1.getxCoord() - 150);
					
					}
					Rectangle r34 = new Rectangle(s34.getxCoord(), s34.getyCoord()-33, s34.getWidth(), s34.getHeight()+39);
					if (r34.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
						
						health = health - 5;
						hero1.setxCoord(hero1.getxCoord() - 150);
					
					}
					Rectangle r35 = new Rectangle(m31.getxCoord(), m31.getyCoord()-33, m31.getWidth(), m31.getHeight()+39);
					if (r35.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
						
						health = health - 10;
						hero1.setxCoord(hero1.getxCoord() - 150);
					
					}
					Rectangle r36 = new Rectangle(b31.getxCoord(), b31.getyCoord()-33, b31.getWidth(), b31.getHeight()+39);
					if (r36.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
						
						health = health - (rand30.nextInt(5) + 15);
						hero1.setxCoord(hero1.getxCoord() - 150);
					
					}
					Rectangle r37 = new Rectangle(b32.getxCoord(), b32.getyCoord()-33, b32.getWidth(), b32.getHeight()+39);
					if (r37.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
						
						health = health - (rand30.nextInt(5) + 15);
						hero1.setxCoord(hero1.getxCoord() - 150);
					
					}
					Rectangle r38 = new Rectangle(b33.getxCoord(), b33.getyCoord()-33, b33.getWidth(), b33.getHeight()+39);
					if (r38.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
					
						health = health - (rand30.nextInt(5) + 15);
						hero1.setxCoord(hero1.getxCoord() - 150);
					
					}
					
					
					g.drawImage(p3.getImg(), p3.getxCoord(), p3.getyCoord(), p3.getHeight(), p3.getWidth(), this);
					Rectangle portal3 = new Rectangle(p3.getxCoord(), p3.getyCoord(), p3.getHeight(), p3.getWidth());
					if (portal3.contains(hero1.getxCoord()+100, hero1.getyCoord()+100)) {
						
						if (l3portal == 3) {
							level = 4;
							System.out.println("level 4");
						} else {
							hero1.setxCoord(10);
							hero1.setyCoord(436);
							movecount = 1;
						}
						
					}
					g.drawImage(p4.getImg(), p4.getxCoord(), p4.getyCoord(), p4.getHeight(), p4.getWidth(), this);
					Rectangle portal4 = new Rectangle(p4.getxCoord(), p4.getyCoord(), p4.getHeight(), p4.getWidth());
					if (portal4.contains(hero1.getxCoord()+100, hero1.getyCoord()+100)) {
						
						if (l3portal == 4) {
							level = 4;
							System.out.println("level 4");
						} else {
							hero1.setxCoord(10);
							hero1.setyCoord(436);
							movecount = 1;
						}
						
					}
					g.drawImage(p5.getImg(), p5.getxCoord(), p5.getyCoord(), p5.getHeight(), p5.getWidth(), this);
					Rectangle portal5 = new Rectangle(p5.getxCoord(), p5.getyCoord(), p5.getHeight(), p5.getWidth());
					if (portal5.contains(hero1.getxCoord()+100, hero1.getyCoord()+100)) {
						
						if (l3portal == 5) {
							level = 4;
							System.out.println("level 4");
						} else {
							hero1.setxCoord(10);
							hero1.setyCoord(436);
							movecount = 1;
						}
						
					}
					
				} else if (level == 4) {
					
					if (levelcounter == 0) {
					System.out.println("Bad portal 4: " + badportal4);
					System.out.println("p7p8: " + p7p8);
					levelcounter++;
					} //TEST
					
					if (levelcounter == 2) {
						hero1.setxCoord(0);
						hero1.setyCoord(-14);
						movecount = 4;
						levelcounter++;
						System.out.println("Bad portal 4: " + badportal4);
						System.out.println("p7p8: " + p7p8);
					}
					
					g.drawImage(helper, 632, 86, 75, 75, this);
					g.drawString("Please help us!", 600, 60);
					g.drawImage(helper, 100, 386, 75, 75, this);
					g.drawString("We got stuck in the maze of portals!", 50, 360);
					g.drawImage(helper, 824, 386, 75, 75, this);
					g.drawString("You can free us by defeating the evil in the castle up ahead.", 750, 360);
					
					
					if (puc2show) {
					g.drawImage(pucandy2.getImg(), pucandy2.getxCoord(), pucandy2.getyCoord(), pucandy2.getHeight(), pucandy2.getWidth(), this);
					{
					Rectangle pu2rect = new Rectangle(pucandy2.getxCoord(), pucandy2.getyCoord(), pucandy2.getHeight(), pucandy2.getWidth());
					if (pu2rect.contains(hero1.getxCoord()+100, hero1.getyCoord()+100)) {
						//power ups ... [0-1] = Less Recharge Time, [2] = Extra teleport (for rest of level), [3-6] = 1 Power, [7-8] = 3 Powers, [9] = God mode (for rest of level)
						if (pu2num < 2) {
							telechargetime = 1250;
							System.out.println("Less recharge Time");
						} else if (pu2num == 2) {
							TeleLimit = 3;
							System.out.println("Extra teleport");
						} else if (pu2num > 2 && pu2num < 7) {
							powercount++;
							System.out.println("1 power");
						} else if (pu2num > 6 && pu2num < 9) {
							powercount = powercount + 3;
							System.out.println("3 power");
						} else if (pu2num == 9) {
							godmode = true;
							System.out.println("god mode");
						}
						puc2show = false;
						
					}
					}
					}
					
					if (puc3show) {
						g.drawImage(pucandy3.getImg(), pucandy3.getxCoord(), pucandy3.getyCoord(), pucandy3.getHeight(), pucandy3.getWidth(), this);
						{
						Rectangle pu3rect = new Rectangle(pucandy3.getxCoord(), pucandy3.getyCoord(), pucandy3.getHeight(), pucandy3.getWidth());
						if (pu3rect.contains(hero1.getxCoord()+100, hero1.getyCoord()+100)) {
							//power ups ... [0-1] = Less Recharge Time, [2] = Extra teleport (for rest of level), [3-6] = 1 Power, [7-8] = 3 Powers, [9] = God mode (for rest of level)
							if (pu3num < 2) {
								telechargetime = 1250;
								System.out.println("Less recharge Time");
							} else if (pu3num == 2) {
								TeleLimit = 3;
								System.out.println("Extra teleport");
							} else if (pu3num > 2 && pu3num < 7) {
								powercount++;
								System.out.println("1 power");
							} else if (pu3num > 6 && pu3num < 9) {
								powercount = powercount + 3;
								System.out.println("3 power");
							} else if (pu3num == 9) {
								godmode = true;
								System.out.println("god mode");
							}
							puc3show = false;
							
						}
						}
					}
					
					Random rand40 = new Random();
					g.drawImage(p6.getImg(), p6.getxCoord(), p6.getyCoord(), p6.getHeight(), p6.getWidth(), this);
					Rectangle portal6 = new Rectangle(p6.getxCoord(), p6.getyCoord(), p6.getHeight(), p6.getWidth());
					if (portal6.contains(hero1.getxCoord()+100,hero1.getyCoord()+100)) {
					hero1.setxCoord(400);
					hero1.setyCoord(286);
					movecount = 2;
					}
					g.drawImage(p7.getImg(), p7.getxCoord(), p7.getyCoord(), p7.getHeight(), p7.getWidth(), this);
					Rectangle portal7 = new Rectangle(p7.getxCoord(), p7.getyCoord(), p7.getHeight(), p7.getWidth());
					if (portal7.contains(hero1.getxCoord()+100,hero1.getyCoord()+100)) {
						System.out.println("portal 7");
						if (badportal4 == 7) {
							hero1.setxCoord(0);
							hero1.setyCoord(-14);
						} else if (p7p8 == 7) {
							hero1.setxCoord(50);
							hero1.setyCoord(136);
						} else {
						hero1.setxCoord(150);
						hero1.setyCoord(586);
						}
					}
					g.drawImage(p8.getImg(), p8.getxCoord(), p8.getyCoord(), p8.getHeight(), p8.getWidth(), this);
					Rectangle portal8 = new Rectangle(p8.getxCoord(), p8.getyCoord(), p8.getHeight(), p8.getWidth());
					if (portal8.contains(hero1.getxCoord()+100,hero1.getyCoord()+100)) {
						System.out.println("portal 8");
						if (badportal4 == 8) {
							hero1.setxCoord(0);
							hero1.setyCoord(-14);
						} else if (p7p8 == 8) {
							hero1.setxCoord(50);
							hero1.setyCoord(136);
						} else {
						hero1.setxCoord(950);
						hero1.setyCoord(586);
						}
					}
					g.drawImage(p9.getImg(), p9.getxCoord(), p9.getyCoord(), p9.getHeight(), p9.getWidth(), this);
					Rectangle portal9 = new Rectangle(p9.getxCoord(), p9.getyCoord(), p9.getHeight(), p9.getWidth());
					if (portal9.contains(hero1.getxCoord()+100,hero1.getyCoord()+100)) {
						int portal9rand = rand40.nextInt(6);
						if (portal9rand < 4) {
							hero1.setxCoord(500);
							hero1.setyCoord(436);
						} else if (portal9rand == 5) {
						hero1.setxCoord(400);
						hero1.setyCoord(286);
						} else if (portal9rand == 6) {
							hero1.setxCoord(20);
							hero1.setyCoord(-14);
						}
					}
					g.drawImage(p10.getImg(), p10.getxCoord(), p10.getyCoord(), p10.getHeight(), p10.getWidth(), this);
					Rectangle portal10 = new Rectangle(p10.getxCoord(), p10.getyCoord(), p10.getHeight(), p10.getWidth());
					if (portal10.contains(hero1.getxCoord()+100,hero1.getyCoord()+100)) {
						if (p10p14 == 0) {
							hero1.setxCoord(500);
							hero1.setyCoord(586);
						} else {
						hero1.setxCoord(550);
						hero1.setyCoord(436);
						}
					}
					g.drawImage(p11.getImg(), p11.getxCoord(), p11.getyCoord(), p11.getHeight(), p11.getWidth(), this);
					Rectangle portal11 = new Rectangle(p11.getxCoord(), p11.getyCoord(), p11.getHeight(), p11.getWidth());
					if (portal11.contains(hero1.getxCoord()+100,hero1.getyCoord()+100)) {
						hero1.setxCoord(20);
						hero1.setyCoord(-14);
					}
					g.drawString(Integer.toString(l4q1) + " " + l4qopstr + " " + Integer.toString(l4q2), 500, 550);
					if (l4qansside == 0) {
						g.drawString(Integer.toString(l4qanswer), p12.getxCoord() - 36, p12.getyCoord()+50);
						if (l4qfakeans == 0) {
						g.drawString(Integer.toString(l4qanswer + l4qfakeanschg), p13.getxCoord() + 121, p13.getyCoord()+50);
						} else {
						g.drawString(Integer.toString(l4qanswer - l4qfakeanschg), p13.getxCoord() + 121, p13.getyCoord()+50);
						}
					} else {
						g.drawString(Integer.toString(l4qanswer), p13.getxCoord() + 121, p13.getyCoord()+50);
						if (l4qfakeans == 0) {
							g.drawString(Integer.toString(l4qanswer + l4qfakeanschg), p12.getxCoord() - 36, p12.getyCoord()+50);
							} else {
							g.drawString(Integer.toString(l4qanswer - l4qfakeanschg), p12.getxCoord() - 36, p12.getyCoord()+50);
							}					}
					g.drawImage(p12.getImg(), p12.getxCoord(), p12.getyCoord(), p12.getHeight(), p12.getWidth(), this);
					Rectangle portal12 = new Rectangle(p12.getxCoord(), p12.getyCoord(), p12.getHeight(), p12.getWidth());
					if (portal12.contains(hero1.getxCoord()+100,hero1.getyCoord()+100)) {
						if (l4qansside == 0) {
							level = 5;
							telechargetime = 2500;
							TeleLimit = 2;
							godmode = false;
						} else {
							hero1.setxCoord(20);
							hero1.setyCoord(-14);
						}
					}
					g.drawImage(p13.getImg(), p13.getxCoord(), p13.getyCoord(), p13.getHeight(), p13.getWidth(), this);
					Rectangle portal13 = new Rectangle(p13.getxCoord(), p13.getyCoord(), p13.getHeight(), p13.getWidth());
					if (portal13.contains(hero1.getxCoord()+100,hero1.getyCoord()+100)) {
						if (l4qansside == 1) {
							level = 5;
							telechargetime = 2500;
							TeleLimit = 2;
							godmode = false;
						} else {
							hero1.setxCoord(20);
							hero1.setyCoord(-14);
						}
					}
					g.drawImage(p14.getImg(), p14.getxCoord(), p14.getyCoord(), p14.getHeight(), p14.getWidth(), this);
					Rectangle portal14 = new Rectangle(p14.getxCoord(), p14.getyCoord(), p14.getHeight(), p14.getWidth());
					if (portal14.contains(hero1.getxCoord()+100,hero1.getyCoord()+100)) {
						if (p10p14 == 1) {
							hero1.setxCoord(50);
							hero1.setyCoord(136);
						} else {
						hero1.setxCoord(550);
						hero1.setyCoord(436);
						}
					}
					
					
					g.drawImage(m41.getImg(), m41.getxCoord(), m41.getyCoord(), m41.getWidth(), m41.getHeight(), this);
					if ((System.currentTimeMillis()/1000 - ktimer) % 3 == 1) {
						if (m41power) {
							g.drawLine(-100, m1.getyCoord()+25, m1.getxCoord()+20, m1.getyCoord()+25);
							g.drawLine(-100, m1.getyCoord()+26, m1.getxCoord()+20, m1.getyCoord()+26);
							if (m1.getyCoord() - hero1.getyCoord() == 86) {
								if (powers == false) {
									if (!healthdecreased2) {
									health = health - 5;
									healthdecreased2 = true;
									}
								} else {
									m41power = false;
								}
							}
						}
					} else {
						healthdecreased2 = false;
					}
					Rectangle r41 = new Rectangle(m41.getxCoord(), m41.getyCoord()-33, m41.getWidth(), m41.getHeight()+39);
					if (r41.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
						
						health = health - 10;
						hero1.setxCoord(hero1.getxCoord() - 150);
					
					}
					
				} else if (level == 5) {
					
					if (levelcounter == 3) {
						hero1.setxCoord(0);
						hero1.setyCoord(286);
						movecount = 2;
						levelcounter++;
					}
					
					g.drawLine(s51.getxCoord()+25, -50, s51.getxCoord()+25, s51.getyCoord()+10);
					g.drawLine(s55.getxCoord()+25, -50, s55.getxCoord()+25, s55.getyCoord()+10);
					g.drawLine(s56.getxCoord()+25, -50, s56.getxCoord()+25, s56.getyCoord()+10);
					g.drawLine(s57.getxCoord()+25, -50, s57.getxCoord()+25, s57.getyCoord()+10);
					g.drawImage(s52.getImg(), s52.getxCoord(), s52.getyCoord(), s52.getWidth(), s52.getHeight(), this);
					g.drawImage(s53.getImg(), s53.getxCoord(), s53.getyCoord(), s53.getWidth(), s53.getHeight(), this);
					g.drawImage(s54.getImg(), s54.getxCoord(), s54.getyCoord(), s54.getWidth(), s54.getHeight(), this);
					g.drawImage(s51.getImg(), s51.getxCoord(), s51.getyCoord(), s51.getWidth(), s51.getHeight(), this);
					g.drawImage(s55.getImg(), s55.getxCoord(), s55.getyCoord(), s55.getWidth(), s55.getHeight(), this);
					g.drawImage(s56.getImg(), s56.getxCoord(), s56.getyCoord(), s56.getWidth(), s56.getHeight(), this);
					g.drawImage(s57.getImg(), s57.getxCoord(), s57.getyCoord(), s57.getWidth(), s57.getHeight(), this);
					g.drawImage(b51.getImg(), b51.getxCoord(), b51.getyCoord(), b51.getWidth(), b51.getHeight(), this);
					g.drawImage(m51.getImg(), m51.getxCoord(), m51.getyCoord(), m51.getWidth(), m51.getHeight(), this);
					if ((System.currentTimeMillis()/1000 - ktimer) % 3 == 1) {
						if (m51power) {
							g.drawLine(-100, m51.getyCoord()+25, m51.getxCoord()+20, m51.getyCoord()+25);
							g.drawLine(-100, m51.getyCoord()+26, m51.getxCoord()+20, m51.getyCoord()+26);
							if (m51.getyCoord() - hero1.getyCoord() == 86) {
								if (powers == false) {
									if (!healthdecreased) {
									health = health - 5;
									healthdecreased = true;
									}
								} else {
									m51power = false;
								}
							}
						}
					} else {
						healthdecreased = false;
					}
					g.drawImage(b52.getImg(), b52.getxCoord(), b52.getyCoord(), b52.getWidth(), b52.getHeight(), this);
					g.drawImage(b53.getImg(), b53.getxCoord(), b53.getyCoord(), b53.getWidth(), b53.getHeight(), this);
					g.drawImage(b54.getImg(), b54.getxCoord(), b54.getyCoord(), b54.getWidth(), b54.getHeight(), this);
					
					if (healthtonic) {
						if (health == 100) {
							g.drawString("You're doing great!", 133, 250);
						} else if (powercount == 0) {
							g.drawString("You're doing great! Take 10 free health!", 133, 250);
						} else {
							g.drawString("You're doing great and you still have left over powers! Take 15 free health!", 133, 250);
						}
					}
					
					Random rand50 = new Random();
					
					Rectangle r51 = new Rectangle(s51.getxCoord(), s51.getyCoord()-33, s51.getWidth(), s51.getHeight()+39);
					if (r51.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
						
						health = health - (rand50.nextInt(5) + 5);
						hero1.setxCoord(hero1.getxCoord() - 150);
					
					}
					Rectangle r55 = new Rectangle(s55.getxCoord(), s55.getyCoord()-33, s55.getWidth(), s55.getHeight()+39);
					if (r55.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
						
						health = health - (rand50.nextInt(5) + 5);
						hero1.setxCoord(hero1.getxCoord() - 150);
					
					}
					Rectangle r56 = new Rectangle(s56.getxCoord(), s56.getyCoord()-33, s56.getWidth(), s56.getHeight()+39);
					if (r56.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
						
						health = health - (rand50.nextInt(5) + 5);
						hero1.setxCoord(hero1.getxCoord() - 150);
					
					}
					Rectangle r57 = new Rectangle(s57.getxCoord(), s57.getyCoord()-33, s57.getWidth(), s57.getHeight()+39);
					if (r57.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
						
						health = health - (rand50.nextInt(5) + 5);
						hero1.setxCoord(hero1.getxCoord() - 150);
					
					}
					Rectangle r58 = new Rectangle(b51.getxCoord(), b51.getyCoord()-33, b51.getWidth(), b51.getHeight()+39);
					if (r58.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
						
						health = health - (rand50.nextInt(5) + 15);
						hero1.setxCoord(hero1.getxCoord() - 150);
					
					}
					Rectangle r59 = new Rectangle(b52.getxCoord(), b52.getyCoord()-33, b52.getWidth(), b52.getHeight()+39);
					if (r59.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
						
						health = health - (rand50.nextInt(5) + 15);
						hero1.setxCoord(hero1.getxCoord() - 150);
					
					}
					Rectangle r591 = new Rectangle(b53.getxCoord(), b53.getyCoord()-33, b53.getWidth(), b53.getHeight()+39);
					if (r591.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
					
						health = health - (rand50.nextInt(5) + 15);
						hero1.setxCoord(hero1.getxCoord() - 150);
					
					}
					Rectangle r592 = new Rectangle(b54.getxCoord(), b54.getyCoord()-33, b54.getWidth(), b54.getHeight()+39);
					if (r592.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
					
						health = health - (rand50.nextInt(5) + 15);
						hero1.setxCoord(hero1.getxCoord() - 150);
					
					}
					g.drawImage(p15.getImg(), p15.getxCoord(), p15.getyCoord(), p15.getHeight(), p15.getWidth(), this);
					Rectangle portal15 = new Rectangle(p15.getxCoord(), p15.getyCoord(), p15.getHeight(), p15.getWidth());
					if (portal15.contains(hero1.getxCoord()+100,hero1.getyCoord()+100)) {
						level = 6;
						telechargetime = 2500;
						TeleLimit = 2;
						godmode = false;
					}
				
				} else if (level == 6) {
					
					if (levelcounter == 4) {
						hero1.setxCoord(0);
						hero1.setyCoord(586);
						movecount = 0;
						levelcounter++;
					}
					
					if (presentation) {
						
						bossspeech1 = false;
						wave3 = true;
						deviceunlocked = true;
						deviceshow = true;
						
					}
					
					g.drawImage(boss.getImg(), boss.getxCoord(), boss.getyCoord(), boss.getWidth(), boss.getHeight(), this);
					if (deviceshow) {
						g.drawImage(device.getImg(), device.getxCoord(), device.getyCoord(), device.getWidth(), device.getHeight(), this);
					}
					if (bossspeech1) {
						g.drawString("Welcome to my castle in the sky. You're here to defeat me? My evil cannot be defeated!", 175, 50);
						try {
							Thread.sleep(3500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						g.drawString("I have captured some villagers. You can only free them with the device.", 175, 75);
						deviceshow = true;
						g.drawImage(device.getImg(), device.getxCoord(), device.getyCoord(), device.getWidth(), device.getHeight(), this);
						try {
							Thread.sleep(3500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						g.drawString("The device holds my power, protected by a puzzle.", 750, 50);
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						g.drawString("First, you must defeat my army. Good luck reaching the control switch...", 742, 75);
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bossspeech1 = false;
						wave1 = true;
						
					}
					
					Rectangle devicer = new Rectangle(device.getxCoord(), device.getyCoord()-33, device.getWidth(), device.getHeight()+39);
					if (devicer.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
						
						if (!deviceunlocked) {
						hero1.setxCoord(hero1.getxCoord() - 150);
						try {
							Thread.sleep(250);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						g.drawString("You must unlock the device first.", 750, 75);
						try {
							Thread.sleep(2250);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						} else {
							deviceactivated = true;
							wave3 = false;
						}
					
					}
					
					if (bossspeech2) {
						
						g.drawString("Impressive!", 175, 50);
						try {
							Thread.sleep(2500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						g.drawString("But you're not there yet.", 175, 75);
						deviceshow = true;
						g.drawImage(device.getImg(), device.getxCoord(), device.getyCoord(), device.getWidth(), device.getHeight(), this);
						try {
							Thread.sleep(2500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						g.drawString("Good luck getting past this next wave of stronger enemies.", 750, 50);
						try {
							Thread.sleep(2500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						g.drawString("Mwahahahahahahaha!", 750, 75);
						try {
							Thread.sleep(4500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bossspeech2 = false;
						wave2 = true;
						
					}
					
					if (bossspeech3) {
						
						g.drawString("What?!", 175, 50);
						try {
							Thread.sleep(2500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						g.drawString("How is this possible?", 175, 75);
						deviceshow = true;
						g.drawImage(device.getImg(), device.getxCoord(), device.getyCoord(), device.getWidth(), device.getHeight(), this);
						try {
							Thread.sleep(2500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						g.drawString("You have defeated me.", 750, 50);
						try {
							Thread.sleep(2500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						g.drawString("Noooooooooo!", 750, 75);
						try {
							Thread.sleep(4500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						g.drawString("Suddenly, you are teleported...", 500, 400);
						try {
							Thread.sleep(4000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bossspeech3 = false;
						
					}
					
					if (wave1) {
						
						Random rand50 = new Random();
						
						g.drawImage(s62.getImg(), s62.getxCoord(), s62.getyCoord(), s62.getWidth(), s62.getHeight(), this);
						g.drawImage(s63.getImg(), s63.getxCoord(), s63.getyCoord(), s63.getWidth(), s63.getHeight(), this);
						g.drawImage(s64.getImg(), s64.getxCoord(), s64.getyCoord(), s64.getWidth(), s64.getHeight(), this);
						g.drawImage(s61.getImg(), s61.getxCoord(), s61.getyCoord(), s61.getWidth(), s61.getHeight(), this);
						g.drawImage(b61.getImg(), b61.getxCoord(), b61.getyCoord(), b61.getWidth(), b61.getHeight(), this);
						g.drawImage(b62.getImg(), b62.getxCoord(), b62.getyCoord(), b62.getWidth(), b62.getHeight(), this);
						
						Rectangle r61 = new Rectangle(s61.getxCoord(), s61.getyCoord()-33, s61.getWidth(), s61.getHeight()+39);
						if (r61.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
							
							health = health - (rand50.nextInt(5) + 5);
							hero1.setxCoord(hero1.getxCoord() - 150);
						
						}
						
						Rectangle r68 = new Rectangle(b61.getxCoord(), b61.getyCoord()-33, b61.getWidth(), b61.getHeight()+39);
						if (r68.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
							
							health = health - (rand50.nextInt(5) + 15);
							hero1.setxCoord(hero1.getxCoord() - 150);
						
						}
						Rectangle r69 = new Rectangle(b62.getxCoord(), b62.getyCoord()-33, b62.getWidth(), b62.getHeight()+39);
						if (r69.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
							
							health = health - (rand50.nextInt(5) + 15);
							hero1.setxCoord(hero1.getxCoord() - 150);
						
						}
						Rectangle r62 = new Rectangle(s62.getxCoord(), s62.getyCoord()-33, s62.getWidth(), s62.getHeight()+39);
						if (r62.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
							
							health = health - (rand50.nextInt(5) + 5);
							hero1.setxCoord(hero1.getxCoord() - 150);
						
						}
						Rectangle r63 = new Rectangle(s63.getxCoord(), s63.getyCoord()-33, s63.getWidth(), s63.getHeight()+39);
						if (r63.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
							
							health = health - (rand50.nextInt(5) + 5);
							hero1.setxCoord(hero1.getxCoord() - 150);
						
						}
						Rectangle r64 = new Rectangle(s64.getxCoord(), s64.getyCoord()-33, s64.getWidth(), s64.getHeight()+39);
						if (r64.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
							
							health = health - (rand50.nextInt(5) + 5);
							hero1.setxCoord(hero1.getxCoord() - 150);
						
						}
						g.drawImage(switch1.getImg(), switch1.getxCoord(), switch1.getyCoord(), switch1.getWidth(), switch1.getHeight(), this);
						Rectangle switch1r = new Rectangle(switch1.getxCoord(), switch1.getyCoord()-33, switch1.getWidth(), switch1.getHeight()+39);
						if (switch1r.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
							
							bossspeech2 = true;
							wave1 = false;
						
						}
						
					}
					
					if (wave2) {
						
						Random rand62 = new Random();
						int healthdecrease62 = rand62.nextInt(4) + 7;
						g.drawImage(m61.getImg(), m61.getxCoord(), m61.getyCoord(), m61.getWidth(), m61.getHeight(), this);
						if ((System.currentTimeMillis()/1000 - ktimer) % 3 == 1) {
							if (m61power) {
								g.drawLine(-100, m61.getyCoord()+25, m61.getxCoord()+20, m61.getyCoord()+25);
								g.drawLine(-100, m61.getyCoord()+26, m61.getxCoord()+20, m61.getyCoord()+26);
								if (m61.getyCoord() - hero1.getyCoord() == 86) {
									if (powers == false) {
										if (!healthdecreased3) {
										health = health - healthdecrease62;
										healthdecreased3 = true;
										}
									} else {
										m61power = false;
									}
								}
							}
						} else {
							healthdecreased3 = false;
						}
						g.drawImage(m62.getImg(), m62.getxCoord(), m62.getyCoord(), m62.getWidth(), m62.getHeight(), this);
						if ((System.currentTimeMillis()/1000 - ktimer) % 3 == 0) {
							if (m62power) {
								g.drawLine(-100, m62.getyCoord()+25, m62.getxCoord()+20, m62.getyCoord()+25);
								g.drawLine(-100, m62.getyCoord()+26, m62.getxCoord()+20, m62.getyCoord()+26);
								if (m62.getyCoord() - hero1.getyCoord() == 86) {
									if (powers == false) {
										if (!healthdecreased4) {
										health = health - healthdecrease62;
										healthdecreased4 = true;
										}
									} else {
										m62power = false;
									}
								}
							}
						} else {
							healthdecreased4 = false;
						}
						g.drawImage(m63.getImg(), m63.getxCoord(), m63.getyCoord(), m63.getWidth(), m63.getHeight(), this);
						if ((System.currentTimeMillis()/1000 - ktimer) % 3 == 2) {
							if (m63power) {
								g.drawLine(-100, m63.getyCoord()+25, m63.getxCoord()+20, m63.getyCoord()+25);
								g.drawLine(-100, m63.getyCoord()+26, m63.getxCoord()+20, m63.getyCoord()+26);
								if (m63.getyCoord() - hero1.getyCoord() == 86) {
									if (powers == false) {
										if (!healthdecreased5) {
										health = health - healthdecrease62;
										healthdecreased5 = true;
										}
									} else {
										m63power = false;
									}
								}
							}
						} else {
							healthdecreased5 = false;
						}						
						g.drawImage(switch2.getImg(), switch2.getxCoord(), switch2.getyCoord(), switch2.getWidth(), switch2.getHeight(), this);
						Rectangle switch2r = new Rectangle(switch2.getxCoord(), switch2.getyCoord()-33, switch2.getWidth(), switch2.getHeight()+39);
						if (switch2r.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
							
							wave3 = true;
							wave2 = false;
							deviceunlocked = true;
						
						}
						
					}
					
					if (wave3) {
						
						
						g.drawImage(s62.getImg(), s62.getxCoord(), s62.getyCoord(), s62.getWidth(), s62.getHeight(), this);
						g.drawImage(s63.getImg(), s63.getxCoord(), s63.getyCoord(), s63.getWidth(), s63.getHeight(), this);
						g.drawImage(s64.getImg(), s64.getxCoord(), s64.getyCoord(), s64.getWidth(), s64.getHeight(), this);
						g.drawImage(s61.getImg(), s61.getxCoord(), s61.getyCoord(), s61.getWidth(), s61.getHeight(), this);
						g.drawImage(s65.getImg(), s65.getxCoord(), s65.getyCoord(), s65.getWidth(), s65.getHeight(), this);
						g.drawImage(s66.getImg(), s66.getxCoord(), s66.getyCoord(), s66.getWidth(), s66.getHeight(), this);
						g.drawImage(b61.getImg(), b61.getxCoord(), b61.getyCoord(), b61.getWidth(), b61.getHeight(), this);
						g.drawImage(b62.getImg(), b62.getxCoord(), b62.getyCoord(), b62.getWidth(), b62.getHeight(), this);
						g.drawImage(b63.getImg(), b63.getxCoord(), b63.getyCoord(), b63.getWidth(), b63.getHeight(), this);
						g.drawImage(b64.getImg(), b64.getxCoord(), b64.getyCoord(), b64.getWidth(), b64.getHeight(), this);
						
						if (!presentation) {
						
						Random rand50 = new Random();
						Rectangle r61 = new Rectangle(s61.getxCoord(), s61.getyCoord()-33, s61.getWidth(), s61.getHeight()+39);
						if (r61.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
							
							health = health - (rand50.nextInt(5) + 5);
							hero1.setxCoord(hero1.getxCoord() - 150);
						
						}
						Rectangle r65 = new Rectangle(s65.getxCoord(), s65.getyCoord()-33, s65.getWidth(), s65.getHeight()+39);
						if (r65.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
							
							health = health - (rand50.nextInt(5) + 5);
							hero1.setxCoord(hero1.getxCoord() - 150);
						
						}
						Rectangle r66 = new Rectangle(s66.getxCoord(), s66.getyCoord()-33, s66.getWidth(), s66.getHeight()+39);
						if (r66.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
							
							health = health - (rand50.nextInt(5) + 5);
							hero1.setxCoord(hero1.getxCoord() - 150);
						
						}
						Rectangle r62 = new Rectangle(s62.getxCoord(), s62.getyCoord()-33, s62.getWidth(), s62.getHeight()+39);
						if (r62.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
							
							health = health - (rand50.nextInt(5) + 5);
							hero1.setxCoord(hero1.getxCoord() - 150);
						
						}
						Rectangle r63 = new Rectangle(s63.getxCoord(), s63.getyCoord()-33, s63.getWidth(), s63.getHeight()+39);
						if (r63.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
							
							health = health - (rand50.nextInt(5) + 5);
							hero1.setxCoord(hero1.getxCoord() - 150);
						
						}
						Rectangle r64 = new Rectangle(s64.getxCoord(), s64.getyCoord()-33, s64.getWidth(), s64.getHeight()+39);
						if (r64.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
							
							health = health - (rand50.nextInt(5) + 5);
							hero1.setxCoord(hero1.getxCoord() - 150);
						
						}
						Rectangle r68 = new Rectangle(b61.getxCoord(), b61.getyCoord()-33, b61.getWidth(), b61.getHeight()+39);
						if (r68.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
							
							health = health - (rand50.nextInt(5) + 15);
							hero1.setxCoord(hero1.getxCoord() - 150);
						
						}
						Rectangle r69 = new Rectangle(b62.getxCoord(), b62.getyCoord()-33, b62.getWidth(), b62.getHeight()+39);
						if (r69.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
							
							health = health - (rand50.nextInt(5) + 15);
							hero1.setxCoord(hero1.getxCoord() - 150);
						
						}
						Rectangle r691 = new Rectangle(b63.getxCoord(), b63.getyCoord()-33, b63.getWidth(), b63.getHeight()+39);
						if (r691.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
						
							health = health - (rand50.nextInt(5) + 15);
							hero1.setxCoord(hero1.getxCoord() - 150);
						
						}
						Rectangle r692 = new Rectangle(b64.getxCoord(), b64.getyCoord()-33, b64.getWidth(), b64.getHeight()+39);
						if (r692.contains(hero1.getxCoord()+110, hero1.getyCoord()+110)) {
						
							health = health - (rand50.nextInt(5) + 15);
							hero1.setxCoord(hero1.getxCoord() - 150);
						
						}
						
						Random rand62 = new Random();
						int healthdecrease62 = rand62.nextInt(6) + 10;
						g.drawImage(m61.getImg(), m61.getxCoord(), m61.getyCoord(), m61.getWidth(), m61.getHeight(), this);
						if ((System.currentTimeMillis()/1000 - ktimer) % 3 == 1) {
							if (m61power) {
								g.drawLine(-100, m61.getyCoord()+25, m61.getxCoord()+20, m61.getyCoord()+25);
								g.drawLine(-100, m61.getyCoord()+26, m61.getxCoord()+20, m61.getyCoord()+26);
								if (m61.getyCoord() - hero1.getyCoord() == 86) {
									if (powers == false) {
										if (!healthdecreased3) {
										health = health - healthdecrease62;
										healthdecreased3 = true;
										}
									} else {
										m61power = false;
									}
								}
							}
						} else {
							healthdecreased3 = false;
						}
						
						if (deviceactivated) {
							
							wave3 = false;
							fqtimer = System.currentTimeMillis()/1000;
							
						}
						
					} }
					
					if (deviceactivated) {
						
						wave3 = false;
						fqtimer = System.currentTimeMillis()/1000;
						g.drawString(Integer.toString(fq1) + " " + fqopstr + " " + Integer.toString(fq2) + " = ?", 500, 550);
						if (fqansside == 0) {
							g.drawString("1. " + Integer.toString(fqanswer), 475, 570);
							g.drawString("2. " + Integer.toString(fqanswer + fqfakeanschg), 530, 570);
							g.drawString("3. " + Integer.toString(fqanswer - fqfakeanschg), 585, 570);
						} else if (fqansside == 1) {
							g.drawString("1. " + Integer.toString(fqanswer + fqfakeanschg), 475, 570);
							g.drawString("2. " + Integer.toString(fqanswer), 530, 570);
							g.drawString("3. " + Integer.toString(fqanswer - fqfakeanschg), 585, 570);
						} else {
							g.drawString("1. " + Integer.toString(fqanswer  - fqfakeanschg), 475, 570);
							g.drawString("2. " + Integer.toString(fqanswer + fqfakeanschg), 530, 570);
							g.drawString("3. " + Integer.toString(fqanswer), 585, 570);
						}
						g.drawString("Answer quickly, time affects your score.", 500, 600);
						
					}
					
					if (slowWin) {
						
						long TimeTaken = System.currentTimeMillis()/1000 - ktimer;
						long scorenew = ((300 - TimeTaken) / 2) + (powercount * 20) + health + 33;
						g.drawImage(background, 0, 0, 1200, 800, this);
						g.drawString("C O N G R A T U L A T I O N S", 550, 200);
						g.drawString("YOU WIN!!!", 575, 225);
						g.drawString("You took " + Long.toString(TimeTaken) + " seconds to complete the game.", 525, 250);
						g.drawString("Your final score: " + Long.toString(scorenew), 570, 275);
						try {
							Thread.sleep(290000000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					
					if (regWin) {
						
						long TimeTaken = System.currentTimeMillis()/1000 - ktimer;
						long scorenew = ((300 - TimeTaken) / 2) + (powercount * 20) + health + 100;
						g.drawImage(background, 0, 0, 1200, 800, this);
						g.drawString("C O N G R A T U L A T I O N S", 550, 200);
						g.drawString("YOU WIN!!!", 575, 225);
						g.drawString("You took " + Long.toString(TimeTaken) + " seconds to complete the game.", 525, 250);
						g.drawString("Your final score: " + Long.toString(scorenew), 570, 275);
						try {
							Thread.sleep(290000000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}

				}
				
			/////// 2 PLAYER ///////	
				
			} else if (puq == true) { 
				
				g.drawImage(puqimg, 0, 0, 1200, 800, this);
				
			} else if (gamemode.equals ("2 player")) {
			
			g.drawImage(background, 0, 0, 1200, 800, this);
			
			g.drawString(Integer.toString(hero1.getxCoord()) + "," + Integer.toString(hero1.getyCoord()), 15, 25);
			g.drawString(Integer.toString(hero2.getxCoord()) + "," + Integer.toString(hero2.getyCoord()), 1136, 25);
			if (powers2) {
				g.drawString("Powers: ON", 1111, 75);
			} else {
				g.drawString("Powers: OFF", 1111, 75);
			}
			if (pu1) {
				g.drawString("Power Up", 15, 95);
			} else if (pu2) {
				g.drawString("Power Up", 1125, 95);
			}
			if (KnivesThrown < KnifeLimit && stop == false) {
				g.drawString("Knives: " + Integer.toString(Math.abs(KnivesThrown - KnifeLimit)), 15, 75);
			} else if (KnivesThrown == KnifeLimit && recharging == true && stop == false) {
				g.drawString("Knives: Reloading", 15, 75);
			}
			
			/*long elapsedSeconds = (System.currentTimeMillis() - startTime) / 1000;
			
			if (elapsedSeconds < Timer + 1 && lose == false && stoptimer == false) {
				//g.drawString("Timer: " + (Long.toString(Math.abs((elapsedSeconds) - Timer))), 1050, 50);
			}*/
			
			if (moving == true) {
				g.drawImage(hero1.getImg(), hero1.getxCoord(), hero1.getyCoord(), hero1.getHeight(), hero1.getWidth(), this);
				g.drawImage(hero2.getImg(), hero2.getxCoord(), hero2.getyCoord(), hero2.getHeight(), hero2.getWidth(), this);
			} 
			for(int i = 0; i < badguys.size(); i++) {
				
				Badguy bg = (Badguy) badguys.get(i);
				g.drawImage(bg.getImg(), bg.getxCoord(), bg.getyCoord(), bg.getWidth(), bg.getHeight(), this);
				g.drawString("Bad Guys destroyed: " + Integer.toString(hero1kills), 15, 50);
				g.drawString("Bad Guys destroyed: " + Integer.toString(hero2kills), 1050, 50);
				
				for(int j = 0; j < knives.size(); j++) {
					
					Projectile k = (Projectile) knives.get(j);
					if (k.getxCoord() > 1180 || k.getxCoord() < -20) { knives.remove(k); }
					
					if (stop == false) {
					
					k.setxCoord(k.getxCoord()+1);
					g.drawImage(k.getImg(), k.getxCoord()+100, k.getyCoord()+55, k.getWidth(),k.getHeight(), this);
					
					Rectangle kr = new Rectangle(k.getxCoord(), k.getyCoord(), k.getWidth(),k.getHeight());
					
					if (kr.intersects(bg.getxCoord()+25,bg.getyCoord()-50,bg.getxCoord()+bg.getWidth()-5,bg.getyCoord()+bg.getHeight()-25)) {
						
						
						badguys.remove(i);
						knives.remove(j);
						hero1kills++;
						
						if (hero1kills == 6) {
							
							System.out.println("Congratualations, player 1! You win!");
							win = true;
							moving = false;
							playIt("files/win.wav");
							player1win = true;
							
						}
						
					} }
				
					repaint();
				
				} 
			
			}
			
			/*if (win == true && stoptimer == false) {
				
				g.drawString("Congratualations! You Win!", 500, 50);
				long FinalTimeLeft = Math.abs((elapsedSeconds) - Timer);
				stoptimer = true;
				long Score = FinalTimeLeft * 2 + Math.abs(KnivesThrown - KnifeLimit) * 3;
				g.drawString("Score: " + Long.toString(Score), 500, 100);
				
			} */
			
			if (hero1kills == 5 && hero2kills == 5) {
				
				draw = true;
				
			}
			
			if (bonus == true) {
				
				playIt("files/bonus.wav");
				g.drawString("Wow, you also got the bonus! Amazing!", 490, 75);
				stop = true;
				
			}
			
			if (player1win == true) {
				
				g.drawString("Congratulations, player 1! You win!", 500, 100);
				stop = true;
				
			}

			if (player2win == true) {
				
				g.drawString("Congratulations, player 2! You win!", 500, 100);
				stop = true;
				
			}
			
			/*if (elapsedSeconds == Timer + 1 && moving == true) {
				
				//lose = true;
				//playIt("files/lose.wav");
				//Timer = 999999;
				
			}*/
			
			if (draw == true) {
				
				g.drawString("It's a tie!", 500, 100);
				moving = false;
				stop = true;
				System.out.println("Sorry! You Lose!");
				
			} else {}}
			
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			//System.out.println(e);
			
			if (deviceactivated) {
				
				if (e.getKeyCode() == 49) {
					
					if (fqansside == 0) {
						
						if (System.currentTimeMillis()/1000 - fqtimer > 5) {
							
							slowWin = true;
							deviceactivated = false;
							bossspeech3 = true;

						} else {
							
							regWin = true;
							deviceactivated = false;
							bossspeech3 = true;
							
						}
					
					} else {
						
						lose = true;
						
					}
				
				} else if (e.getKeyCode() == 50) {
					
					if (fqansside == 1) {
						
						if (System.currentTimeMillis()/1000 - fqtimer > 5) {
							
							slowWin = true;
							deviceactivated = false;
							bossspeech3 = true;

						} else {
							
							regWin = true;
							deviceactivated = false;
							bossspeech3 = true;
							
						}
					
					} else {
						
						lose = true;
						
					}
				
				} else if (e.getKeyCode() == 51) {
					
					if (fqansside == 2) {
						
						if (System.currentTimeMillis()/1000 - fqtimer > 5) {
							
							slowWin = true;
							deviceactivated = false;
							bossspeech3 = true;

						} else {
							
							regWin = true;
							deviceactivated = false;
							bossspeech3 = true;
							
						}
					
					} else {
						
						lose = true;
						
					}
				
				}
				
			}
			
			if (musicselect) {
				
				if (e.getKeyCode() == 49) {
					soundtrack = "files/overdue.wav";
					musiclength = 166;
					selectedsong = "Overdue";
				} else if (e.getKeyCode() == 50) {
					soundtrack = "files/yosemite.wav";
					musiclength = 150;
					selectedsong = "Yosemite";
				} else if (e.getKeyCode() == 51) {
					soundtrack = "files/MarioMusic.wav";
					musiclength = 218;
					selectedsong = "Mario Music";
				} else if (e.getKeyCode() == 52) {
					soundtrack = "files/ZeldaMusic.wav";
					musiclength = 172;
					selectedsong = "Zelda Music";
				} else if (e.getKeyCode() == 53) {
					soundtrack = "files/MiiChannelMusic.wav";
					musiclength = 631;
					selectedsong = "Mii Channel Music";
				} else if (e.getKeyCode() == 54) {
					soundtrack = "files/SmashBrosMusic.wav";
					musiclength = 162;
					selectedsong = "Super Smash Bros Music";
				} else if (e.getKeyCode() == 55) {
					soundtrack = "files/WiiSportsMusic.wav";
					musiclength = 1800;
					selectedsong = "Wii Sports Music";
				}
				
			}
			
			if (gamemode.equals("1 player") && e.getKeyCode() == 32 && System.currentTimeMillis()/1000 - ktimer > musiclength) {
				playIt(soundtrack);
			} else if (gamemode.equals("2 player") && e.getKeyCode() == 32 && System.currentTimeMillis()/1000 - ktimer2 > musiclength) {
				playIt(soundtrack);
			}
			
			for(int i = 0; i < badguys.size(); i++) {
				
				Badguy bg = (Badguy) badguys.get(i);
				Rectangle r1 = new Rectangle(bg.getxCoord() - 100, bg.getyCoord() - 93, bg.getWidth() + 55, bg.getHeight() + 55);
				Rectangle r2 = new Rectangle(bg.getxCoord() - 175, bg.getyCoord() - 160, bg.getWidth() + 117, bg.getHeight() + 123);
				Rectangle r3 = new Rectangle(bg.getxCoord() - 177, bg.getyCoord() - 167, bg.getWidth() + 133, bg.getHeight() + 140);
				Rectangle r4 = new Rectangle(-100,-100,5000,5000); //test
				
				if (r1.contains(hero1.getxCoord(), hero1.getyCoord())) {
					
					if (powers == true) {
						
						System.out.println("badguy hit by hero");
						badguys.remove(i);
						hero1kills++;
						
					}
					
					if (hero1kills == 6) {
						
						System.out.println("Congratualations, player 1! You win!");
						win = true;
						moving = false;
						playIt("files/win.wav");
						player1win = true;
						
					}
					
				}  else if (r3.contains(hero2.getxCoord(), hero2.getyCoord()) && pu2) {
					
					if (powers2 == true) {
						
						System.out.println("badguy hit by hero2");
						badguys.remove(i);
						hero2kills++;
						
					}
					
					if (hero2kills == 6) {
						
						System.out.println("Congratualations, player 2! You win!");
						win = true;
						moving = false;
						playIt("files/win.wav");
						player2win = true;
						
					} else if (hero1kills == 5 && hero2kills == 5) {
						
						draw = true;
						
					}
					
				} else if (r3.contains(hero2.getxCoord(), hero2.getyCoord())) {
					
					if (powers2) {
						
						System.out.println("badguy hit by hero2!!");
						badguys.remove(i);
						hero2kills++;
						
					}
					
					if (hero2kills == 6) {
						
						System.out.println("Congratualations, player 2! You win!");
						win = true;
						moving = false;
						playIt("files/win.wav");
						player2win = true;
						
					}
					
				}
			
			}
			
			if (stop == false) {
				
				if (bgselect) {
					
					if (e.getKeyCode() == 49) {
						
						background = Toolkit.getDefaultToolkit().createImage("files/background.png");
						bgsel = 1;
						
					} else if (e.getKeyCode() == 50) {
						
						background = Toolkit.getDefaultToolkit().createImage("files/background2.png");
						bgsel = 2;
						
					} else if (e.getKeyCode() == 51) {
						
						background = Toolkit.getDefaultToolkit().createImage("files/background3.png");
						bgsel = 3;
						
					} else if (e.getKeyCode() == 52) {
						
						background = Toolkit.getDefaultToolkit().createImage("files/background4.png");
						bgsel = 4;
						
					}
					
				}
				
				if ((e.getKeyCode() == 88 || e.getKeyCode() == 67 || (e.getKeyCode() > 36 && e.getKeyCode() < 41)) && gamemode.equals("1 player")) {;
					if (level == 5 && healthtonic) {
						if (health == 75) {
							
						} else if (powercount > 0) {
							health = health + 15;
						} else {
							health = health + 10;
						}
						healthtonic = false;
					}
					
					movecount2++;
					if (movecount2 % smove == 0) {
						if (level == 1) {
							s2.moveIt(e.getKeyCode());
							s3.moveIt(e.getKeyCode());
						} else if (level == 2) {
							s22.moveIt(e.getKeyCode());
						} else if (level == 3) {
							s32.moveIt(e.getKeyCode());
							s33.moveIt(e.getKeyCode());
							s34.moveIt(e.getKeyCode());
						} else if (level == 5) {
							s52.moveIt(e.getKeyCode());
							s53.moveIt(e.getKeyCode());
							s54.moveIt(e.getKeyCode());
						} else if (level == 6) {
							if (wave1) {
								s62.moveIt(e.getKeyCode());
								s63.moveIt(e.getKeyCode());
								s64.moveIt(e.getKeyCode());
								s61.moveIt(e.getKeyCode());
							} else if (wave3) {
								s62.moveIt(e.getKeyCode());
								s63.moveIt(e.getKeyCode());
								s64.moveIt(e.getKeyCode());
								s61.moveIt(e.getKeyCode());
								s65.moveIt(e.getKeyCode());
								s66.moveIt(e.getKeyCode());
							}
						}
						Random rand = new Random();
						int smove = rand.nextInt(4) + 4;
					}
					if (movecount2 % bmove == 0) {
						if (level == 2) {
							b21.moveIt(e.getKeyCode());
						} else if (level == 3) {
							b31.moveIt(e.getKeyCode());
							b32.moveIt(e.getKeyCode());
							b33.moveIt(e.getKeyCode());
						} else if (level == 5) {
							b51.moveIt(e.getKeyCode());
							b52.moveIt(e.getKeyCode());
							b53.moveIt(e.getKeyCode());
							b54.moveIt(e.getKeyCode());
						} else if (level == 6) {
							if (wave1) {
								b61.moveIt(e.getKeyCode());
								b62.moveIt(e.getKeyCode());
							} else if (wave3) {
								b62.moveIt(e.getKeyCode());
								b63.moveIt(e.getKeyCode());
								b64.moveIt(e.getKeyCode());
								b61.moveIt(e.getKeyCode());
							}
						}
						Random rand = new Random();
						int smove = rand.nextInt(4) + 4;
					}
					if (e.getKeyCode() == 88) {	
						if (powercount > 0) {
							hero1.moveIt(e.getKeyCode());
							powers = true;
							powercount = powercount - 1;
							System.out.println("powers");	
						}
					} else {
						powers = false;
					}
					
				}
				
				if ((e.getKeyCode() == 88 && level == 2 && thenewcounter < 2) || (e.getKeyCode() > 36 && e.getKeyCode() < 41 && level == 2 && thenewcounter < 2) || (e.getKeyCode() == 67 && level == 2 && thenewcounter < 2)) {
					
					thenewcounter++;
					levelcounter = 1;
					
				}
				
				if (e.getKeyCode() == 67 && gamemode.equals("1 player") && level != 2 && level != 4) {
					
					if (TelesUsed != TeleLimit) {
						movecount++;
						playIt("files/teleportsfx.wav");
						System.out.println("teleport");	
						hero1.moveIt(e.getKeyCode());
						TelesUsed++;
					} else if (timerstarted == false) {
						telecharging = true;
						telechargetimer = System.currentTimeMillis();
						timerstarted = true;
					}
					
					if (telecharging) {
						
						if (System.currentTimeMillis() - telechargetimer > telechargetime) {
							telecharging = false;
							TelesUsed = 0;
							timerstarted = false;
						}
						
					}
				}
				
				if (e.getKeyCode() == 90 && gamemode.equals("1 player") && level != 2 && level != 4) {
					
					if (timerstarted == false && TelesUsed != 0) {
						TelesUsed = 2;
						telecharging = true;
						telechargetimer = System.currentTimeMillis();
						timerstarted = true;
					}
					
					if (telecharging) {
						
						if (System.currentTimeMillis() - telechargetimer > telechargetime) {
							telecharging = false;
							TelesUsed = 0;
							timerstarted = false;
						}
						
					}
					
				}
				
				if (puq == true) {
					
					if (puqnum == 1) {
						
						if (e.getKeyCode() == 49) {
							
							pu1 = true;
							puq = false;
							System.out.println("Player 1 Power Up");
							
						} else if (e.getKeyCode() == 55) {
							
							pu2 = true;
							puq = false;
							System.out.println("Player 2 power up");
							
						} else if ((System.currentTimeMillis() - newTime) > 500) {
							
							puq = false;
							
						}
						
					} else if (puqnum == 2) {
						
						if (e.getKeyCode() == 50) {
							
							pu1 = true;
							puq = false;
							System.out.println("Player 1 Power Up");
							
						} else if (e.getKeyCode() == 57) {
							
							pu2 = true;
							puq = false;
							System.out.println("Player 2 power up");
							
						} else if ((System.currentTimeMillis() - newTime) > 500) {
							
							puq = false;
							
						}
						
					} else if (puqnum == 3) {
						
						if (e.getKeyCode() == 51) {
							
							pu1 = true;
							puq = false;
							System.out.println("Player 1 Power Up");
							
						} else if (e.getKeyCode() == 56) {
							
							pu2 = true;
							puq = false;
							System.out.println("Player 2 power up");
							
						} else if ((System.currentTimeMillis() - newTime) > 500) {
							
							puq = false;
							
						}
						
					} else if (puqnum == 4) {
						
						if (e.getKeyCode() == 49) {
							
							pu1 = true;
							puq = false;
							System.out.println("Player 1 Power Up");
							
						} else if (e.getKeyCode() == 57) {
							
							pu2 = true;
							puq = false;
							System.out.println("Player 2 power up");
							
						} else if ((System.currentTimeMillis() - newTime) > 500) {
							
							puq = false;
							
						}
						
					} else if (puqnum == 5) {
						
						if (e.getKeyCode() == 50) {
							
							pu1 = true;
							puq = false;
							System.out.println("Player 1 Power Up");
							
						} else if (e.getKeyCode() == 55) {
							
							pu2 = true;
							puq = false;
							System.out.println("Player 2 power up");
							
						} else if ((System.currentTimeMillis() - newTime) > 500) {
							
							puq = false;
							
						}
						
					} else if (puqnum == 6) {
						
						if (e.getKeyCode() == 50) {
							
							pu1 = true;
							puq = false;
							System.out.println("Player 1 Power Up");
							
						} else if (e.getKeyCode() == 55) {
							
							pu2 = true;
							puq = false;
							System.out.println("Player 2 power up");
							
						} else if ((System.currentTimeMillis() - newTime) > 500) {
							
							puq = false;
							
						}
						
					} else if (puqnum == 7) {
						
						if (e.getKeyCode() == 50) {
							
							pu1 = true;
							puq = false;
							System.out.println("Player 1 Power Up");
							
						} else if (e.getKeyCode() == 57) {
							
							pu2 = true;
							puq = false;
							System.out.println("Player 2 power up");
							
						} else if ((System.currentTimeMillis() - newTime) > 500) {
							
							puq = false;
							
						}
						
					} else if (puqnum == 8) {
						
						if (e.getKeyCode() == 49) {
							
							pu1 = true;
							puq = false;
							System.out.println("Player 1 Power Up");
							
						} else if (e.getKeyCode() == 57) {
							
							pu2 = true;
							puq = false;
							System.out.println("Player 2 power up");
							
						} else if ((System.currentTimeMillis() - newTime) > 500) {
							
							puq = false;
							
						}
						
					} else if (puqnum == 9) {
						
						if (e.getKeyCode() == 51) {
							
							pu1 = true;
							puq = false;
							System.out.println("Player 1 Power Up");
							
						} else if (e.getKeyCode() == 55) {
							
							pu2 = true;
							puq = false;
							System.out.println("Player 2 power up");
							
						} else if ((System.currentTimeMillis() - newTime) > 500) {
							
							puq = false;
							
						}
						
					} else if (puqnum == 10) {
						
						if (e.getKeyCode() == 51) {
							
							pu1 = true;
							puq = false;
							System.out.println("Player 1 Power Up");
							
						} else if (e.getKeyCode() == 57) {
							
							pu2 = true;
							puq = false;
							System.out.println("Player 2 power up");
							
						} else if ((System.currentTimeMillis() - newTime) > 500) {
							
							puq = false;
							
						}
						
					}
					
				}
				
				if (e.getKeyCode() == 65 || e.getKeyCode() == 68 || e.getKeyCode() == 83 || e.getKeyCode() == 87 /*|| e.getKeyCode() == 32*/) {
					
					if (e.getKeyCode() == 32 && gamemode.equals("1 player")) {
						
					} else if (gamemode.equals("2 player") && puq == false) {
						
						hero1.moveIt(e.getKeyCode());
					
					} else if (e.getKeyCode() == 68 && gamemode.equals("2 player") && puq == false) {
						
						facingright = true;
						
					} else if (e.getKeyCode() == 65 && gamemode.equals("2 player") && puq == false) {
						
						facingright = false;
						System.out.println("facing left");
						
					}
					
				} else if (e.getKeyCode() > 36 && e.getKeyCode() < 41 || e.getKeyCode() == 10) {
					
					if (gamemode.equals("1 player")) {
						
						if (e.getKeyCode() == 37) {
							
							hero1.moveIt(e.getKeyCode());
							hero1.setImg("files/left.png");
							
						} else if (e.getKeyCode() == 39) {
							
							hero1.moveIt(e.getKeyCode());
							hero1.setImg("files/right.png");
							
						}	
							
						
					} else {
						
						hero2.moveIt(e.getKeyCode());
					
					}
					
				}
				
				/*if (e.getKeyCode() == 32 && gamemode.equals("2 player") && puq == false) {
					
					powers = true;
					playIt("files/attack.wav");
					
				}*/ 
				
				if (e.getKeyCode() == 10 && gamemode.equals("2 player") && puq == false && menu == false) {
					
					System.out.println("player 2 attack");
					powers2 = true;
					playIt("files/attack.wav");
				
				} else {
					
					if (gamemode.equals("2 player") && puq == false) {
						powers = false;
						powers2 = false;
					}
					
				}
			
			}
			
			///////
			
			repaint();
			
		}
		
		@Override
		public void keyTyped(KeyEvent e) {
			//System.out.println(e);
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
		
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
						
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
			if (gamemode.equals("2 player") && puq == false) {
				
				if (e.getButton() == 1 && KnivesThrown < KnifeLimit) {
					
					System.out.println("knife thrown");
					Projectile knife = new Projectile(hero1.getxCoord(),hero1.getyCoord(), 30, 30, "files/knife.png");
					knives.add(knife);
					KnivesThrown++;
					
				} else if (KnivesThrown == KnifeLimit && recharging == false) {
					
					startTime1 = System.currentTimeMillis();
					recharging = true;
					
				} else if (recharging == true && pu1 == true) {
					
					if ((System.currentTimeMillis() - startTime1)/100 > 13) {
						
						KnivesThrown = 0;
						recharging = false;
					
					} else {
						
						System.out.println("knives still recharging");
						
					}
					
				} else if (recharging == true) {
					
					if ((System.currentTimeMillis() - startTime1)/100 > 22) {
						
						KnivesThrown = 0;
						recharging = false;
					
					} else {
						
						System.out.println("knives still recharging");
						
					}
					
				}
				
			}
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}