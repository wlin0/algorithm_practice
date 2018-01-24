class cSort{
	public static void main(String[] args){
		int[] arr = {2,5,3,0,2,3,0,3};
		cSort(arr, 6);
	}
	private static void cSort(int[] arr, int k){
		int[] c = new int[6];
		int[] b = new int[arr.length];
		for(int i = 0; i < 6; i++){
			c[i] = 0;
		}
		for(int i = 0; i < arr.length; i++){
			c[arr[i]] += 1;
		}

		for(int i = 1; i < 6; i++){
			c[i] += c[i - 1];
		}

		for(int i = arr.length; i ; i--){
			b[c[arr[i]]] = arr[i];
			System.out.println("b[" + arr[i] + "] = " + arr[i]);
			c[arr[i]] = c[arr[i]] - 1;
			System.out.println("c[" + arr[i] + "] = " + (c[arr[i]] - 1));
		}	
		// for(int i = 0; i < 6; i++){
		// 	System.out.println(c[i]);
		// }
	}
}