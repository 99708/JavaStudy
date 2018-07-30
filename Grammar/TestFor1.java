//break 跳出最近的循环

public class TestFor1{
	public static void main(String[] args){
		
		/*for(int i=1; i<=100; i++){
			System.out.println(i);
			if(i == 40){
				break;
			}
		}*/
		for(int i=1; i<=100; i++){
			System.out.println(i);
			while(i == 40){
				break;
			}
		}
		
	}
}