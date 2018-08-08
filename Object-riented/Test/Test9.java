public class Test9{
	public static void main(String[] args){
		WanDa wd = new WanDa();
		buyHouse(wd);
		buyHouse(new LianJia(){
			
			@Override
			public void price(){
				System.out.println("��ʮ��");
			}
	
			@Override
			public void address(){
				System.out.println("�Ͼ�");
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
		System.out.println("ʮ��");
	}
	
	@Override
	public void address(){
		System.out.println("����");
	}
}