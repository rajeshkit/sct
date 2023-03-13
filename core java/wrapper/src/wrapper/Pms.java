package wrapper;

import java.util.Scanner;

public class Pms {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of players");
		int noOfPlayers=s.nextInt();
		Player[] playerList=new Player[3];
		for (int i = 0; i < noOfPlayers; i++) {
			Player p=new Player();
			
			System.out.println("Enter player Id");
			p.setPlayerId(s.nextInt());
			System.out.println("Enter player runs");
			p.setRuns(s.nextInt());
			s.nextLine();
			System.out.println("Enter player name");
			p.setPlayerName(s.nextLine());
			
			playerList[i]=p;
			
		}
		for (int i = 0; i < playerList.length; i++) {
			System.out.println(playerList[i].getPlayerId());
			System.out.println(playerList[i].getPlayerName());
			System.out.println(playerList[i].getRuns());
			
		}
		s.close();
	}
}
