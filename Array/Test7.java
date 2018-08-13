public class Test7{
	
	public static void main(String[] args){
		add();
		add(1);
		add(1,2);
//		add(new int[]{4, 5, 6});
	}
	
	public static void add(int...arr){
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++){
			sum = sum + arr[i];
		}
		
		System.out.println(sum);
	}
	public static void add(int a){
		
		int sum = a;
		System.out.println(sum);
	}
	
	public static void add(int a, int b){
		
		int sum = a;
		System.out.println(a * b);
	}
}