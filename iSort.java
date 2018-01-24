class iSort{
	// public static void main(String[] args){
	// 	int[] arr = {9,8,7,6,5,4,3,2,1};
	// 	iSort(arr);
	// 	for(int i: arr){
	// 		System.out.println(i);
	// 	}	
	// }
	private static void iSort(int[] arr){
		if(arr.length < 2){
			return;
		}
		for(int i = 1; i < arr.length; i++){
			int key = arr[i];
			int j = i - 1;
			while(j >= 0 && key < arr[j]){
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
}