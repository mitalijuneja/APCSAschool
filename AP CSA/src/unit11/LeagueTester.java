package unit11;

public class LeagueTester {
	public static void main(String[] args)
	{
		League leagueTest = new League ("test League", 2);
		Team test = new Team ("test Team", 2);
		test.addPlayer(0, new Player("player1", "4 - 10 12 9 8"));
		test.addPlayer(1, new Player("player2", "4 - 1 1 2 2")); 
		
		Team test2 = new Team ("test Team2", 2);
		test2.addPlayer(0, new Player("player1", "4 - 1 1 1 1"));
		test2.addPlayer(1, new Player("player2", "4 - 5 5 5 5")); 
		
		leagueTest.addTeam(0, test);
		leagueTest.addTeam(1, test2);
		
		System.out.println("best team's average = " + leagueTest.getBestTeamAvg());
	}

}
