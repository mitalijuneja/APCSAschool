package unit14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;

	public Maze()
	{
		maze = new int[0][0];

	}

	public Maze(int size, String line)
	{
		maze = new int[size][size];
		Scanner chopper = new Scanner(line);
		for (int i = 0; i < maze.length; i++)
		{
			for (int j = 0; j < maze[i].length; j++)
			{
				maze[i][j] = chopper.nextInt();
			}
		}
		
		for (int i = 0; i < maze.length; i++)
		{
			for (int j = 0;j < maze[i].length; j++)
			{
				System.out.print(maze[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	public boolean hasExitPath(int r, int c)
	{
		//int count = 0;
		if (((r >= 0 && r < maze.length) && (c >= 0 && c < maze[r].length) )&& (maze[r][c] ==1))
		{
			maze[r][c] = 2;
		
			
			if (c == maze[r].length - 1)
			{
				return true;
			}
			
			else
			{
				if (c - 1 >= 0)
				{
					if (hasExitPath(r, c-1))
					{
						return true;
					}
				}
				
				if (c + 1 < maze[r].length)
				{
					if (hasExitPath(r,c+1))
					{
						return true;
					}
				}
				
				if (r - 1 >= 0)
				{
					if (hasExitPath(r-1, c))
					{
						return true;
					}
				}
				
				if (r + 1 < maze.length)
				{
					if(hasExitPath(r+1, c))
					{
						return true;
					}
				}
			}
		}
			
		
		return false;
	}

	public String toString()
	{
		String output="";
		

		if (hasExitPath(0,0))
		{
			output = "exit found";
		}
		else
		{
			output = "exit not found";
		}


		return output;
	}
}