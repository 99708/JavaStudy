import java.util.Scanner;

public class TestArray2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份(YYYY)");
		int y = sc.nextInt();
		System.out.println("请输入月份(MM)");
		int m = sc.nextInt();
		System.out.println("请输入号数(DD)");
		int d = sc.nextInt();
		int t=0;
		int[] data = new int[12];
		for(int i=0; i<12; i++){
			if(i == 1 ){
				if((y%400 == 0) || (y%4 == 0 && y%100 != 0)){
					data[i] = 29;
				}else{
					data[i] = 28;
				}
				
			}else if((i<=6) && (i%2==0)){
				data[i] = 31;
			}else if((i<=11) && (i%2!=0)){
				data[i] = 31;
			}else{
				data[i] = 30;
			}
			
		}
		
		for(int i=0; i<m-1; i++){
			t = t+data[i];
		}
		System.out.println(y+"年"+m+"月"+d+"日 是该年的第"+(t+d)+"天");
	}
}