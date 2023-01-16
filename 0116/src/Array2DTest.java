
public class Array2DTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry1 = new int[] {1, 2, 3, 4};
		int n = arry1[0];
		
		int[][] arry2 = new int[][] {
			{10, 20, 30, 40},
			{1, 2, 3, 4,},
			{100,200,300,400}
		};
		int[][] arry3 = new int[4][];
		arry3[0] = new int[] {10,20,30,40,100};
		arry3[1] = new int[] {1,2,3,4,10};
		arry3[2] = new int[] {100,200,300,400,1000};
		arry3[3] = new int[] {111,222,333,444,1110};
		
		int[][] arry4 = new int[][] {
			{10,20,30,40,0},
			{1,2,3,4,0},
			{100,200,300,400,0},
			{0,0,0,0,0},
		};
		
//		System.out.println(arry3.length);
//		System.out.println(arry3[0].length);
//		System.out.println(
//				for(int i=0; i<arry3.length; i++) {
//					for(int j = 0; j<arry3[0].length; j++) {
//						System.out.println(arry3[i][j]);
//					}
//				}
//				);
		
		for(int i = 0; i<arry3.length-1; i++){
			int rtot = 0;
			for(int j=0; j<arry3[0].length-1; j++) {
				rtot+=arry3[i][j];
				arry3[3][4] += arry3[i][j];
			}
			arry3[i][4] = rtot;
			System.out.println(rtot);
		}
		
		for(int i = 0; i<arry3[0].length-1; i++) {
			int rtot = 0;
			for(int j=0; j<arry3.length-1; j++) {
				rtot+=arry3[j][i];
			}
			arry3[3][i] = rtot;
		}
		
		for(int i = 0; i<arry3.length-1; i++) {
			for(int j=0; j<arry3[0].length-1; j++) {
				System.out.println(arry3[i][j]+'\t');
			}
			System.out.println();
		}
	}

}
