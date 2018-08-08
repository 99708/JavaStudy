public class Test10{
	public static void main(String[] args){
		new Animal();
		new Animal();
		new Animal();
		new Animal();
		new Animal();
		for(int i=0; i<10; i++){
			System.gc();
		}
	}
}

class Animal{
	int age;
	
	@Override
	protected void finalize()throws Throwable{
    	System.out.println("垃圾回收器开始工作了");     
    }
}
