package Arrays;

public class SingleDimensionArray {

	int arr[] = null;
	
	
	
	public SingleDimensionArray(int sizeOfArray) {
		
		arr = new int[sizeOfArray];
		for (int i = 0; i < sizeOfArray; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
		
	}
	
	public void insert(int location, int valueToBeInserted) {
		
		
		try {
			if(arr[location] == Integer.MIN_VALUE) {
				arr[location] = valueToBeInserted;
				System.out.println("Succesfully inserted");
			}else {
				System.out.println("This cell is already accupied");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Invalid index to access array");
		}
	}
	
	
}
