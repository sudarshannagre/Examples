public class DuplicateElement {

	public static void main(String[] args) {

		int[] array = new int[] { 7, 7, 0, 9, 1, 5, 3, 2, 8, 7 };

		System.out.println("Duplicate elements in given Int array : ");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j])
					System.out.println(array[j]);
			}
		}
	}
}

//Output
/*
 * Duplicate elements in given Int array : 
 * 7 
 * 7 
 * 7
 */