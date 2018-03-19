package unit11;
import static java.lang.System.out;

import java.util.Scanner;

public class Scores {
	
	private int[] scores;
	
	public Scores()
	{
		scores = new int[0];
	}
	
	public Scores(String s)
	{

		
		

		
		Scanner chop = new Scanner(s);
		int numScores = chop.nextInt();
		s = s.substring(s.indexOf("-") + 2);
		scores = new int[numScores];
		
		Scanner chop2 = new Scanner(s);
		for (int i = 0; i < scores.length; i++)
		{
			int score = chop2.nextInt();
			setScore(i, score);
		}
		
	}
	
	public void setScore(int index, int score)
	{
		scores[index] = score;
	}
	
	public double getAverageScore()
	{
		double average = 0;
		for (int s: scores)
		{
			average = average + s;
		}
		average = average/scores.length;
		
		return average;
		
	}
	public String toString()
	{
		String output = "";
		for (int s: scores)
		{
			output = output + s + " ";
		}
		
		return output;
	}
	
	

}
