package com.pms.main;

import java.util.Scanner;

import com.pms.dao.PlayerDao;
import com.pms.model.Player;

public class PlayerMain {
	public static void main(String[] args) {
		// addPlayer();
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome search player");
		System.out.println("Enter the player jersey number you want search");
		int jNo = s.nextInt();
		PlayerDao pdao = new PlayerDao();

		Player p = pdao.getPlayerByJerseyNumber(jNo);
		if (p != null) {
			System.out.println(p.getJersyNo());
			System.out.println(p.getPlayerName());
			System.out.println(p.getTeamName());
			System.out.println(p.getRuns());
		}else {
			System.out.println("Player Jersey number Does not Exists");
		}
	}

	public static void addPlayer() {
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome player registration");
		System.out.println("Enter the player jersey number");
		int jNo = s.nextInt();
		s.nextLine();
		System.out.println("Enter the player name");
		String pName = s.nextLine();
		System.out.println("Enter the player team name");
		String tName = s.nextLine();
		System.out.println("Enter the player total runs");
		int tRuns = s.nextInt();

		Player p = new Player();
		p.setJersyNo(jNo);
		p.setPlayerName(pName);
		p.setTeamName(tName);
		p.setRuns(tRuns);

		PlayerDao pdao = new PlayerDao();
		pdao.insertPlayer(p);

		s.close();
	}
}
