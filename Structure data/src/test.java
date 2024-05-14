
public class test {
	
	
	public static void main(String[] args) {
		
	int[] array = {2,3,4,5,6,7,89};
	int[] array2 = middle(array);
	
	for (int i = 0; i < array2.length; i++) {
		//System.out.println(array2[i]);
	}
	}
	
	public static int[] middle(int[] array) {
		
		   int lengthArray2 = array.length-2;
	        int[] newArray = new int [lengthArray2];
			int index2 = 0;
			
			
			for (int i=0; i <array.length ;i++){
				System.out.print(array[i]);
			    if(i > 0 && i < array.length-1){
			    	

			        newArray[index2] = array[i];
			        index2++;
			    }
			}
			return newArray;
        
    }
}
