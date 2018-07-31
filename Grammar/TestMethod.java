import java.util.Scanner;

public class TestMethod{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入行数：");
		int row = sc.nextInt();
		System.out.println("请输入列数：");
		int lie = sc.nextInt();
		output(row, lie);
	}
	
	public static void output(int row, int lie){
		for(int i=0; i<row; i++){
			for(int j=0; j<lie; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}