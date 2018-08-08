package com.xyq.music;

public class Test11{
	public static void main(String[] args){
		Erhu e = new Erhu();
		Piano p = new Piano();
		Violin v = new Violin();
		
		Musician m = new Musician();
		m.play(e); 
		m.play(p); 
		m.play(v); 
	}
}