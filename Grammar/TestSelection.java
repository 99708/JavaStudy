public class TestSelection{
	public static void main(String[] args){
		
		int[] a = {1, 8, 9, 2, 6};
		int k = 0, t = 0;
		
		System.out.print("��ʼ��������Ϊ��");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");	
		} 
		
		for(int i=0; i<a.length; i++){
			
			k = i;
			
			for(int j=k+1; j<a.length; j++){
				if(a[k] > a[j]){
					k = j;
				}
			}
			if(k != i){
				t = a[i];
				a[i] = a[k];
				a[k] = t;
			}
		}
		
		System.out.println();
		
		System.out.print("��������������Ϊ��");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");	
		}
	}
}