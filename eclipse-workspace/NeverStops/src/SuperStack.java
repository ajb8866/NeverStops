
public class SuperStack<T> {
	private T[] items;
	private int top;
	public SuperStack(int size)
	{
		setItems((T[]) new Object[size]);
	}
	public boolean isEmpty()
	{
		return true;
	}
	public boolean isFull()
	{
		return true ;
	}
	
	public boolean push (T items)
	{
		return true;
	}
	public T[] getItems() {
		return items;
	}
	public int getTop() {
		return top;
	}
	

}
