public class TestOop1{
	public static void main(String[] args){
		Boy boy = new Boy();
		boy.name = "z3";
		Gril gril = new Gril();
		gril.name = "l4";
		Mother mother = new Mother();
		
		gril.mother = mother;
		gril.love(boy);
		gril.weChat();
	}
}
class Boy{
	String name;
	public void money(){
		System.out.println("ÂòÂòÂò");
	}

}
class Gril{
	String name;
	Mother mother;
	public void love(Boy boy){
		System.out.println(this.name + " ºÍ " + boy.name + " Ì¸Áµ°®");
	}
	public void weChat(){
		this.mother.laoDao();
	}
}
class Mother{
	public void laoDao(){
		System.out.println("ÂúÂúµÄÄ¸°®");
	}
}