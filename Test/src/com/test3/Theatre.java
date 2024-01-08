package com.test3;

import java.util.Arrays;

/*Create an array of Theatre to maintain data in sorted order of Movie Rating 
Theatre (Theatreid,Theatrename,location,Movie)
Movie (Movieid,Moviename,Rating)*/


public class Theatre {
	
	int Tid;
	String Tname;
	String location;
	Movie m;
	
	public Theatre()
	{
		
	}
	public Theatre(int id, String name, String location, Movie m )
	{
		Tid=id;
		Tname=name;
		this.location=location;
		this.m=m;
	}
	
	public int getTid() {
		return Tid;
	}
	public void setTid(int tid) {
		Tid = tid;
	}
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Theatre [Tid=" + Tid + ", Tname=" + Tname + ", location=" + location + ", m=" + m + "]";
	}
	public static void main(String[] args) {
		 
		Movie m1 = new Movie(101,"PK",6);
		Movie m2 = new Movie(102,"Sairat",9);
		Movie m3 = new Movie(103,"Kedarnath",8);
		
		Theatre t[]= new Theatre[3];
		t[0]= new Theatre(1, "PVR", "Pune", m1);
		t[1]= new Theatre(2, "INOX", "Mumbai", m2);
		t[2]= new Theatre(3, "S-Talkies", "Nashik", m3);
		
		
		System.out.println(Arrays.toString(t));
		System.out.println("-----------------------------------------------------------------------------");
		for(int i=0;i<t.length;i++)
		{		
			for(int j=i+1;j<t.length;j++) 
			{
				if(t[i].m.getRating()<t[j].m.getRating())
				{
					Theatre temp= t[i];
					t[i]=t[j];
					t[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(t));
		
	}

}


class Movie {
	
	int movieid;
	String movieNAme;
	int rating;
	
	public Movie()
	{
		//default...
	}
	public Movie(int id, String name, int rate)
	{
		movieid=id;
		movieNAme=name;
		rating = rate;
	}
	
	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	public String getMovieNAme() {
		return movieNAme;
	}
	public void setMovieNAme(String movieNAme) {
		this.movieNAme = movieNAme;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie id=" + movieid + "\nMovie Name =" + movieNAme + "\nRating=" + rating;
	}
	
	
	
}