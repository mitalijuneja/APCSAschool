package picturelab;

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void keepOnlyBlue()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (int r = 0; r < pixels.length; r++)
	  {
		  for (int c = 0; c < pixels[r].length; c++)
		  {
			  pixels[r][c].setGreen(0);
			  pixels[r][c].setRed(0);
		  }
	  }
  }
  
  public void negate()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (int r = 0; r < pixels.length; r++)
	  {
		  for (int c = 0; c < pixels[r].length; c++)
		  {
			  pixels[r][c].setGreen(255 - pixels[r][c].getGreen());
			  pixels[r][c].setBlue(255 - pixels[r][c].getBlue());
			  pixels[r][c].setRed(255 - pixels[r][c].getRed());
		  }
	  }
  }
  
  public void grayscale()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (int r = 0; r < pixels.length; r++)
	  {
		  for (int c = 0; c < pixels[r].length; c++)
		  {
			 int average = (pixels[r][c].getRed() + pixels[r][c].getBlue() + pixels[r][c].getGreen())/3;
			 pixels[r][c].setGreen(average);
			 pixels[r][c].setBlue(average);
			 pixels[r][c].setRed(average);
		  }
	  }
  }
  
  public void fixUnderwater()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (int r = 0; r < pixels.length; r++)
	  {
		  for (int c = 0; c < pixels[r].length; c++)
		  {
			  pixels[r][c].setRed(pixels[r][c].getRed() * 5);
		  }
	  }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorVerticalRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }
  
  
  public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int height = pixels.length;
    for (int row = 0; row < height/2; row++)
    {
      for (int col = 0; col < pixels[row].length; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[height - 1 - row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontalBotToTop()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    Pixel topPixel = null;
	    Pixel bottomPixel = null;
	    int height = pixels.length;
	    for (int row = 0; row < height/2; row++)
	    {
	      for (int col = 0; col < pixels[row].length; col++)
	      {
	        topPixel = pixels[row][col];
	        bottomPixel = pixels[height - 1 - row][col];
	        topPixel.setColor(bottomPixel.getColor());
	      }
	    }  
  }
  
  public void mirrorDiagonal()
  {
	  Pixel[][] pixels =  this.getPixels2D();
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  /*int smaller = pixels.length;
	  if (smaller > pixels[0].length)
	  {
		  smaller = pixels[0].length;
	  }*/
	  int height = pixels.length;
	  int width = pixels[0].length;
	  
	  if (height < width)
	  {
		  
		  for (int row = 0; row < height; row++ )
		  {
			  for (int col = 0; col <=row; col++)
			  {
				  leftPixel = pixels[row][col];
				  System.out.println("r" + row);
				  System.out.println(col);
				  rightPixel = pixels[col][row];
				  rightPixel.setColor(leftPixel.getColor());
			  }
		  }
	  }
	  else 
	  {
		  
		  
		  for (int row = 0; row < width; row++)
		  {
			  for (int col = 0; col <= row; col++)
			  {
				  leftPixel = pixels[row][col];
				  rightPixel = pixels[col][row];
				  rightPixel.setColor(leftPixel.getColor());
			  }
		  }
	  }
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
	
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        count++;
      }
    }
    
    System.out.println("Count = " + count);
  }
  
  public void mirrorArms()
  {
	  //columns = 106 to 170
	  //rows = 159 to 194
	  
	  int mirrorPoint = 195;
	  Pixel topPixel = null;
	  Pixel bottomPixel = null;
	  Pixel[][] pixels = this.getPixels2D();
	  
	  for (int row = 159; row < mirrorPoint; row++)
	  {
		  for (int col = 106; col < 171; col++)
		  {
			  topPixel = pixels[row][col];
			  bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
			  bottomPixel.setColor(topPixel.getColor());
		  }
	  }
	  
	  //columns = 239 to 291
	  //rows = 173 to 195
	  mirrorPoint = 196;
	  
	  for (int row = 173; row < mirrorPoint; row++)
	  {
		  for (int col = 239; col < 292; col++)
		  {
			  topPixel = pixels[row][col];
			  bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
			  bottomPixel.setColor(topPixel.getColor());
		  }
	  }
  }
  
  public void mirrorGull()
  {
	  //columns = 240 to 343
	  //rows = 235 to 323
	  
	  int mirrorPoint = 344;
	  Pixel rightPixel = null;
	  Pixel leftPixel = null;
	  Pixel[][] pixels = this.getPixels2D();
	  for (int row = 235; row < 323; row++)
	  {
		  for (int col = 240; col < mirrorPoint; col++)
		  {
			  leftPixel = pixels[row][col];
			  rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
			  rightPixel.setColor(leftPixel.getColor());
		  }
	  }
  }
  
  
  public void copy(Picture fromPic, 
          int startRowTo, int startColTo, int startRowFrom, int startColFrom, int endRowFrom, int endColFrom )
{
Pixel fromPixel = null;
Pixel toPixel = null;
Pixel[][] toPixels = this.getPixels2D();
Pixel[][] fromPixels = fromPic.getPixels2D();
for (int fromRow = startRowFrom, toRow = startRowTo; 
  fromRow < endRowFrom &&
  toRow < toPixels.length; 
  fromRow++, toRow++)
{
for (int fromCol = startColFrom, toCol = startColTo; 
    fromCol < endColFrom &&
    toCol < toPixels[0].length;  
    fromCol++, toCol++)
{
 fromPixel = fromPixels[fromRow][fromCol];
 toPixel = toPixels[toRow][toCol];
 toPixel.setColor(fromPixel.getColor());
}
}   
}
  
  public void myCollage()
  {
	  Picture picture1 = new Picture ("beach.jpg");
	  Picture picture2 = new Picture ("seagull.jpg");
	  Picture picture3 = new Picture ("swan.jpg");
	  
	  Picture picture1Blue = new Picture(picture1);
	  picture1Blue.keepOnlyBlue();
	  
	  Picture picture2NoBlue = new Picture (picture2);
	  picture2NoBlue.zeroBlue();
	  
	  Picture picture3Negate = new Picture (picture3);
	  picture3Negate.negate();
	  
	  this.copy(picture1Blue, 0, 0);
	  this.copy(picture2NoBlue, 100, 0);
	  this.copy(picture3Negate, 200, 0);
	  
	  this.mirrorHorizontal();
	  
	  this.write("myCollage.jpg");
  }
  
  

  
  public void edgeDetection2 (double difference)
  {
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  Pixel topPixel = null;
	  Pixel bottomPixel = null;
	  
	  
	  Pixel[][] pixels = this.getPixels2D();
	  double upperLimit = 1 + difference;
	  double lowerLimit = 1 - difference;
	  
	  int leftR, rightR, leftG, rightG, leftB, rightB;
	  
	  int topR, botR, topG, botG, topB, botB;
	  
	  for (int row = 0; row < pixels.length; row++)
	  {
		  for (int col = 0; col < pixels[0].length - 1; col++)
		  {
			  leftPixel = pixels[row][col];
			  rightPixel = pixels[row][col + 1];
			  
			  leftR = leftPixel.getRed();
			  leftG = leftPixel.getGreen();
			  leftB = leftPixel.getBlue();
			  
			  rightR = rightPixel.getRed();
			  rightG = rightPixel.getGreen();
			  rightB = rightPixel.getBlue();
			  
			  double R = (double)leftR/rightR;
			  double G = (double)leftG/rightG;
			  double B = (double)leftB/rightB;
			  
			  /*System.out.println("R" + R);
			  System.out.println("G" + G);
			  System.out.println("B" + B);*/
			  
			  if (((R < lowerLimit)||(R>upperLimit)) && ((G <lowerLimit) || (G > upperLimit)) && ((B <upperLimit) || (B>lowerLimit)))
			  {
				  leftPixel.setColor(Color.BLACK);
			  }
			  else
			  {
				  leftPixel.setColor(Color.WHITE);
			  }
		  }
	  }
	  
	  
	  for (int col = 0; col < pixels[0].length; col++)
	  {
		  for (int row = 0; row < pixels.length - 1; row++)
		  {
			  topPixel = pixels[row][col];
			  bottomPixel = pixels[row + 1][col];
			  
			  topR = topPixel.getRed();
			  topG = topPixel.getGreen();
			  topB = topPixel.getBlue();
			  
			  botR = bottomPixel.getRed();
			  botG = bottomPixel.getGreen();
			  botB = bottomPixel.getBlue();
			  
			  double R = (double)topR/botR;
			  double G = (double)topG/botG;
			  double B = (double)topB/botB;
			  
			  /*System.out.println("R" + R);
			  System.out.println("G" + G);
			  System.out.println("B" + B);*/
			  
			  if (((R < lowerLimit)||(R>upperLimit)) && ((G <lowerLimit) || (G > upperLimit)) && ((B <upperLimit) || (B>lowerLimit)))
			  {
				  topPixel.setColor(Color.BLACK);
			  }
			  else
			  {
				  topPixel.setColor(Color.WHITE);
			  }
		  }
	  }
  }
  
  public void blur(int x, int y, int width, int height)
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel pixel = null;
	  Pixel above = null;
	  Pixel below = null;
	  Pixel left = null;
	  Pixel right = null;
	  int blurR, blurG, blurB;
	  
	  if (x + width >=pixels[0].length - 3)
	  {
		  width = pixels[0].length - 3;
	  }
	  if (y + height >= pixels.length - 3)
	  {
		  height = pixels.length - 3;
	  }
	  System.out.println("h" + height);
	  System.out.println("w" + width);
	  
	  for (int row = y; row <= height; row++)
	  {
		  for (int col =x; col <= width; col++)
		  {
			  
			  if (!(col == 0 || row == 0 || col == pixels[0].length - 2 || col == pixels.length - 2))
			  {
				  pixel = pixels[row][col];
				  above = pixels[row - 1][col];
				  below = pixels[row + 1][col];
				  left = pixels[row][col - 1];
				  right = pixels [row][col + 1];
				  
				  blurR = (above.getRed() + below.getRed() + left.getRed() + right.getRed())/4;
				  blurG = (above.getGreen() + below.getGreen() + left.getGreen() + right.getGreen())/4;
				  blurB = (above.getBlue() + below.getBlue() + left.getBlue() + right.getBlue())/4;
				  
				  pixel.setRed(blurR);
				  pixel.setGreen(blurG);
				  pixel.setBlue(blurB);
			  }
			  else if (row == 0 && col==0)
			  {
				  pixel = pixels[row][col];
				  //above = pixels[row - 1][col];
				  below = pixels[row + 1][col];
				  //left = pixels[row][col - 1];
				  right = pixels [row][col + 1];
				  
				  blurR = (below.getRed() + right.getRed())/2;
				  blurG = (below.getGreen() + right.getGreen())/2;
				  blurB = (below.getBlue() + right.getBlue())/2;
				  
				  pixel.setRed(blurR);
				  pixel.setGreen(blurG);
				  pixel.setBlue(blurB);
			  }
			  
			  else if (row == pixels.length - 2 && col == pixels[0].length - 2)
			  {
				  pixel = pixels[row][col];
				  above = pixels[row - 1][col];
				  //below = pixels[row + 1][col];
				  left = pixels[row][col - 1];
				  //right = pixels [row][col + 1];
				  
				  blurR = (above.getRed() + left.getRed())/2;
				  blurG = (above.getGreen() + left.getGreen())/2;
				  blurB = (above.getBlue() + left.getBlue())/2;
				  
				  pixel.setRed(blurR);
				  pixel.setGreen(blurG);
				  pixel.setBlue(blurB);
				  
				  //break;
			  }
			  else if (row == 0 && col == pixels[0].length - 2)
			  {
				  pixel = pixels[row][col];
				  //above = pixels[row - 1][col];
				  below = pixels[row + 1][col];
				  left = pixels[row][col - 1];
				  //right = pixels [row][col + 1];
				  
				  blurR = (below.getRed() + left.getRed())/2;
				  blurG = ( below.getGreen() + left.getGreen())/2;
				  blurB = ( below.getBlue() + left.getBlue())/2;
				  
				  pixel.setRed(blurR);
				  pixel.setGreen(blurG);
				  pixel.setBlue(blurB);
				  //break;
			  }
			  
			  else if (row == pixels.length - 2 && col ==0)
			  {
				  pixel = pixels[row][col];
				  above = pixels[row - 1][col];
				  //below = pixels[row + 1][col];
				  //left = pixels[row][col - 1];
				  right = pixels [row][col + 1];
				  
				  blurR = (above.getRed() + right.getRed())/4;
				  blurG = (above.getGreen() +  right.getGreen())/2;
				  blurB = (above.getBlue() + right.getBlue())/2;
				  
				  pixel.setRed(blurR);
				  pixel.setGreen(blurG);
				  pixel.setBlue(blurB);
				  //break;
			  }
			  
			  else if (col ==0)
			  {
				  pixel = pixels[row][col];
				  above = pixels[row - 1][col];
				  below = pixels[row + 1][col];
				  //left = pixels[row][col - 1];
				  right = pixels [row][col + 1];
				  
				  
				  blurR = (above.getRed() + below.getRed() + right.getRed())/3;
				  blurG = (above.getGreen() + below.getGreen() + right.getGreen())/3;
				  blurB = (above.getBlue() + below.getBlue() + right.getBlue())/3;
				  
				  pixel.setRed(blurR);
				  pixel.setGreen(blurG);
				  pixel.setBlue(blurB);
			  }
			  
			  else if (row==0)
			  {
				  pixel = pixels[row][col];
				  //above = pixels[row - 1][col];
				  below = pixels[row + 1][col];
				  left = pixels[row][col - 1];
				  right = pixels [row][col + 1]; 
				  
				  blurR = ( below.getRed() + left.getRed() + right.getRed())/4;
				  blurG = ( below.getGreen() + left.getGreen() + right.getGreen())/4;
				  blurB = (below.getBlue() + left.getBlue() + right.getBlue())/4;
				  
				  pixel.setRed(blurR);
				  pixel.setGreen(blurG);
				  pixel.setBlue(blurB);
			  }
			  
			  
			  else if (row == pixels.length - 2)
			  {
				  pixel = pixels[row][col];
				  above = pixels[row - 1][col];
				  //below = pixels[row + 1][col];
				  left = pixels[row][col - 1];
				  right = pixels [row][col + 1];
				  
				  blurR = (above.getRed() + left.getRed() + right.getRed())/3;
				  blurG = (above.getGreen() + left.getGreen() + right.getGreen())/3;
				  blurB = (above.getBlue()  + left.getBlue() + right.getBlue())/3;
				  
				  pixel.setRed(blurR);
				  pixel.setGreen(blurG);
				  pixel.setBlue(blurB);
				  
				  //break;
			  }
			  
			  else if (col == pixels[0].length - 2)
			  {
				  pixel = pixels[row][col];
				  above = pixels[row - 1][col];
				  below = pixels[row + 1][col];
				  left = pixels[row][col - 1];
				  //right = pixels [row][col + 1];
				  
				  blurR = (above.getRed() + below.getRed() + left.getRed())/3;
				  blurG = (above.getGreen() + below.getGreen() + left.getGreen())/3;
				  blurB = (above.getBlue() + below.getBlue() + left.getBlue() )/3;
				  
				  pixel.setRed(blurR);
				  pixel.setGreen(blurG);
				  pixel.setBlue(blurB);
				  
				  //break;
			  }
			  else
			  {
				  pixel = pixels[row][col];
				  above = pixels[row - 1][col];
				  below = pixels[row + 1][col];
				  left = pixels[row][col - 1];
				  right = pixels [row][col + 1];
				  
				  blurR = (above.getRed() + below.getRed() + left.getRed() + right.getRed())/4;
				  blurG = (above.getGreen() + below.getGreen() + left.getGreen() + right.getGreen())/4;
				  blurB = (above.getBlue() + below.getBlue() + left.getBlue() + right.getBlue())/4;
				  
				  pixel.setRed(blurR);
				  pixel.setGreen(blurG);
				  pixel.setBlue(blurB);
			  }
			  
			  //pixel = pixels[row][col];
			  
			  
			  
		  }
	  }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
    
    for (int col = 0; col < pixels[0].length; col++)
    {
    	for (int row = 0; row < pixels.length - 1; row ++)
    	{
    		topPixel = pixels[row][col];
    		bottomPixel = pixels[row + 1][col];
    		Color bottomColor = bottomPixel.getColor();
    		
    		if (topPixel.colorDistance(bottomColor) > edgeDist)
    		{
    			topPixel.setColor(Color.BLACK);
    		}
    		else
    		{
    			topPixel.setColor(Color.WHITE);
    		}
    	}
    }
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  
  }
  
} // this } is the end of class Picture, put all new methods before this