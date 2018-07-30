public class TestFor4{
	public static void main(String[] args){
		/*for(int i=1; i<=100; i++){
			while(i == 25){
				break;
			}
			System.out.println(i);
		}
		System.out.println("循环结束！");*/
		/*for(int i=1; i<=100; i++){
			while(i == 25){
				return;
			}
			System.out.println(i);
		}
		System.out.println("循环结束！");*/
		for(int i=1; i<=100; i++){
			while(i == 25){//i一直是25 会处于死循环状态
				//跳出while的本次循环是i是25，进行while的下一次循环时i还是25
				continue;
			}
			System.out.println(i);
		}
		System.out.println("循环结束！");
	}
}