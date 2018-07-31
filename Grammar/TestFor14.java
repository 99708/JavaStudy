public class TestFor14{
	public static void main(String[] args){
		//正方形长度：
		int size=9;
		//中轴线对应的列：
		int center=size/2+1;
		
		//每行的起始位置：
		int startNum=center;//局部变量，必须进行初始化  
		//每行的结束位置：
		int endNum=center;
		
		//引入一个开关：
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