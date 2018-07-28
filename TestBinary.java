import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class TestBinary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		if(!sc.hasNextInt()){
			System.out.println("您的输入有误请检查您的输入！");
		}else{
			List<Integer> arr = new ArrayList<Integer>();
			int num = sc.nextInt();
			int a = num;
			int t;
			while(num / 2 != 0){
				t = num % 2;
				num = num / 2;
				arr.add(t);
			}
			arr.add(num % 2);
			System.out.println(a + " 转换之后的二进制为：");
			for(int i=arr.size()-1; i>=0; i--){
				System.out.print(arr.get(i));
			}
		}
	}
}