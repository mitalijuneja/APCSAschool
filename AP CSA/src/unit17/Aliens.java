package unit17;

public class Aliens {
	Alien[][] aliens;
	
	public Aliens()
	{
		aliens = new Alien[2][2];
		Alien a1 = new Alien (150, 50, 1);
		Alien a2 = new Alien (150, 150, 1);
		Alien a3 = new Alien (350, 50, 1);
		Alien a4 = new Alien (350, 150, 1);
		aliens[0][0] = a1;
		aliens[0][1] = a2;
		aliens[1][0] = a3;
		aliens[1][1] = a4;
	}
	
	public Alien[][] getAliens()
	{
		return aliens;
	}

}
