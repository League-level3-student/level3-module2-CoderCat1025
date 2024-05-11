package _01_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}

	/* 
	 * Use the bubble sorting algorithm to sort the array.
	 * You can use display.updateDisplay() to show the current
	 * progress on the graph.
	 */



	@Override
	void sort(int[] array, SortingVisualizer display) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int e = 0; e < i; e++) {
				if (array[i] > array[e]) {
					int one = array[i];
					array[i] = array[e];
					array[e] = one;
					display.updateDisplay();

				}
			}
		}
	}
}
