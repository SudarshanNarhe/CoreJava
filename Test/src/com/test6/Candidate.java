package com.test6;

import java.util.PriorityQueue;

public class Candidate implements Comparable<Candidate>{

	int id;
	String name;
	int m1,m2,m3;
	double percentage=0;
	public Candidate() {
		
	}

	public Candidate(int id, String name, int m1, int m2, int m3) {
		super();
		this.id = id;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		calPercentage();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}
	
	public double calPercentage() {
		int sum=m1+m2+m3;
		//System.out.println("Sum is : "+sum);
		percentage=(sum*100)/300;
		return percentage;
	}

	@Override
	public int compareTo(Candidate o1) {
		if(o1.percentage>this.percentage)
		return 1;
		else if(o1.percentage<this.percentage)
			return -1;
		else 
			return 0;
	}
	
	@Override
	public String toString() {
		return "Candidate [id=" + id + ", name=" + name + ",Percentage : "+percentage+"]";
	}
	public static void main(String[] args) {
		
		PriorityQueue<Candidate> std= new PriorityQueue<Candidate>();
		std.add(new Candidate(1, "Sudarshan", 90, 70, 89));
		std.add(new Candidate(2,"Pavan",50,73,69));
		std.add(new Candidate(3,"Nitin",70,94,83));
		std.add(new Candidate(4,"Suraj",60,83,71));
		std.add(new Candidate(5,"Maruti",50,30,30));
		
		Candidate c;
		while((c=std.poll())!=null) {
			System.out.println(c+ "\n");
		}
		
		
	}

	
}
