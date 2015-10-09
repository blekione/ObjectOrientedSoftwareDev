package distcomp;

public class TestBubbleSort {

	public static void main(String[] args) {

		int[] intArray = {5, 14, 12, -5, 8, 0, 4, 106, 67, 8, 4, 12 };
		
		intArray = BubbleSort.sort(intArray);
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		
	}

}
