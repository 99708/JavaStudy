import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class TestBinary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������");
		if(!sc.hasNextInt()){
			System.out.println("�����������������������룡");
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
			System.out.println(a + " ת��֮��Ķ�����Ϊ��");
			for(int i=arr.size()-1; i>=0; i--){
				System.out.print(arr.get(i));
			}
		}
	}
}