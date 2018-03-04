import java.util.*;

public class biggestStack {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack mystack = new Stack(10);

		int number = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < number; i++) {
			String command = scan.nextLine();
			if (command.equals("POP")) {
				if (!mystack.isEmpty())
					mystack.pop();
			}
			else
				mystack.push(Integer.parseInt(command.substring(5, command.length())));
		}
		if (!mystack.isEmpty()) {
			int record = mystack.pop();
			while(!mystack.isEmpty()) {
				if (mystack.peek() > record) 
					record = mystack.peek();
				mystack.pop();
			}
			System.out.println(record);
		}
		else
			System.out.println("empty");
	}
}


class Stack {
	private int maxSize;
	private int stackArray[];
	private int top;

	public Stack(int s) {
		maxSize = s;
		stackArray = new int[maxSize];
		top = -1;
	}

	public void push(int j) {
		top++;
		stackArray[top] = j;
	}

	public int pop() {
		return stackArray[top--];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize-1);
	}

	public void makeEmpty() {
		top = -1;
	}
}