package Arrays;

public class TwoDimensionArray {
	public static void main(String[] args) {
		
		int[] listNumbers = {1,2,3,2,5,6,7,8};
		
		
	}
	
	public static int[] removeDuplicates(int[] arr) {
	    int[] d = {};
		
		int[] listNumbers = {1,2,3,2,5,6,7,8};
		int a = 0;
		boolean check = false;
		for (int i = 0; i < listNumbers.length; i++) {
			a = listNumbers[i];
			
			for (int j = 0; j < listNumbers.length; j++) {
				
			}
		}
	    
	    
	    
	    return d;
	  }
	
	
	static int findMissingNumberInArray(int[] array) {
		
		int summation = 0;
		int n = array.length + 1;
		
		summation = (n * (n + 1)) / 2; // calculate the sum of the array +1
		
		int total = 0;
		for (int i : array) {
			
			total = total + i;
		}
		
		// if summation == total (mean that the array don't miss a number)
		
		return summation - total;
	}
	
	static int[] getBetterNumber(int[] array) {
		int[] bNums = {Integer.MIN_VALUE, Integer.MIN_VALUE};
	
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] >= bNums[1]) {
				if(array[i] > bNums[0]) {
					bNums[1] = bNums[0];
					bNums[0] = array[i];
				}else {
					bNums[1] = array[i];
				}
			}
			
		}
		
		return bNums;
	}
	
	int summDiaMatrix(int[][] array2d) {
		
		int total = 0;
		/**
		 * If the matrix is symmetric
		 */
		for (int i = 0; i < array2d.length; i++) {
			
			total += array2d[i][i];
		}
		

		return total;
	}
}
