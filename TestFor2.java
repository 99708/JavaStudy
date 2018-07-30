public class TestFor2{
	public static void main(String[] args){
		for(int i=1; i<=100; i++){
			if(i == 25){
				break;
			}
			System.out.println(i);
		}
		System.out.println("循环结束！");
		/*for(int i=1; i<=100; i++){
			if(i == 25){
				return;
			}
			System.out.println(i);
		}
		System.out.println("循环结束！");
		/*for(int i=1; i<=100; i++){
			if(i == 25){
				continue;
			}
			System.out.println(i);
		}
		System.out.println("循环结束！");*/
	}
}