
public class QuickSort {

	// method to find the partition position
	static int partition(Integer array[], int low, int high) {
	 Integer pivot = array[high]; //the rightmost element as pivot
	 int i = (low - 1);
	 for (int j = low; j < high; j++) { // compare each element with pivot
		//the swap
	   if (array[j] <= pivot) { 
	     i++;
	     Integer temp = array[i];
	     array[i] = array[j];
	     array[j] = temp;
	   }

	 }

	 Integer temp = array[i + 1];
	 array[i + 1] = array[high];
	 array[high] = temp;
	 return (i + 1);
	}

	static void sort(Integer array[]) {
	    long startTime = System.nanoTime();
	    quickSort(array, 0, array.length - 1);
	    long endTime = System.nanoTime();
	    System.out.println("Quick Sort: " + (endTime - startTime));
	}

	static void quickSort(Integer array[], int low, int high) {
	    if (low < high) {
	        int pi = partition(array, low, high);
	        quickSort(array, low, pi - 1);
	        quickSort(array, pi + 1, high);
	    }
	}
}
