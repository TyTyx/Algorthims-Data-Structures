import java.util.*;

public class LabSevPract
{
	//private int maxSize; //size of stack
	//private char[] stackArray;
	//private int top; //top of stack

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter: ");
		String input = sc.nextLine();

		input = input.replaceAll(" ", "");

		Stack sta = new Stack(input.length());

		//input = input.replaceAll(" ", "");

		for(int x = 0; x<input.length(); x++) //put brackets @ length as it is a string not array
		{
			sta.push(input.charAt(x));

		}

		String reverseString = "";

		for(int y = 0; y<input.length(); y++){
			reverseString = reverseString + Character.toString(sta.pop());
		}

		if(reverseString.equals(input))
			System.out.print("TRUE");
		else
			System.out.print("FALSE");

	}
}

class Stack{
	private int maxSize; //size of stack
	private char[] stackArray;
	private int top; //top of stack


 public Stack(int i){
		maxSize = i; //set array size
		stackArray = new char[maxSize]; //create array
		top = -1; //no items yet
	}

	public void push(char j){
		top++;
		stackArray[top] = j;
	}

	public char pop(){
		return stackArray[top--];
	}
}
