package Array;

import java.util.Scanner;

//This program has been written to reverse an array.

public class Array {
	
	int []iArray = new int[5];		// Declaring array variable and initialization of array.
	
	public void AcceptArray()		//Method to accept an array.
	{
				
		Scanner sC = new Scanner(System.in);	//Creating object of scanner.
		
		System.out.println("Please enter five numbers : ");	// Requesting user to enter five integers.
		
		for(int i = 0; i < 5; i++)				// For loop to accept input to array.
		{
		
			iArray[i] = sC.nextInt();			// Accepting value to array.
						
		}

		System.out.println("The original array:");		//Printing message.
		
		for(int i = 0; i < 5; i++)				// For loop to print Array.
		{
		
			System.out.print(iArray[i] + " ");	// Printing value of array.
						
		}
		
	}
	
	public void Reverse()		// method to print an array in reverse order.
	
	{
		System.out.println("");		//To Change line.
		
		System.out.println("The reverse array:");
		
		for(int i = 4; i >= 0; i--)					// For loop to print reverse array.
		{

			System.out.print( iArray[i] + " ");		// Printing array.
						
		}

	}
	
	
	public static void main(String[] args) {
		
		Array obj = new Array();		//Creating object for class. 
		obj.AcceptArray();				//calling array accepting method.
		obj.Reverse();					//Calling  array printing method.
		
		
	}
	
}
