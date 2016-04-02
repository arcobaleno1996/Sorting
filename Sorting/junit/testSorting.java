import static org.junit.Assert.*;

import org.junit.Test;


public class testSorting {
	
	private Sorting sort = new Sorting();

	@Test
	public void test() {
		int[] array1 = new int[]{4,3,2,1};
		new Sorting().insertionSort(array1);
		assertTrue(new Sorting().isSorted(array1));
		
		int[] array2 = new int[]{11,10,9,8,7,6,5,4,3,2,1};
		new Sorting().quicksort(array2);
		assertTrue(new Sorting().isSorted(array2));
		
	}

}
