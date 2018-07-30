import java.util.Scanner;

public class TestAMT{
	public static void main(String[] args){
		
		int con = 3, q = 1000;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请（插入）您的银行卡：");
		String name = sc.next();
		
		while(con > 0){
			System.out.println("请输入您的密码：");
			int passWord = sc.nextInt();
			
			if(passWord != 888888){
				System.out.println("对不起，密码输入不正确！！！，您还有" + (con -1) + "次机会");
				con --;
			}else{
				String an = "y";
				while("y".equals(an)){
					System.out.println("请选择您要进行的操作，并输入选项前的数字");
					System.out.println("1. 取款  2. 存款  3.查询余额   4.转账   5.退出");
					int choice = sc.nextInt();
					switch(choice){
						case 1:
							System.out.println("您选择的是取款操作，请输入取款金额：");
							int qu = sc.nextInt();
							if(qu > 0){
								if(qu > q){
								System.out.println("余额不足,操作失败！");
								}else{
									q = q - qu;
									System.out.println("请取走您的钞票");
								}
							}else{
								System.out.println("请输入正确的金额！");
							}
							break;
						case 2:
							System.out.println("您选择的是存款操作，请将整理好的钞票放入入钞口：");
							int cun = sc.nextInt();
							if(cun > 0){
								q = q + cun;
								System.out.println("恭喜您，存款成功！");
							}else{
								System.out.println("存入的钞票是假币，无效没收！");
							}
							break;
						case 3:
							System.out.println("您选择的是查询余额操作：");
							System.out.println("您卡上的余额是：" + q);
							break;
						case 4:
							System.out.println("您选择的是转账操作，请输入转账金额：");
							int zhuan = sc.nextInt();
							if(zhuan > 0){
								if(zhuan < q){
									q = q - zhuan;
									System.out.println("转账成功");
								}else{
									System.out.println("余额不足,请确保卡上余额大于转账金额");
								}
							}else{
								System.out.println("转账失败，请输入正确的金额！");
							}
							break;
						case 5:
							System.out.println("程序退出，谢谢您的使用");
							return;
						default:
							System.out.println("对不起，你输入的功能尚未开通");
					}
					System.out.println("继续吗？y/n");
					an = sc.next();
				}
				break;
			}
		}
		
		if(con == 0){
			System.out.println("对不起，您的卡已被锁定!!!");
		}
		
	}
}