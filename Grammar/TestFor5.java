public class TestFor5{
	public static void main(String[] args){
		for(int i=100; i<1000; i++){
			int ge = i % 10;
			int bai = (i / 10) % 10;
			int qian = (i / 100) % 10;
			int ge1 = ge * ge * ge;
			int bai1 = bai * bai * bai;
			int qian1 = qian * qian * qian; 
			if(ge1 + bai1 + qian1 == i){
				System.out.println(i);
			} 
		}
	}
}