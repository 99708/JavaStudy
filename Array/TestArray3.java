import java.util.Scanner;

public class TestArray3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		int[] hao = new int[6];
		int[] zhong = new int[6];
		int lan=0;
		int zhongLan=0;
		do{
			System.out.println("*****欢迎进入双色球彩票系统********");
			System.out.println("\t1.购买彩票");
			System.out.println("\t2.查看开奖");
			System.out.println("\t3.退出");
			System.out.println("************************************");
			System.out.println("请选择菜单");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("购买彩票");
					System.out.println("你需要下多少注？");
					int num = sc.nextInt();
					System.out.println("请输入六个红色球号码：(1-33,以空格分隔)");
					for(int i=0; i<6; i++){
						hao[i] = sc.nextInt();
					}
					System.out.println("请输入蓝色球号码：(1-16)");
					lan = sc.nextInt();
					flag = true;
					System.out.print("你一共买了" + num +"注,共需支付"+(2*num)+"元,你所选号码为；");
					for(int i=0; i<6; i++){
						System.out.print(hao[i] + "\t");
					}
					System.out.println(lan);
					break;
				case 2:
					System.out.println("查看开奖");
					if(flag){
						System.out.print("你已买的号码为：");
						for(int i=0; i<6; i++){
							System.out.print(hao[i] + "\t");
						}
						System.out.println(lan);
						zhongLan = makeZhong(zhong, zhongLan);
						System.out.print("中奖号码为：    ");
						for(int i=0; i<6; i++){
							System.out.print(zhong[i] + "\t");
						}
						System.out.println(zhongLan);
						isZhong(hao, lan, zhong, zhongLan);
					}else{
						System.out.println("您还没有购买彩票无法开奖");
					}
					break;
				case 3:
					System.out.println("谢谢使用！");
					return;
				default:
					System.out.println("输入错误！");
			}
		}while(true);
		
		
	}
	public static int makeZhong(int[] zhong, int lan){
		for(int i=0; i<6; i++){
			zhong[i] = i;
		}
		lan = (int)(Math.random()*16) + 1;
		return 5;
	}
	
	public static void isZhong(int[] hao, int lan, int[] zhong, int zhongLan){
		int k=0;
		for(int i=0; i<6; i++){
			for(int j=0; j<6; j++){
				if(hao[i] == zhong[j]){
					k++;
				}
			}
		}
		if(lan == zhongLan){
			switch(k){
				case 6:
					System.out.println("恭喜你中了1等奖");
					break;
				case 5:
					System.out.println("恭喜你中了3等奖");
					break;
				case 4:
					System.out.println("恭喜你中了4等奖");
					break;
				case 3:
					System.out.println("恭喜你中了5等奖");
					break;
				default:
					System.out.println("恭喜你中了6等奖");
			}
		}else{
			switch(k){
				case 6:
					System.out.println("恭喜你中了2等奖");
					break;
				case 5:
					System.out.println("恭喜你中了4等奖");
					break;
				case 4:
					System.out.println("恭喜你中了5等奖");
					break;
				default:
					System.out.println("很遗憾你没有中奖！");
			}
		}
		
	}
}