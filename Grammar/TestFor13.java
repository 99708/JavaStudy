public class TestFor13{
	public static void main(String[] args){
	/*����5��Ǯһֻ��ĸ��3��Ǯһֻ��С��3ֻһ��Ǯ����100��Ǯ��һ��ֻ��,
	���й�����ĸ����С��������Ҫ�У��ʹ�����ĸ����С��Ҫ�����ֻ�պô���100��Ǯ��*/
		for(int i=1; i<20; i++){
			for(int j=1; j<32; j++){
				int k = 100 - (i+j);
				if((i+j+k == 100) && (5*i+3*j+k/3 == 100) && (k%3 == 0)){
					System.out.println(i+"---"+j+"---"+k);
				}
			}
		}

	}
}