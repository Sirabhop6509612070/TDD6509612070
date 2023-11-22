package core;

public interface IStack {
	boolean isEmpty();
	int getSize();
	boolean isFull();
	void push(int elm);
	int top();
	int pop();

}
