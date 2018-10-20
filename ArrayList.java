import java.util.NoSuchElementException;

public class ArrayList implements List {

	private int size = 0;
	private int length = 10;
	private Object[] arr;

	public ArrayList() {
		arr = new Object[length];
	}

	public void add(Object obj) {
		if(size == arr.length) {
			growArray();
		}
		arr[size] = obj;
		size++;
	}

	public void add(int pos, Object obj) {
		if(size == arr.length) {
			growArray();
		}
		for(int i = size-1; i > pos; i--) {
			arr[i+1] = arr[i];
		}
		arr[pos] = obj;
		size++;
	}

	public Object get(int pos) {
		return arr[pos];
	}

	public Object remove(int pos) {
		Object temp = arr[pos];
		for(int i = pos; i < size; i++) {
			arr[i] = arr[i+1];
		}
		size--;
		return temp;
	}

	public void growArray() {
		Object[] newarr = new Object[2*arr.length];
		for(int i = 0; i < arr.length; i++) {
			newarr[i] = arr[i];
		}
		arr = newarr; 
	}

	public int size() {
		return size;
	}
}