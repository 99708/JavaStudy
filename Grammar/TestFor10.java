import java.util.Scanner;

public class TestFor10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("¼������δ�С��");
		int size=sc.nextInt();
		int center=size/2;
		 
		for(int j=1;j<=(center+1);j++){//j---��������  
			//ÿ��ǰ��Ŀո�
			for(int i=1;i<=(center+5-j);i++){
				System.out.print(" ");
			}
			
			for(int i=1;i<=(2*j-1);i++){//i----���� * �ĸ��� 
				 
				 if(i==1 || i==(2*j-1)){
				 	System.out.print("*");
				 }else{
				 	System.out.print(" ");
				 }
			}
			System.out.println();//ÿ����һ�У����в�����
		}
		
		//�²������ǣ�
		for(int j=1;j<=center;j++){//j---��������  
			//ÿ��ǰ��Ŀո�
			for(int i=1;i<=(j+4);i++){
				System.out.print(" ");
			}
			
			for(int i=1;i<=(size-2*j);i++){//i----���� * �ĸ��� 
				 
				if(i==1 || i==(size-2*j)){
				 	System.out.print("*");
				}else{
				 	System.out.print(" ");
				}
				
			}
			System.out.println();//ÿ����һ�У����в�����
		}	
    }
}		
		