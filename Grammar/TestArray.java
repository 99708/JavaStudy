public class TestArray{
	public static void main(String[] args){
		
		int[] a = {15, 10, 35, 60, 50};
		int max, min, j, k;
		max = min = a[0];
		j = k = 0;
		
		for(int i=0; i<a.length; i++){
			if(max < a[i]){
				max = a[i];
				j = i;
			}
			if(min > a[i]){
				min = a[i];
				k = i;
			}
		}
		
		System.out.print("��̬��ʼ��������Ϊ��");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+ " ");
		}
		
		System.out.println();
		
		System.out.println("���ֵΪ��" + max + " ��Ӧ������Ϊ��" + j);
		System.out.println("��СֵΪ��" + min + " ��Ӧ������Ϊ��" + k);
	}
}