class hSort{
	// public static void main(String[] args){
	// 	int[] heap = {16, 14, 10, 8, 7, 9, 3, 2, 4, 1};
	// 	heapSort(heap);
	// 	for(int i: heap){
	// 		System.out.println(i);
	// 	}	
	// }
	private static void heapSort(int[] heap){
		buildMaxHeap(heap);
		for(int i = heap.length - 1; i > 0; i--){
			int temp = heap[0];
			heap[0] = heap[i];
			heap[i] = temp;
			maxHeapify(heap, i - 1, 0);
		}
	}

	private static void buildMaxHeap(int[] b_arr){
		int size = b_arr.length - 1;
		for(int i = b_arr.length / 2 - 1; i >= 0; i--){
			maxHeapify(b_arr, size, i);
		}
	}
	private static void maxHeapify(int[] h_Arr, int size, int i){
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		int largest = (l <= size && h_Arr[i] < h_Arr[l]) ? l : i;
		largest = (r <= size && h_Arr[largest] < h_Arr[r]) ? r : largest;
		// order mistake

		if(largest != i){
			int temp = h_Arr[i];
			h_Arr[i] = h_Arr[largest];
			h_Arr[largest] = temp;
			maxHeapify(h_Arr, size, largest);
		}
	}
}