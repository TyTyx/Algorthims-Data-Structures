import java.util.*;

public class frontQueue {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Queue myqueue = new Queue(20);

		while (scan.hasNext()) {
			String command = scan.nextLine();
			if (command.equals("REMOVE")) {
				if (!myqueue.isEmpty())
					myqueue.remove();
			}
			else
				myqueue.insert(command.substring(7, command.length()));
		}
		if (!myqueue.isEmpty())
			System.out.println(myqueue.remove());
		else
			System.out.println("empty");
	}
}


class Queue {
	private int maxSize;
	private String queueArray[];
	private int front;
	private int rear;
	private int nItems;

	public Queue(int s) {
		maxSize = s;
		queueArray = new String[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public boolean insert(String item) {
		if (!isFull) {
			rear++;
			queueArray[rear] = item;
			nItems++;
			return true;
		}
		else
			return false;
	}

	public String remove() {
		String temp = queueArray[front];
		front++;

		if (front == maxSize) {
			front = 0;
			nItems--;
			return temp;
		}
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}

	public int size() {
		return nItems;
	}
}