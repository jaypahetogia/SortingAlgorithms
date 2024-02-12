
public class InsertionSort {

public static void sort(Integer[] data) {
	   int size = data.length;
	   long startTime = System.nanoTime();
	   for (int step = 1; step < size; step++) {
	     int unit = data[step];
	     int j = step - 1;
	     while (j >= 0 && unit < data[j]) { //Compare with each element on the left of it until an element smaller than it is found.
	       data[j + 1] = data[j];
	       --j;
	     }
	     data[j + 1] = unit;  //Place unit at after the element just smaller than it.
	   }
	   long endTime = System.nanoTime();
	   System.out.println("Insertion Sort: " + (endTime - startTime));
	 }
}