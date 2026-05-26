package arrayPractice;

public class Smart {
	int[] arr;
	
	public Smart(int arr2) {
		this.arr = new int[arr2];
		
//		for(int arr1 : arr) {
//			System.out.println(arr1);
//		}
	}
	
	public void printArr(int a) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(a);
	}
	

}
