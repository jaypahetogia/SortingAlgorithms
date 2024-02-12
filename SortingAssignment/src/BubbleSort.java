
public class BubbleSort {
	
	 public static void sort(Integer[] data) {
		    int size = data.length;
		    long startTime = System.nanoTime(); //start recording time
		    for (int i = 0; i < size - 1; i++)  //this loop is to access each array element
		      for (int j = 0; j < size - i - 1; j++) //this loop to compare array elements
		    	  if (data[j] > data[j + 1]) {  //compare two adjacent elements
		          int temp = data[j];  //the swapping 
		          data[j] = data[j + 1];
		          data[j + 1] = temp;
		        }
		    long endTime = System.nanoTime(); //end recording time
		    System.out.println("Bubble Sort: " + (endTime - startTime));
		  }
}
