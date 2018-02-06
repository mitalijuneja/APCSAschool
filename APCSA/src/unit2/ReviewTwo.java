package unit2;

import java.util.Scanner;

class ReviewTwo {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    //Exercise 1
    
    //Exercise 2
    double velocity, acceleration, length;
    System.out.print("Enter airplane velocity: ");
    velocity = keyboard.nextDouble();
    
    System.out.print("Enter airplane acceleration: ");
    acceleration = keyboard.nextDouble();
    
    length = (velocity * velocity)/(2*acceleration);
    System.out.printf("\nThe minimum runway length for this airplane is %.3f", length);
    
    
  }
}
