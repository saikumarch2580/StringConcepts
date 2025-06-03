package NaveenJava;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatevaluesInArraya {

	public static void main(String[] args) {

		int arr[] = { 34, 33, 33, 42, 43, 44, 34, 33, 44, 43, 23 };

		Set<Integer> duplicates = new LinkedHashSet<>();

		for (int i = 0; i < arr.length; i++) {

			if (duplicates.contains(arr[i])) {

				
			} else {

				duplicates.add(arr[i]);
				
				System.out.println(arr[i]);
			}

		}

	}

}
