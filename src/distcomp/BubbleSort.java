package distcomp;

public class BubbleSort {


	public BubbleSort() {
		// TODO Auto-generated constructor stub
	}


	public static int[] sort(int[] inputArray) {
		int temp;
		for (int i = 0; i < inputArray.length - 1; i++) {
			if (inputArray[i] >= inputArray[i+1]) { 
				temp = inputArray[i+1];
				inputArray[i+1] = inputArray[i];
				inputArray[i] = temp;
			}
		}
		if(checkIfSorted(inputArray))
			return inputArray;
		else sort(inputArray);
		return inputArray;
	}


	private static boolean checkIfSorted(int[] inputArray) {
		for(int i = 0; i < inputArray.length - 1; i++) {
			if (inputArray[i] > inputArray[i + 1])
				return false;
		}
		return true;
	}

}

