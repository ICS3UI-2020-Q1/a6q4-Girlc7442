import java.util.Scanner;

/**
 * Takes two 3D vectors and computes their dot product
 * @author Cole Girling
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for user input
    Scanner input = new Scanner(System.in);

    //ask the user to enter 3 integers
    System.out.println("Please enter the 3 values for the first vector");

    //store the 3 integers in an array
    int[] vector1 = new int[3];

    //takes the users integers to put them in an array
    for(int i = 0; i < 3; i++){
      vector1[i] = input.nextInt();
    }
    
    //ask the user to enter 3 integers
    System.out.println("Please enter the 3 values for the second vector");

    //store the 3 integers in an array
    int[] vector2 = new int[3];

    //takes the users integers to put them in an array
    for(int i = 0; i < 3; i++){
      vector2[i] = input.nextInt();
    }

    //calculates the dot product
    int math = (vector1[0] * vector2[0]) + (vector2[1] * vector1[1]) + (vector1[2] * vector2[2]);

    //tells the user the dot product
    System.out.println("The dot product is" + math);
  }
}



  

