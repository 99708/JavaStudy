public class TestFor4{
	public static void main(String[] args){
		/*for(int i=1; i<=100; i++){
			while(i == 25){
				break;
			}
			System.out.println(i);
		}
		System.out.println("ѭ��������");*/
		/*for(int i=1; i<=100; i++){
			while(i == 25){
				return;
			}
			System.out.println(i);
		}
		System.out.println("ѭ��������");*/
		for(int i=1; i<=100; i++){
			while(i == 25){//iһֱ��25 �ᴦ����ѭ��״̬
				//����while�ı���ѭ����i��25������while����һ��ѭ��ʱi����25
				continue;
			}
			System.out.println(i);
		}
		System.out.println("ѭ��������");
	}
}