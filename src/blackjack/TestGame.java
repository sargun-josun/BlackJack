package blackjack;

import java.util.Scanner;


public class TestGame 
{
    public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String playerName;
		System.out.println("Enter Your Name:");
		playerName = scanner.nextLine();
		Game g =new Game(playerName);
	
	}
}
