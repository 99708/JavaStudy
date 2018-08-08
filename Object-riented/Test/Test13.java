public class Test13{
	public static void main(String[] args){
		Artist a = new Artist("马素素");
		System.out.println("大家好！我是"+ a.getName());
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
		System.out.println("我可以演电影");
	}
	
	@Override
	public void showTV(){
		System.out.println("我可以演电视剧");
	}
	
	@Override
	public void showMusic(){
		System.out.println("我可以唱歌");
	}
	
}