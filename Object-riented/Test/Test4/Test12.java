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
		System.out.println("�����Կ��ҷ�������");
	}
}

class AudioCard implements PCI{
	@Override
	public void send(){
		System.out.println("���������ҷ�������");
	}
}

class NetCard implements PCI{
	@Override
	public void send(){
		System.out.println("���������ҷ�������");
	}
}