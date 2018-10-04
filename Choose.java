import java.util.Scanner;

public class Choose {
	public static void main(String [] args) {
		boolean lightson = false;
		System.out.println("You enter a strange, dark room. The door closes behind you, locking soon after. It is dimly lit, but you can see a chandelier. You look for a light switch, but cannot find one. What will you do next? (Look, Try Door)");
		Scanner first = new Scanner(System.in);
		String firststring = first.nextLine();
		if (firststring.equals("Try Door")) {
			System.out.println("You charge at the door with all your might. It budges a little, but you cannot open it. Sunddenly, you hear something drop, a remote control switch. You flick it and the lights turn on. There is a computer laying on a desk. You can also see a nightstand. What will you do? (Computer, Nightstand)");
			Scanner newest = new Scanner(System.in);
			String neweststring = newest.nextLine();
			if (neweststring.equals("Computer")) {
				System.out.println("The screen of the computer illuminates as you approach it. The screen reads 'Here so soon?' The door swings open behind you. Your time is up.");
			} else {
				if (neweststring.equals("Nightstand")) {
					System.out.println("You walk away from the door, but not quickly enough. Someone has heard you. The door swings open behind you. Your time is up.");
				} else {
					System.out.println("Please respond with one of the given answers. Restart the program.");
					return; }
			}
		} else {
			if (firststring.equals("Look")) {
				System.out.println("You can make out a a nightstand with nothing on it. It also contains a drawer. When you open it you can barely see inside. What will you do? (Reach, Door)");
				Scanner second = new Scanner(System.in);
				String secondstring = second.nextLine();
				if (secondstring.equals("Door")) {
					System.out.println("You charge at the door with all your might. It budges a little, but you cannot open it. Sunddenly, you hear something drop, a remote control switch. You flick it and the lights turn on. You look around the room and see a drawer. You open the drawer and see spikes all surrounding a slip of paper with the word 'Helloworld' on it. What will you do next? (Look more, Turn off lights)");
					lightson = true;
					Scanner third = new Scanner(System.in);
					String thirdstring = second.nextLine();
					if (thirdstring.equals("Turn off lights")) {
						System.out.println("Smart move. You hear someone outside, but you're still hidden. You find a computer in the darkness and boot it up. It reads 'Enter password to open hidden door:");
						lightson = false;
						Scanner last = new Scanner(System.in);
						String laststring = last.nextLine();
						if (laststring.equals("Helloworld")) {
							System.out.println("You see a panel open up on a wall. You climb through it and escape. Congratualations! You win!");
						} else {
							System.out.println("The computer read 'Wrong answer!' Suddenly, the door swings open. Someone is here. Your time is up. Try again...");
							return; }
					} else {
						if (thirdstring.equals("Look more")) {
							System.out.println("You look around more, but suddenly, the door swings open. Someone is here. Your time is up. Try again...");
							return;
						} else {
							System.out.println("Please respond with one of the given answers. Restart the program.");
							return; }
						}
				} else {
					if (secondstring.equals("Reach")) {
						System.out.println("You reach your hand in and you feel something... spiky? You pull your hand back and examine it in the dim light. At least, you try to examine it, but don't see anything. There's nothing where your hand used to be. Suddenly, blood gushes out and you bleed to death. Better luck next time.");
						return;
					} else {
						System.out.println("Please respond with one of the given answers. Restart the program.");
						return; }}
			} else {
				System.out.println("Please respond with one of the given answers. Restart the program.");
				return; }}
	}
}