package unit11;

public class Player {
	
	private String playerName;
	private Scores gameScores;
	
	public Player()
	{
		setName("");
		setScoresArr("");
	}
	
	public Player(String name, String scores)
	{
		setName(name);
		setScoresArr(scores);
	}
	
	public void setName(String name)
	{
		playerName = name;
	}
	
	public void setScoresArr(String scores)
	{
		Scores myScores = new Scores(scores);
		gameScores = myScores;
	}
	
	public String getName()
	{
		return playerName;
	}
	
	public Scores getScores()
	{
		return gameScores;
	}
	
	public double getAverageScore()
	{
		double average = gameScores.getAverageScore();
		return average;
	}
	
	public String toString()
	{
		String output = "";
		output = playerName+ "\'s Scores = " + gameScores;
		return output;
	}

}
