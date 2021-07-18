import java.util.List;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int hourglassS(List<List<Integer>> arr) {
		int max_sum = Integer.MIN_VALUE;
		int current_sum = 0;
		for (int row = 0; row < 4; row++) { // sub 2 for not out of memory
			for (int col = 0; col < 4; col++) {
				current_sum = arr.get(row).get(col) + arr.get(row).get(col + 1) + arr.get(row).get(col + 2)
						+ arr.get(row + 1).get(col + 1) + arr.get(row + 2).get(col) + arr.get(row + 2).get(col + 1)
						+ arr.get(row + 2).get(col + 2);
				max_sum = Math.max(max_sum, current_sum);
			}

		}
		return max_sum;
	}

}
