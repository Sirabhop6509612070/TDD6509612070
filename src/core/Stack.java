package core;
import java.util.ArrayList;
public class Stack implements IStack {
	private ArrayList<Integer> Stack;
	
	public Stack() {
		Stack =new ArrayList<Integer>();
	}

	@Override
	public boolean isEmpty() {
		return Stack.isEmpty();
	}

	@Override
	public int getSize() {
			
		return Stack.size();
	}

	@Override
	public boolean isFull() {
		if(Stack.get(getSize()-1)!=null) {
		return true;
		}
		else return false;
	}

	@Override
	public void push(int elm) {
	Stack.add(elm);
		
	}

	@Override
	public int top() {
		// TODO Auto-generated method stub
		return  Stack.get(getSize()-1);
	}

	@Override
	public int pop() {
		int x;
		x = Stack.get(getSize()-1);
		Stack.remove(Stack.get(getSize()-1));
		return x;
	}

}
