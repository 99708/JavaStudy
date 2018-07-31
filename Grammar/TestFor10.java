import java.util.Scanner;

public class TestFor10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("录入的菱形大小：");
		int size=sc.nextInt();
		int center=size/2;
		 
		for(int j=1;j<=(center+1);j++){//j---控制行数  
			//每行前面的空格：
			for(int i=1;i<=(center+5-j);i++){
				System.out.print(" ");
			}
			
			for(int i=1;i<=(2*j-1);i++){//i----控制 * 的个数 
				 
				 if(i==1 || i==(2*j-1)){
				 	System.out.print("*");
				 }else{
				 	System.out.print(" ");
				 }
			}
			System.out.println();//每打完一行，换行操作。
		}
		
		//下部分三角：
		for(int j=1;j<=center;j++){//j---控制行数  
			//每行前面的空格：
			for(int i=1;i<=(j+4);i++){
				System.out.print(" ");
			}
			
			for(int i=1;i<=(size-2*j);i++){//i----控制 * 的个数 
				 
				if(i==1 || i==(size-2*j)){
				 	System.out.print("*");
				}else{
				 	System.out.print(" ");
				}
				
			}
			System.out.println();//每打完一行，换行操作。
		}	
    }
}		
		