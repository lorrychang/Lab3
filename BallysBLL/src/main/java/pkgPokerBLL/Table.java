package pkgPokerBLL;

import java.util.HashMap;
import java.util.UUID;

public class Table {

	private UUID TableID;
	
	
	HashMap<Player, UUID> TablePlayers = new HashMap<Player, UUID>();
	
	public Table() {
		super();
		setTableID(UUID.randomUUID());
	}
	
	public Table AddPlayerToTable(Player p)
	{	
		TablePlayers.put(p, TableID);
		return this;
	}
	
	public Table RemovePlayerFromTable(Player p)
	{
		TablePlayers.remove(p, TableID);
		return this;
	}

	public UUID getTableID() {
		return TableID;
	}

	public void setTableID(UUID tableID) {
		TableID = tableID;
	}
}
