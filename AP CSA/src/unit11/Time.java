package unit11;

public class Time {
	long hour;
	long minute;
	long second;
	
	public Time()
	{
		setTime(System.currentTimeMillis());	
	}
	
	public Time(long milliseconds)
	{
		setTime(milliseconds);
	}

	public Time (int hour, int minute, int second)
	{
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public long getHour ()
	{
		return hour;
	}
	
	public long getMinute()
	{
		return minute;
	}
	
	public long getSecond()
	{
		return second;
	}
	
	public void setTime(long elapsedTime)
	{
		long totalSeconds = elapsedTime/1000;
		second = totalSeconds % 60;
		
		long totalMinutes = totalSeconds/60;
		minute = totalMinutes % 60;
		
		long totalHours = totalMinutes/60;
		hour = totalHours%24;
	}
	public String toString()
	{
		String output = hour + ":" + minute + ":" + second;
		return output;
	}
	public static void main(String[] args)
	{
		Time myTime = new Time();
		myTime.setTime (555550000);
		System.out.println(myTime);
	}
}


