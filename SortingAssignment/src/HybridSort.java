public class HybridSort {
    
   
    	public static void sort(Integer[] data) {
    	    if (data.length <= 45) {
    	        InsertionSort.sort(data);
    	    } else {
    	        QuickSort.sort(data);
    	    }
    	}
    }

