public class Test9{
	public static void main(String[] args){
		WanDa wd = new WanDa();
		buyHouse(wd);
		buyHouse(new LianJia(){
			
			@Override
			public void price(){
				System.out.println("二十万");
			}
	
			@Override
			public void address(){
				System.out.println("南京");
			}
		});
	}
	
	public static void buyHouse(LianJia lj){
			lj.price();
			lj.address();
		}
}

interface LianJia{
	public void price();
	public void address();
}

class WanDa implements LianJia{

	@Override
	public void price(){
		System.out.println("十万");
	}
	
	@Override
	public void address(){
		System.out.println("二环");
	}
}