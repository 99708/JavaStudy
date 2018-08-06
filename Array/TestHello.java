public class TestHello{
	public static void main(String[] args){
		final Other o=new Other();
		//new TestHello().addOne(o);//1
		System.out.println(o.i);
	}
	public void addOne( Other o){
		o.i++;//2
		o =  new Other();//3
	}
}
class Other{
	public int i;
}

