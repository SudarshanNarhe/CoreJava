package com.test5;

import java.util.ArrayList;

public class ListOfTeam {

	public static int calculatecount(ArrayList<String> a) {
		
		int max=0;
		for(int i=0;i<a.size();i++) {
			int count=0;
			
			for(int j=i;j<a.size();j++) {
				if(a.get(i).equals(a.get(j))) {
					count++;
					//System.out.println(count);
					if(count>max) {
						
						max=count;
						//System.out.println("Max "+max);
					}
				}
			}
		}
		System.out.println(max);
		return max;
	}
	
	public static void main(String[] args) {
		
		
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(new Player(102, "Rohit Sharma", "India", "Mumbai Indians"));
		players.add(new Player(31, "Bumhrah", "India", "Mumbai Indians"));
		players.add(new Player(200, "Head", "Australia", "Chennai Super Kings"));
		players.add(new Player(4, "David Warner", "Australia", "Mumbai Indians"));
		players.add(new Player(50, "R.Ashwin", "India", "Gujrat Titans"));
		players.add(new Player(63, "Smith", "Australia", "Chennai Super Kings"));
		players.add(new Player(78, "Maxwell", "Australia", "Mumbai Indians"));
		players.add(new Player(87, "Jadeja", "India", "Chennai Super Kings"));
		players.add(new Player(93, "Mitchell Marsh", "Australia", "Mumbai Indians"));
		players.add(new Player(10, "Hardik Pandya", "India", "Mumbai Indians"));
		players.add(new Player(111, "Mitchell Starc", "Australia", "Mumbai Indians"));
		players.add(new Player(15, "Virat Kohli", "India", "Royal Challenge Banglore"));
		players.add(new Player(14, "KL Rahul", "India", "Gujrat Titans"));
		players.add(new Player(113, "Zampa", "Australia", "Delhi"));
		players.add(new Player(212, "Rahane", "India", "Mumbai Indians"));
			
		
		
		ArrayList<String> a2= new ArrayList<String>();
		
		for(Player p : players) {
			if(p.getCountry_name().equals("Australia")) {
				a2.add(p.getTeam());
			}
		}
		System.out.println(a2);
		
		int max=calculatecount(a2);
		String team=null;
		for(int i=0;i<a2.size();i++) {
			int count=0;
			for(int j=i;j<a2.size();j++) {
				if(a2.get(i).equals(a2.get(j))) {
					count++;
					//System.out.println("count : "+count);
					if(count==max) {
						//System.out.println();
						team=a2.get(i);
						System.out.println("Team "+team+ " has Maximum Austrilian Players of count : "+max);
					}
						
				}
			}
		}
		
		
		
		
	}

}
