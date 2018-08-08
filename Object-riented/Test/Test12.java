public class Test12{
	public static void main(String[] args){
		
		VideaCard vc = new VideaCard();
		vc.send();
		
		AudioCard ac = new AudioCard();
		ac.send();
		
		NetCard nc = new NetCard();
		nc.send();
	}
}

interface PCI{
	public void send();
}

class VideaCard implements PCI{
	@Override
	public void send(){
		System.out.println("我是显卡我发送数据");
	}
}

class AudioCard implements PCI{
	@Override
	public void send(){
		System.out.println("我是声卡我发送数据");
	}
}

class NetCard implements PCI{
	@Override
	public void send(){
		System.out.println("我是网卡我发送数据");
	}
}