public class Test13{
	public static void main(String[] args){
		Artist a = new Artist("������");
		System.out.println("��Һã�����"+ a.getName());
		a.showFilm();
		a.showTV();
		a.showMusic();
	}
}

interface Film {
	public void showFilm();
}

interface TV {
	public void showTV();
}

interface Music {
	public void showMusic();
}

class Artist implements Film, TV, Music{
	
	private String name;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public Artist(String name){
		this.name = name;
	}
	
	public Artist(){}
	
	@Override
	public void showFilm(){
		System.out.println("�ҿ����ݵ�Ӱ");
	}
	
	@Override
	public void showTV(){
		System.out.println("�ҿ����ݵ��Ӿ�");
	}
	
	@Override
	public void showMusic(){
		System.out.println("�ҿ��Գ���");
	}
	
}