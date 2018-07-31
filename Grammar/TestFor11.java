import java.util.Scanner;

public class TestFor11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入菱形的大小");
		int size = sc.nextInt();
		int center = size/2;
		
		for(int i=0; i<(center + 1); i++){
			for(int j=0; j<(center+4-i); j++){
				System.out.print(" ");
			}
			for(int k=0; k<(2*i + 1); k++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<(center); i++){
			for(int j=0; j<(i+5); j++){
				System.out.print(" ");
			}
			for(int k=0; k<((2*center-1) - 2*i); k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}