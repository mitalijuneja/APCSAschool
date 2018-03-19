package unit11;

public class ScoresTester {
	public static void main(String[] args)
	{
		Scores testData = new Scores ("4 - 10 12 9 8");
		System.out.println(testData);
		System.out.println("Average Score = " + testData.getAverageScore());
	}
}
