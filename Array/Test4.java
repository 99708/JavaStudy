public class Test4{
	public static void main(String[] args){
		
		int[] arr=new int[]{456,29,123,56,7377};
		int max, min, j, k;
		max = min = arr[0];
		k = j =0;
		
		for(int i=0; i<arr.length; i++){
			
			if(max < arr[i]){
				max = arr[i];
				j = i;
			}
			
			if(min > arr[i]){
				min = arr[i];
				k = i;
			}
		}
		
		System.out.println("������ǣ�"+ max+ "���±��ǣ�" + j + 
		"����С���ǣ�" + min + "���±��ǣ�" + k);
	}
}