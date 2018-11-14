import java.util.ArrayList;

public class convexPolygon {
	
	public static void main(String[] args) {
		
		int total = 538;
		
		int[] numArr = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
				101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179};
		
		ArrayList<int []> combos = new ArrayList<int []>(); 
		
		for (int i = 0; i < numArr.length; ++i) {
			for (int j = i+1; j < numArr.length; ++j) {
				for (int k = j+1; k < numArr.length; ++k) {
					for (int l = k+1; l < numArr.length; ++l) {
						if (numArr[i] + numArr[j] + numArr[k] + numArr[l] == 538) {
							int[] possCombo = {numArr[i], numArr[j], numArr[k], numArr[l]};
							combos.add(possCombo);
						}
					}
				}
			}
		}
		
		
		for (int [] arr : combos) {
			int index = combos.indexOf(arr);
			for (int i : arr) {
				System.out.print(index +":   " + i + ", ");
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < combos.size(); i++) {
			int[] arr = combos.get(i);
			int digitSum = 0;
			for (int j : arr) {
				while (j > 0) {
					digitSum += j % 10;
					j = j / 10;
				}
			}
			System.out.println(i + "  " + digitSum);
		}
		
	}
}
