import java.util.*;
public class VirtualPlayer extends Player {

	public VirtualPlayer(String playerName) {
		super(playerName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int Play() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int playerInp = rand.nextInt(10) + 1;
		return playerInp;
		}
	
	@Override
	public void setPlayAsType(int playAsType ) {
		super.setPlayAsType(playAsType);
	}
}
