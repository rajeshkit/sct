package com.pms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.pms.model.Player;

public class PlayerDao {
	public int insertPlayer(Player player) {
		String url="jdbc:mysql://localhost:3306/TCS";
		String user="root";
		String password="root@123";
		String sql="INSERT INTO player VALUES(?,?,?,?)";
		int status=0;
		try(Connection con=DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt=con.prepareStatement(sql)) {
			pstmt.setInt(1, player.getJersyNo());
			pstmt.setString(2, player.getPlayerName());
			pstmt.setString(3, player.getTeamName());
			pstmt.setInt(4, player.getRuns());
			status = pstmt.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	
	}
	public ArrayList<Player> getAllPlayers() {
		return null;
		
	}
	public Player getPlayerByJerseyNumber(int jerseyNumber) {
		String url="jdbc:mysql://localhost:3306/TCS";
		String user="root";
		String password="root@123";
		String sql="SELECT * FROM player WHERE jersy_no=?";
		Player foundPlayer=null;
		try(Connection con=DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt=con.prepareStatement(sql)) {
			pstmt.setInt(1, jerseyNumber);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				foundPlayer=new Player();
				foundPlayer.setJersyNo(rs.getInt(1));
				foundPlayer.setPlayerName(rs.getString(2));
				foundPlayer.setTeamName(rs.getString(3));
				foundPlayer.setRuns(rs.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return foundPlayer;
		
	}
	public int deletePlayerByJersyNumber(int jersyNumber) {
		return 0;
		
	}
	public int updatePlayer(Player p) {
		return 0;
		
	}

}
