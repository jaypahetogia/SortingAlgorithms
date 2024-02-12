import java.util.Random;

public class Main {
    public static void main(String args[]) {
        int[] sizes = {10, 100, 500, 1000, 5000, 10000};
        Random rand = new Random();

        for (int size : sizes) {
            System.out.println("Testing for size: " + size);
            
            Integer[] dataForBubbleSort = new Integer[size];
            Integer[] dataForInsertionSort = new Integer[size];
            Integer[] dataForQuickSort = new Integer[size];
            Integer[] dataForHybridSort = new Integer[size];
            
            //using same random data in each sorting test
            for (int i = 0; i < size; i++) {
                int randomNum = rand.nextInt(); 
                dataForBubbleSort[i] = randomNum;
                dataForInsertionSort[i] = randomNum;
                dataForQuickSort[i] = randomNum;
                dataForHybridSort[i] = randomNum;
            }
            //calling sort method for each sorting type/class
            BubbleSort.sort(dataForBubbleSort);
            InsertionSort.sort(dataForInsertionSort);
            QuickSort.sort(dataForQuickSort);
            HybridSort.sort(dataForHybridSort);
           
            System.out.println("-----------------------------");
        }
    }
}
