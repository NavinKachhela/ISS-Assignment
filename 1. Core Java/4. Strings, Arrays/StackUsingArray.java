class Stack {
	// store elements of stack
	private int items[];
	// represent top of stack
	private int top;
	// total size of the stack
	private int size;
	
	// Creating a stack
	Stack(int size) {
		this.size = size;
		this.items = new int[size];
		this.top = -1;
	}

	// push elements to the top of stack
	public void push(int item) {
		if(top == size - 1) {
			System.out.println("Overflow!");
			return;
		}
		items[++top] = item;
	}

	// pop elements from top of stack
	public int pop() {
		if(top == -1){
			System.out.println("Underflow");
			return -1;
		}
		return items[top--];
	}

	// display elements of stack
	public void show(){
		if(top == -1){
			System.out.println("Underflow");
			return;
		}
		for(int i=top; i>=0; i--) {
			System.out.println(items[i] + " ");
		}
		System.out.println();
	}
	public int peek() {
		return items[top];
	}
}

class StackUsingArray {
	public static void main(String[] args) {
		Stack s1 = new Stack(10);
		s1.push(10);
		s1.push(20);
		s1.push(30);

		System.out.println("Stack ");
		s1.show();
		int poppedElement = s1.pop();
		System.out.println("Popped Element = " + poppedElement + "\n");
		System.out.println("Stack ");
		s1.show();
		int peekElement = s1.peek();
		System.out.println("Peek Element = " + peekElement);
	}
}