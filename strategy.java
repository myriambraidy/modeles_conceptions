// Define the SortingStrategy interface
interface SortingStrategy {
 void sort(int[] array);
}
// Implement concrete sorting strategies
class BubbleSort implements SortingStrategy {
 public void sort(int[] array) {
 System.out.println("Sorting using Bubble Sort");
 // Implementation of Bubble Sort
 // ...
 }
}
class QuickSort implements SortingStrategy {
 public void sort(int[] array) {
 System.out.println("Sorting using Quick Sort");
 // Implementation of Quick Sort
 // ...
 }
}
class Tri_insertion implements SortingStrategy {
    public void sort(int[] array) {
        System.out.println("sorting using insertion ");
    }
}
// Context class that passes data to the selected sorting strategy
class Sorter {
 private SortingStrategy strategy;
 public Sorter(SortingStrategy strategy) {
 this.strategy = strategy;
 }
 //to change the strategy 
 public void setStrategy(SortingStrategy strategy) {
 this.strategy = strategy;
 }
 public void performSort(int[] array) {
 strategy.sort(array);
 }
}
