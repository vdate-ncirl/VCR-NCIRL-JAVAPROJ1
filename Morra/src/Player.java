public abstract class Player {
	private String playerName;
	private int playAsType;
	private int points;
	
	public Player (String playerName) {
	this.playerName = playerName; 
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName; 
	}
	
	public String getPlayerName(){
		return playerName;
	}
	
	public void setPlayAsType (int playAsType) {
		this.playAsType = playAsType;
	}

	public int getPlayAsType(){
		return playAsType;
	}
	
	public void addPoints(int points) {
		this.points += points; 
	}
	
	public int getPoints() {
		return points;
	}
	
	abstract int Play();
}
