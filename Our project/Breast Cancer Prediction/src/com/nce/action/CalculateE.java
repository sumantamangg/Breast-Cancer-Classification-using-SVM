package com.nce.action;

public class CalculateE {
    static int m=50;
	public double calcE(int[][] x, int[] is, int[] y, double b, double[] alphai,int p) {
		// TODO Auto-generated method stub

		int i=0;
		int j=0;
		int r=0;
		int[][] temp=null;
		/** calculate f(x) first**/
		for (i=0;i<m;i++){
			r+=alphai[i]*y[i]*kernel(x,is,i);
		}
		double f=r+b;
		double e=f-y[p];
		//System.out.println("the value of E is" +e);
		return e;
	}
	private int kernel(int[][] x, int[] is, int i) {
		// TODO Auto-generated method stub
		/** to change 2d array x to 1d for dot product**/
		int res=0;
		for(int j=0; j<9;j++){
			res+=x[i][j]*is[j];
		}
		return res;
	}
	
}
