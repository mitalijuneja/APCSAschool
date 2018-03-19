package unit11;

public class League {

	private String leagueName;
	private Team[] teams;
	
	public League()
	{
		setLeagueName("");
		teams = new Team[0];
	}
	
	public League(String name, int numTeams)
	{
		setLeagueName(name);
		teams = new Team[numTeams];
	}
	
	public void setLeagueName(String name)
	{
		leagueName = name;
	}
	
	public String getLeagueName()
	{
		return leagueName;
		
	}
	
	public void addTeam(int teamNum, Team t)
	{
		teams[teamNum] = t;
	}
	
	public double getTeamAvg(int teamNum)
	{
		double average = teams[teamNum].teamAverage();
		
		return average;
	}
	
	public double getBestTeamAvg()
	{
		double average = getTeamAvg(0);
		for (int i = 1; i < teams.length; i++)
		{
			if (getTeamAvg(i) > average)
			{
				average = getTeamAvg(i);
			}
		}
		
		return average;
	}
	
	public String toString()
	{
		String output = "";
		output = leagueName;
		return output;
	}
}
