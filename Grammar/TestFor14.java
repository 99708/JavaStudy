public class TestFor14{
	public static void main(String[] args){
		//�����γ��ȣ�
		int size=9;
		//�����߶�Ӧ���У�
		int center=size/2+1;
		
		//ÿ�е���ʼλ�ã�
		int startNum=center;//�ֲ�������������г�ʼ��  
		//ÿ�еĽ���λ�ã�
		int endNum=center;
		
		//����һ�����أ�
		boolean flag=true;
		
		for(int j=1;j<=size;j++){
			for(int i=1;i<=size;i++){
				if(i>=startNum&&i<=endNum){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
			
			if(endNum-startNum+1==size){
				flag=false;
			}
			
			if(flag){
				startNum--;
				endNum++;
			}else{
				startNum++;
			    endNum--;
			}
		}
	}
}