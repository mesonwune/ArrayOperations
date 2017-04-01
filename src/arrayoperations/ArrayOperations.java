/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayoperations;
import java.util.Random;

/**
 *
 * @author mesomaesonwune
 */
public class ArrayOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creating an int array with size 10000
        int [] array = new int [10000];
        
        //Creating a variable that will get random values
        Random randy = new Random();
        
        //for-loop to fill array with random #s 0-200
        for (int i = 0; i < array.length; i++)
        {
            //will only choose a number between 0 and 200
            array[i] = randy.nextInt(201);
            //System.out.println(array[i]);
        }
        
        //variable to collect sum of array values
        int sum = 0;
        
        //for-loop to calculate sum of #s
        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
            //System.out.println(sum);
        }
        
        System.out.println("The sum of the array is " + sum + ".");
        //need an int variable to store average and a boolean to quickly end the loop
        double avg = 0;
        double sum1 = 0.0;
        
        //for-loop to calculate sum again
        for (int i = 0; i < array.length; i++)
        {
            sum1 += array[i];
            //System.out.println(sum);
        }
        
        //Calculate array with sum1
        avg = sum1/array.length;
        
        System.out.println("The average of the array is " + avg + ".");
        
        //variable to hold first element 
        int smallest = array[0];
        int smallIndex = 0;
        
        for (int i = 1; i < array.length; i++)
        {
            //if the current element is smaller than the value stored in smallest
            if (array[i] < smallest)
            {
                //change smallest to that value
                smallest = array[i];
                smallIndex = i;
            }
        }
        
        System.out.println("The smallest number is: " + smallest + " and the index is " + smallIndex + ".");
        
        //variable to hold first element 
        int largest = array[0];
        int bigIndex = 0;
        
        for (int i = 1; i < array.length; i++)
        {
            //if the current element is larger than the value stored in largest
            if (array[i] > largest)
            {
                //change largest to that value
                largest = array[i];
                bigIndex = i;
            }
        }
        
        System.out.println("The largest number is: " + largest + " and the index is " + bigIndex + ".");
        
        //variables to store even and odd count
        int evenCount = 0;
        int oddCount = 0;
        
        for (int i = 0; i < array.length; i++)
        {
            //if statement to chech if there is a remainder
            if (array[i] % 2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }
        
        System.out.println("This array contains " + evenCount + " even numbers.");
        System.out.println("This array contains " + oddCount + " odd numbers.");
        
    }
    
}
