package PracticeOne;

public class FrequencyOfElementsInAnArray {

	public static void main(String[] args) {
	
		int[] arr = {2,44,5,35,25,33,44,35};
		
		int[] visitedArr = new int[arr.length];
		
		int visited =-1;
		
		for(int i=0; i<arr.length; i++){

			int count =1;

			for (int j=i+1; j<arr.length; j++){

			if(arr[i]==arr[j]){
			count++;
			visitedArr[j]=count;
			}
			}
		}
			for(int i=0; i<visitedArr.length; i++){

			if(visitedArr[i]!=visited){
			
			}
			System.out.println("frequency of "+arr[i]+" : "+visitedArr[i]);
			}
			
		}

	}


