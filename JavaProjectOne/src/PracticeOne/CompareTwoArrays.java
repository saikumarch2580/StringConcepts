package PracticeOne;

public class CompareTwoArrays {

	public static void main(String[] args) {
		
	 int[] arr = {2,3,5,35,64,26};
	 
	 int[] arr2 = {4,5,64,34,60,56,77,42};
	 
	 int arr3 =0;
	 
	 for(int i=0; i<arr.length; i++) {
		 
		 for(int j=0; j<arr2.length; j++) {
			 
			 if(arr[i]==arr2[j]) {
				 
				arr3 = arr[i];
				System.out.println(arr3);
			 }
		 }
	 }

}
}