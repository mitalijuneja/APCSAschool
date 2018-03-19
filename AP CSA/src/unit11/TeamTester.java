package unit11;

public class TeamTester {
	public static void main(String[] args)
	{
		Team test = new Team ("test Team", 2);
		test.addPlayer(0, new Player("player1", "4 - 10 12 9 8"));
		test.addPlayer(1, new Player("player2", "4 - 1 1 2 2")); 
		
		System.out.println(test);
		System.out.println("team average = " + test.teamAverage());
		System.out.println("best player's average = " + test.bestPlayerAverage());
	}

}
