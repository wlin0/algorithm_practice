class heapify{
	public static void main(String[] args){
		//int[] array = {16,4,10,14,7,9,3,2,8,1};
		//int[] array = {27, 17, 3, 16, 13, 10, 1,5 ,7,12,4,8,9,0};
		int[] array = {5,3,17,10,84,19,6,22,9};
		heapSort(array);
		//max_heapify_iteration(array, 2);
		// for(int i : array){
		// 	System.out.println(i);
		// }
	}
	private static void heapSort(int[] array){
		build_max_heap(array);
		for(int i = array.length - 1; i > 0; i --){
			int temp = array[i];
			array[i] = array[0];
			array[0] = temp;
			max_heapify(array, 0);
		}

		for(int i : array){
			System.out.println(i);
		}
	}

	private static void build_max_heap(int[] array){
		for(int i = array.length / 2; i >= 0; i --){
			max_heapify(array, len, i);
		}
	}

	private static void max_heapify(int[] array, int len, int i){
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		int largest = (l <= array.length - 1 && array[l] > array[i]) ? l : i;
		largest = (r <= array.length - 1 && array[r] > array[largest]) ? r : largest;

		if(largest != i){
			int temp = array[i];
			array[i] = array[largest];
			array[largest] = temp;
			max_heapify(array, largest);
		} 
	}
	private static void max_heapify_iteration(int[] array, int i){
			int l = 2 * i + 1;
			int r = 2 * i + 2;

			int largest = (l <= array.length && array[l] > array[i]) ? l : i;
			largest = (r <= array.length && array[r] > array[largest]) ? r : largest;

			while(i <= array.length - 1 && largest != i){
				int temp = array[i];
				array[i] = array[largest];
				array[largest] = temp;
				i = largest;
				l = 2 * i + 1;
				r = 2 * i + 2;

				largest = (l <= array.length && array[l] > array[i]) ? l : i;
				largest = (r <= array.length && array[r] > array[largest]) ? r : largest;
			}
	}
}