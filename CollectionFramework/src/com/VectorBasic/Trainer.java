package com.VectorBasic;

public class Trainer {

	String name;
	int exp;
	String quli;
	
	public Trainer() {
		
	}
	public Trainer(String name, int exp, String quli) {
		this.exp=exp;
		this.name=name;
		this.quli=quli;	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getQuli() {
		return quli;
	}
	public void setQuli(String quli) {
		this.quli = quli;
	}
	@Override
	public String toString() {
		return "Trainer [name=" + name + ", exp=" + exp + ", quli=" + quli + "]";
	}
	
	
	
}
