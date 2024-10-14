// Define the SortingStrategy interface
interface SortingStrategy {
 void sort();
}
// Implement concrete sorting strategies
class BubbleSort implements SortingStrategy {
 private Sorter context;
 public BubbleSort(Sorter context) {
 this.context = context;
 }
 public void sort() {
 int[] array = context.getData();
 System.out.println("Sorting using Bubble Sort");
 // Implementation of Bubble Sort using context.getData()
 }
}
class QuickSort implements SortingStrategy {
 private Sorter context;
 public QuickSort(Sorter context) {
 this.context = context;
 }
 public void sort() {
 int[] array = context.getData();
 System.out.println("Sorting using Quick Sort");
 // Implementation of Quick Sort using context.getData()
 }
}
class sortInsertion implements SortingStrategy {
    private Sorter context ; 
    public sortInsertion(Sorter context){
        this.context = context ; 
    }
    public void sort() {
        int[] array = context.getData() ; 
        System.out.println("insertion " ) ; 
    }
}

// Context class that retains data and passes itself to the selected sorting strategy
class Sorter {
 private SortingStrategy strategy;
 private int[] data;
 public Sorter(int[] data) {
 this.data = data;
 }
 public void setStrategy(SortingStrategy strategy) {
 this.strategy = strategy;
 }
 public int[] getData() {
 return data;
 }
 public void performSort() {
 strategy.sort();
 }
}


