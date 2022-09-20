
class QueueUsingArray {
	int front, rear;
	int size;
	static int q1[];

	// Parameterized Constructor
	QueueUsingArray(int size) {
		this.size = size;
		q1 = new int[size];
	}

	void enqueue(int value) {
		if (rear == size)
			System.out.println("Queue is already full !!");
		q1[rear] = value;
		rear++;
	}

	void dequeue() {
		if (rear == 0)
			System.out.println("Queue is already empty.");
		else {
			System.out.println("\nDequeue : " + q1[front]);
			for (int i = 0; i < rear - 1; i++) {
				q1[i] = q1[i + 1];
			}
			rear--;
		}
	}

	void display() {
		if (rear == 0)
			System.out.println("Queue is already empty.");
		else {
			System.out.print("\n[ ");
			for (int i = 0; i < rear; i++) {
				System.out.print(q1[i] + " ");
			}
			System.out.print("]");
		}
	}
}

public class QueueEx {

	public static void main(String[] args) {
		QueueUsingArray Q1 = new QueueUsingArray(5);
		Q1.enqueue(2);
		Q1.enqueue(4);
		Q1.enqueue(6);
		Q1.display();
		Q1.dequeue();
		Q1.display();
		Q1.enqueue(9);
		Q1.display();
	}
}