class qSort{
	public static void main(String[] args){
		int[] arr = {2, 8, 7, 1, 3, 5, 6, 4};

		qSort(arr, 0, arr.length - 1);

		for(int i : arr){
			System.out.println(i);
		}
	}
	private static void qSort(int[] arr, int low, int high){
		if(low < high){
			int privot = partition(arr, low, high);
			qSort(arr, low, privot - 1);
			qSort(arr, privot + 1, high);
		}
	}
	private static int partition(int[] arr, int low, int high){
		int x = arr[high];
		int i = low - 1;
		for(int j = low; j < high + 1; j++){
			if(arr[j] <= x){
				i++;
				xchange(arr, i, j);

			}
		}
		xchange(arr, i + 1, high);
		return i + 1;
	}
	private static void xchange(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;		
	}

}