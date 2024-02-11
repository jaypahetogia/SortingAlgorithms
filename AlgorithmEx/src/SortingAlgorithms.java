import java.util.Comparator;
import java.util.Random;

public class SortingAlgorithms<E> {
    
    public void bubbleSort(E[] data, int size, Comparator<E> comp) {
        for (int pos = data.length - 1; pos >= 0; pos--) {
            for (int scan = 0; scan <= pos - 1; scan++) {
                if (comp.compare(data[scan], data[scan + 1]) > 0) {
                    E temp = data[scan];
                    data[scan] = data[scan + 1];
                    data[scan + 1] = temp;
                }
            }
        }
    }

    public void insertionSort(E[] data, int size, Comparator<E> comp) {
        for (int i = 1; i < size; i++) {
            E item = data[i];
            int place = i;
            while (place > 0 && comp.compare(item, data[place - 1]) < 0) {
                data[place] = data[place - 1];
                place--;
            }
            data[place] = item;
        }
    }

    public void selectionSort(E[] data, int size, Comparator<E> comp) {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (comp.compare(data[j], data[minIndex]) < 0)
                    minIndex = j;
            }
            swap(data, i, minIndex);
        }
    }

    private void swap(E[] data, int i, int j) {
        E temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

   
    public static void main(String[] args) {
        int size = 100;
        Integer[] data = new Integer[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            data[i] = rand.nextInt(); 
        }

        Comparator<Integer> comp = Integer::compareTo;

        SortingAlgorithms<Integer> sorter = new SortingAlgorithms<>();

        // Bubble Sort
        Integer[] bubbleData = data.clone();
        long startTime = System.nanoTime();
        sorter.bubbleSort(bubbleData, size, comp);
        long endTime = System.nanoTime();
        System.out.println("Bubble Sort time: " + (endTime - startTime) + " nanoseconds");

        // Insertion Sort
        Integer[] insertionData = data.clone();
        startTime = System.nanoTime();
        sorter.insertionSort(insertionData, size, comp);
        endTime = System.nanoTime();
        System.out.println("Insertion Sort time: " + (endTime - startTime) + " nanoseconds");

        // Selection Sort
        Integer[] selectionData = data.clone();
        startTime = System.nanoTime();
        sorter.selectionSort(selectionData, size, comp);
        endTime = System.nanoTime();
        System.out.println("Selection Sort time: " + (endTime - startTime) + " nanoseconds");
    }
}
