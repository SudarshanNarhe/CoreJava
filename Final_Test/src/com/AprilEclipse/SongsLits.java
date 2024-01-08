package com.AprilEclipse;

import java.util.ArrayList;
import java.util.Scanner;

public class SongsLits {

	public static void main(String[] args) {
		

		ArrayList<Que1> songList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many songs you have to add : ");
		int number= sc.nextInt();
		float volume = 0;
		for (int i =0; i <number; i++) { 
			System.out.println("Enter song id for song " + (i+1) + " : ");
			int songId = sc.nextInt();
			System.out.println("Enter song name for song " + (i+1) + " : ");
			String songName = sc.next();
			
			 volume = 2 + volume ;
	        if (volume % 3 == 0) {
	            volume *= 0.5; 
	        }
	        Que1 song = new Que1(songId, songName, volume);
			songList.add(song);
		}
		
		System.out.println(songList);
		
		int index = Que1.findSongIndex(songList);
		if (index !=-1) {
			System.out.println("Index of the song with volume greater than or equal to 10: " + index);
		}
		else {
			System.out.println("No song found with volume greater than or equal to 10.");
		}
		
sc.close();
  }
		    		    
}
