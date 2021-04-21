
public class Sort {

	public static void selectionSort(int[] arr) {
		int temp;
		int indexMin;

		for (int i = 0; i < arr.length - 1; i++) {
			indexMin = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[indexMin] > arr[j]) {
					indexMin = j;
				}
			}

			temp = arr[i];
			arr[i] = arr[indexMin];
			arr[indexMin] = temp;
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

	public static void bubleSort(int[] arr) {
		int temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i] + " ");
		}
	}

	public static void insertionSort(int[] arr) {
		
		for(int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int aux = i - 1;
			
			while((aux >= 0) && (arr[aux] > temp)) {
				arr[aux + 1] = arr[aux];
				aux--;
			}
			arr[aux + 1] = temp;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = { 5, 6, 19, 20, 2, 1 };

		System.out.print("Selection Sort : ");
		selectionSort(arr);
		
		System.out.println("");
		
		System.out.print("Buble Sort : ");
		bubleSort(arr);
		
		System.out.println("");
		
		System.out.print("Insertion Sort : ");
		insertionSort(arr);
	}

}
