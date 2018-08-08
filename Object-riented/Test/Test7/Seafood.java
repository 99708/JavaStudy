package com.xyq.pizza;

public class Seafood extends Pizza{
	private String material;
	
	public void setMaterial(String material){
		this.material = material;
	}
	public String getMaterial(){
		return material;
	}
	
	public Seafood(String name, float price, float size, String material){
		super(name, price, size);
		this.material = material;
	}
	
	@Override
	public void show(){
		super.show();
		System.out.print("≈‰¡œ£∫" + material);
	}
}