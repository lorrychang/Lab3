package pkgPokerBLL;

import java.util.ArrayList;
import java.util.UUID;

public class Game {
	private UUID GameID;
	private UUID TableID;
	
	ArrayList<Player> GamePlayers = new ArrayList<Player>();


	public UUID getGameID() {
		return GameID;
	}


	public void setGameID(UUID gameID) {
		GameID = gameID;
	}


	public UUID getTableID() {
		return TableID;
	}


	public void setTableID(UUID tableID) {
		TableID = tableID;
	}
	
	public void AddPlayerToGame(UUID TableID, UUID PlayerID){
		
		
	}
}
