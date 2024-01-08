package com.test2;

public class Nib {
	
	String materialType;
	int width;
	
	public Nib()
	{
		
	}
	public Nib(String material, int wd)
	{
		this.materialType=material;
		this.width=wd;
	}

	public String getMaterialType() {
		return materialType;
	}


	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Nib [materialType=" + materialType + ", width=" + width + "]";
	}
	
	
}
