import java.util.*;

public class CL {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());

		Link array[] = new Link[num];

		for (int i = 0; i < num; i++) {
			array[i] = new Link(scan.nextLine());
		}

		while(scan.hasNext()) {
			int select = scan.nextInt();
			int next = scan.nextInt();
			if (next != 1) 
				array[select].next = array[next];
		}

		LinkedList list = new LinkedList();
		if (num > 0) 
			list.first = array[0];
		System.out.println(findLoop(list));
	}

	public static String findLoop(LinkedList list) {
		if (list.isEmpty) 
			return ("empty");

		Link checkList[] = new Link[100];
		int counter = 0;
		Link forward = list.first;
		while (forward.next != null) {
			checkList[counter] = forward;
			Link temp = forward;
			forward = forward.next;

			for (int j = 0; j < counter; j++) {
				if (forward == checkList[j])
					return temp.data;
			}
			counter++;
		}
		return ("OK");
	}
}

class Link {
	public String data;
	public Link next;

	public Link(String input) {
		data = input;
		next = null;
	}
}

class LinkedList {
	public Link first;

	public LinkedList() {
		first = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertHead(Link insert) {
		if (isEmpty())
			first = insert;
		else {
			insert.next = first;
			first = insert;
		}
	}
}