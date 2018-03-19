package unit11;

public class Team {
	private String teamName;
	private Player[] players;
	
	public Team()
	{
		setName("");
		players = new Player[0];
	}
	
	public Team(String name, int numPlayers)
	{
		setName(name);
		players = new Player[numPlayers];
		
	}
	
	public void setName(String name)
	{
		teamName = name;
	}
	
	public void addPlayer(int playerNum, Player player)
	{
		players[playerNum] = player;
	}
	
	public String getTeamName()
	{
		return teamName;
	}
	
	public double teamAverage()
	{
		double average = 0;
		for (int i = 0; i < players.length; i++)
		{
			average = average + players[i].getAverageScore();
		}
		average = average/players.length;
		
		return average;
	}
	
	public double playerAverage(int playerNum)
	{
		double average = players[playerNum].getAverageScore();
		return average;
	}
	
	public double bestPlayerAverage()
	{
		double highestAverage = 0;
		for (int i = 0; i < players.length; i++)
		{
			if (playerAverage(i) > highestAverage)
			{
				highestAverage = playerAverage(i);
			}
		}
		
		return highestAverage;
	}
	
	public String toString()
	{
		String output = "";
		output = teamName;
		
		return output;
	}
	
	

}
