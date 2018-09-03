package javabasic;

public class O {
	
	public static void main(String[] args) {
		int[] a = daySoNT(10);
		for (int i=0; i<a.length; i++) 
			System.out.print(a[i] + "  ");
	}

	public static boolean soNT(int number) {
		if (number<2)
			return false;
		else {
			for (int i=2; i<=Math.sqrt(number); i++) {
				if (number%i==0)
					return false;
			}
		}
		return true;
	}
	
	private static int[] daySoNT(int len) {
		int[] a= new int[len];
		int index =0, num = 2;
		while(index<len) {
			if(soNT(num)) {
				a[index++]=num;
			}
			num++;
		}
		
		return a;
	}
	
	public static int[][] spiral(int n) {
		int row =0;		int col =0;
		int wid =n;		int hei =n;
		int[][] spiral = new int[n][n];
		int index=0, len=n*n;
		int[] prime = daySoNT(len);
		while(index<=len) {
			for (int i =col; i <wid; i++) {
				spiral[col][i] = prime[index++];
			}
			for (int j =row+1; j <hei; j++) {
				spiral[j][hei-1] = prime[index++];
			}
			for (int x =wid-2; x >=col; x--) {
				spiral[wid-1][x] = prime[index++];
			}
			for (int y =hei-2; y >row; y--) {
				spiral[y][col] = prime[index++];
			}
			wid--;
			hei--;
			row++;
			col++;
		}
		
		return spiral;
	}
	
}
