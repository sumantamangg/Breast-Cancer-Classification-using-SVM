package com.nce.action;

import java.util.Random;

import com.nce.daoimpl.TrainDaoImpl;

public class TrainSVM {
    static int m=50;
    static int n=9;
	static double[] alphai=new double[m];
	static double[] alphaj=new double[m];
	static double b=0;
	static int passes=0;
	static int[][] x=new int[m][n]; 
	static int[] y=new int[m];
	static double resulti;
	static double resultj;
	static double ita;
	public void enterSvm(int[][] sList) {
		// TODO Auto-generated method stub
		/** to separate the training data from respective outputs**/
		for (int i=0; i<m; i++){
			for(int j=0;j<10; j++){
				if(j==9){
					y[i]=sList[i][j];
				}
				else {
					x[i][j]=sList[i][j];
				}
			}
		}/** to convert corresponding 2 and 4 output in form of 1 and -1**/
		for (int i=0; i<m; i++){
			if(y[i]==2){
				y[i]=1;
			}
			else {
				y[i]=-1;
			}
		}
		CalculateE obj=new CalculateE();
		while (passes<1000){
			int num_changed_alpha=0;
			for (int i=0; i<m; i++){
				resulti=obj.calcE(x,getXonly(i),y,b,alphai,i);
				if((y[i]*resulti<-0.1) && alphai[i]<1 || (y[i]*resulti>0.1 && alphai[i]>0)){
					Random rand = new Random();
                    int  j = rand.nextInt(m-1) + 0;
                    if(j==i){                       // random j so j not equals to i condition
                        j = rand.nextInt(m-1) + 0;
                      }
                    if(j==i){                       // random j so j not equals to i condition
                        j = rand.nextInt(m-1) + 0;
                      }
                    if(j==i){                       // random j so j not equals to i condition
                        j = rand.nextInt(m-1) + 0;
                      }
                    if(j==i){                       // random j so j not equals to i condition
                        j = rand.nextInt(m-1) + 0;
                      }
                    if(j==i){                       // random j so j not equals to i condition
                        j = rand.nextInt(m-1) + 0;
                      }
                    double alpi=0.0; double alpj=0.0;
                	resultj=obj.calcE(x,getXonly(j),y,b,alphai,j);
                	alpi=alphai[i];
                    alpj=alphaj[j];
                	double[] temp=computeLH(alpi,alpj,i,j);
                	if(temp[0]==temp[1]){
                		//System.out.println(temp);
                		continue;
                }
                	ita=2*kernel(i,j)-kernel(i,i)-kernel(j,j);
                	if(ita>=0){
                    	continue;
                    }
                	 alphaj[j]=alpj-(y[j]*(resulti-resultj))/ita;
                	 if(alphaj[j]>temp[1]){
                     	alphaj[j]=temp[1];
                     }
                     else if(temp[0]<=alphaj[j] && alphaj[j]<=temp[1]){
                     	alphaj[j]=alphaj[j];
                     }
                     else if(alphaj[j]<temp[0]){
                     	alphaj[j]=temp[0];
                     }
                	 if(Math.abs(alphaj[j]-alpj)<0.0001){
                     	continue;
                     }
                     alphai[i]=alphai[i]+y[i]*y[j]*(alpj-alphaj[j]);
                     double b1; double b2;
                     b1=b-resulti-y[i]*(alphai[i]-alpi)*kernel(i,i)-y[j]*(alphaj[j]-alpj)*kernel(i,j);
                     //System.out.println("bias= "+b1);
                     b2=b-resultj-y[i]*(alphai[i]-alpi)*kernel(i,j)-y[j]*(alphaj[j]-alpj)*kernel(j,j);
                     if((0<alphai[i]) && (alphai[i]<0.1)){
                     	b=b1;
                     }
                     if((0<alphaj[j]) && (alphaj[j]<0.1)){
                     	b=b2;
                     }
                     else {
                     	b=(b1+b2)/2;
                     }
                     num_changed_alpha=num_changed_alpha+1;
				}
			}
			if(num_changed_alpha == 0){
				passes=passes+1;
			}
			else {
				passes=0;
			}
			System.out.println(passes);
		}
		double[] ress=new double[9];
		for (int i=0; i<9; i++){
			for( int j=0; j<m; j++){
			ress[i]+=alphai[j]*y[j]*x[j][i];
			}
		}
for (int i=0; i<9; i++){
			
			System.out.println("W= "+ress[i]);
		
	}
System.out.println("b= "+b);
TrainDaoImpl daoImpl=new TrainDaoImpl();
daoImpl.ccalculatebe(b,ress);
	}
	
	/** to calculate ita **/
	private static double kernel(int i, int j2) {
		// TODO Auto-generated method stub
		int res=0;
		for(int j=0; j<9;j++){
			res+=x[i][j]*x[j2][j];
		}
		return Math.pow(res,2);
	}
	/**to compute L and H**/
	private static double[] computeLH(double alpi, double alpj, int i, int j) {
		// TODO Auto-generated method stub
	    double L;
	    double H;
		if(y[i]!=y[j]){
			 L=Math.max(0,alpj-alpi);
			 H=Math.min(1,1+alpj+alpi);
		}
		else{
			 L=Math.max(0, alpi+alpj-1);
			 H=Math.min(0, alpi+alpj);
		}
		double [] p=new double[2];
		p[0]=L;
		p[1]=H;
		return p;
	
	}
	private static int[] getXonly(int i) {
		// TODO Auto-generated method stub
		int[] oneda=new int[9];
		for(int j = 0; j<9;j++){
			oneda[j]= x[i][j];	
		}
		return oneda;
	}
	
	
}
