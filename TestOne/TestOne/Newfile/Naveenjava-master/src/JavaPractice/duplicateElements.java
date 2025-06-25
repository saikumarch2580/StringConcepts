package JavaPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class duplicateElements {

	public static void main(String[] args) {
		// duplicate elements from an integer array {1,2,4,2,5,0,1,6,5}

		int[] arr = { 1, 2, 4, 2, 5, 0, 1, 6, 5 };

		//Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length ; i++) {

			set.add(arr[i]);
		}
System.out.println(set);
	}

}
