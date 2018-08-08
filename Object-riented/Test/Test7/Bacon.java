package com.xyq.pizza;

public class Bacon extends Pizza{
	
	private float quality;
	
	public void setQuality(float quality){
		this.quality = quality;
	}
	public float getQuality(){
		return quality;
	}
	
	public Bacon(String name, float price, float size, float quality){
		super(name, price, size);
		this.quality = quality;
	}
	
	@Override
	public void show(){
		super.show();
		System.out.println("培根克数：" + quality + "克");
	}
}