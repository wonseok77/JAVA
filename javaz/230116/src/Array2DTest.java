
public class Array2DTest {

	public static void main(String[] args) {
		int[] array1 = new int[] {1, 2, 3, 4};
		
		int[][] array2 = new int[][] {
			{10, 20, 30, 40},
			{1, 2, 3, 4},
			{100, 200, 300, 400},
		};
		
		int[][] array3 = new int[4][];
		array3[0] = new int[] {10, 20, 30, 40};
		array3[1] = new int[] {1, 2, 3, 4};
		array3[2] = new int[] {100, 200, 300, 400};
		
		System.out.println(array3.length);
		System.out.println(array3[0].length);
		
		int[][] array4 = new int[][] {
			{10, 20, 30, 40, 0},
			{1, 2, 3, 4, 0},
			{100, 200, 300, 400, 0},
			{0, 0, 0, 0, 0}
		};
		
		for(int i = 0; i < array4.length - 1; i++) {
			int rtot = 0;
			for(int j = 0; j < array4[0].length - 1; j++) {
				rtot += array4[i][j];
			}
			array4[i][array4.length] = rtot;
		}
		
		for(int j = 0; j <array4[0].length; j++) {
			int ctot = 0;
			for(int i = 0; i < array4.length - 1; i++) {
				ctot += array4[i][j];
			}
			array4[array4.length - 1][j] = ctot;
		}
		
		for(int i = 0; i < array4.length; i++) {
			for(int j = 0; j <array4[0].length; j++) {
				System.out.print(array4[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}

}
