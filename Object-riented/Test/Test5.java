public class Test5{
	public static void main(String[] args){
		A a = new A();
		a.a();
		a.b();
		a.c();
		System.out.println(B.IM);
	}
}

interface B{
	int IM = 5;
	
	public  void a();
	
	public  void b();
}

interface C{
	public void c();
}

class A implements B, C{
	
	@Override
	public void a(){
		System.out.println("aaa");
	}
	
	@Override
	public void b(){
		System.out.println("bbb");
	}
	
	@Override
	public void c(){
		System.out.println("ccc");
	}
}