import java.util.*;
import java.lang.Math;

public class App {

        //3. Write a public static method called "toPower" that takes in as parameters two integers called size and power. The method should return an array of size "size" with each array index raised to the value of "power." So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," the method should return the following result: [0,1,4,9].
    public static void toPower(int size, int power){
        int Size = size;                             //stores the inputted size integer in the variable Size
        int Power = power;                           //stores the inputted power integer in the variable Power
        int newArray[] = new int[Size];              //initializes a blank array with Size number of placeholders
        for (int i=0; i<Size; i++){                  //sets up a counter i to keep track of place in array
            newArray[i] = (int)Math.pow(i, Power);        //sets each value in array equal to number of its place in array raised to inputted power, then converted to integer
        }
        System.out.println(Arrays.toString(newArray));                              //returns final array of integers as a string, Arrays.toString resolves problem where previously it was just printing the memory location when using just println(newArray)
    }
    public static void main(String[] args) throws Exception {

        //1. Write a program to sum all the values of a given Array in Java.
        int[] exampleArray1 = {1,5,6,5,4,1};
        int sum = 0;
        for (int i=0; i< exampleArray1.length; i++){
            sum = sum + exampleArray1[i];
        }
        System.out.println(sum);

        //2. What is the output?
        double[] exampleArray = {1,5,6,5,4,1};

          double maximum = exampleArray[0];  //initializes the variable maximum to 1, which is the 0 index in the array

          int index = 0;

          for (int i = 1; i<exampleArray.length; i++){   //because i is 1, skips the 0 index of the array and starts at the value 5

               if (exampleArray[i] > maximum) {          //if value of the array at the count is more than the initial maximum of 1, executes code inside block

                    maximum = exampleArray[i];           //reassigns the value of maximum to the largest number in the array, meaning it would stay at 6

                    index = i;                           //assigns the value of index to be the same as the counter for the largest value. 6 is at index 2 so index will stay at 2

               }

          }
          System.out.println(index);   //outputs 2 since the code in the if statement doesn't run after index is set to 6, since all the remaining values in array are less than 6
    
        
          toPower(5,2);                              //calls function [0, 1, 2, 3, 4] raised to second power; expected output [0, 1, 4, 9, 16]
        }      
}

