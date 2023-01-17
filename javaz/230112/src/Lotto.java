
public class Lotto {

	public static void main(String[] args) {
		int[] ball = new int[45];
		
		for(int i = 0; i < ball.length; i++) {
			ball[i] = i+1;
		}
		
		for(int j = 0; j < 1000; j++) {
			int idx1 = (int)(Math.random() * 45);
			int idx2 = (int)(Math.random() * 45);
			
			if(idx1 != idx2) {
				int temp = ball[idx1];
				ball[idx1] = ball[idx2];
				ball[idx2] = temp;
			}
		}
		
		for(int k = 0; k < 6; k++) {
			System.out.print(ball[k] + "\t");
		}
		
	}

}
