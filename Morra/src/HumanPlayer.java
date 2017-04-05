import java.util.Random;

public class HumanPlayer extends Player {

	public HumanPlayer(String playerName) {
		// TODO Auto-generated constructor stub
		super(playerName);
	}

	@Override
	public int Play() {
		// TODO Auto-generated method stub This is just stub implement using Scanner
		Random rand = new Random();
		int playerInp = rand.nextInt(10) + 1;
		return playerInp;
	}
}
