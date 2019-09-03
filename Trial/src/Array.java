//Array ascending order program
public class Array {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 1, 8 };

		for (int item : arr) {
			System.out.print(item + " ");

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}

		}
		System.out.println();
		System.out.println("Elements of array sorted in ascending order: ");

		for (int item : arr) {
			System.out.print(item + " ");

		}

	}
}
