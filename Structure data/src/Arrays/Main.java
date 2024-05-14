package Arrays;

public class Main {
	public static void main(String[] args) {
		
		SingleDimensionArray arr = new SingleDimensionArray(10);
		
		arr.insert(0, 4);
		
		int element1 = arr.arr[0];
		System.out.println(element1);
	}
	
}
