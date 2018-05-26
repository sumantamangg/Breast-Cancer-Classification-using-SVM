package training;

import java.util.Scanner;

public class First {
    static int[][] x=null;
	static int x1=0;
	static int x2=0;
    static int[] tmp=new int[175];
    static int[] y=new int[175];
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the lower number");
		x1=sc.nextInt();
		System.out.println("enter the highest number");
		x2=sc.nextInt();
		Connection obj=new Connection();
		x=obj.getdata(x1,x2);
//		for(int k=0; k<50;k++){
//			System.out.println(x[k][9]);
//		}
		for(int i=0;i<(x2-x1); i++){
			for (int j=0;j<10;j++){
				if(j==9){
					tmp[i]=x[i][j];
				}
			}
		}
		for (int i=0;i<(x2-x1); i++){
			if (tmp[i]==4){
				y[i]=-1;
			}
			else {
				y[i]=1;
			}
		}
		//System.out.println(y[9]);
		TrainSvm o=new TrainSvm();
		o.enterSvm(x,(x2-x1+1),y);
	}
}
