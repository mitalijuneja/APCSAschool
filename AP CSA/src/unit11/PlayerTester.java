package unit11;

public class PlayerTester {
	public static void main(String[] args)
	{
		Player newPlayer = new Player("player1", "4 - 10 12 9 8");
		
		System.out.println(newPlayer);
		System.out.println("average score = " + newPlayer.getAverageScore());
		
	}

}
