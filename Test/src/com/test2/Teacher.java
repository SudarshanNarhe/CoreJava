package com.test2;

public abstract class Teacher {

	int tid;
	long mob;
	
	Teacher()
	{
		
	}
	public Teacher(int id, long mob)
	{
		this.tid= id;
		this.mob=mob;
	}
	public abstract void salary();
	@Override
	public String toString() {
		return "Teacher Id : " + tid + "\nmob =" + mob;
	}
	
	
}
