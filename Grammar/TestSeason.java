import java.util.Scanner;

public class TestSeason{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÔÂ·Ý£º");
		int yf = sc.nextInt();
		if(!(yf > 0 && yf <= 12)){
			System.out.println("ÄúµÄÊäÈëÓÐÎó£¬Çë¼ì²éÄúµÄÊäÈë");
		}else{
			if(yf <= 3){
				System.out.println("´ºÌì-ô©Å¯»¨¿ª ´ºÒâ°»È»-Ö²Ê÷ Ì¤Çà");
			}else if(yf <= 6){
				System.out.println("ÏÄÌì-ÏÄÈÕÑ×Ñ× ÏÄÓêÓêÈË-ÓÎÓ¾ ³ÔÑ©¸â");
			}else if(yf <= 9){
				System.out.println("ÇïÌì-ÌìÀÊÆøÇå Çï¸ßÆøË¬-ÉÍÔÂ µÇ¸ß");
			}else{
				System.out.println("¶¬Ìì-°ÁÑ©ÁèËª °×Ñ©°¨°¨-¶ÑÑ©ÈË »¬Ñ©");
			}
		}
	}
}