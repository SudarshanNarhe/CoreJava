package com.AprilEclipse;

import java.util.ArrayList;

/*1. There is an arraylist of song object { int song id , String songname , flaot volume } . As 
song objects are added into list, volume variable of current object is increased by 2 . 
e.g. first song added will have volume 2 , second song will have volume 4 and so on. 
But the when volume becomes divisible by 3. It gets reduced by 50% for that song
(current object). Again for next song onwards volume will increase by 2 and so on. 
Find out index of atleast one song object for which volume will be equal to or greater 
than 10 . 
You have to accept only song id and song name from user. Volume will be set as per 
above logic. 
e.g. first song added – 1 , ‘all is well’ , 2 
second song – 2 , ‘e vatan’ , 4 
third song - 3 , ‘lakshya to’ , 6 .. now this volume is divisible by 3 so. This song’s 
volume will be reduced by 50% so will become 3. 
Now next song will have volume 3+2 = 5 and so on . Again when volume becomes 9 
it will be reduced to 4.5.*/

public class Que1 {
	
	int songid;
	String songname;
	float volume;
	public Que1() {
		
	}

	public Que1(int songid, String songname,float volume) {
		this.songid = songid;
		this.songname = songname;
		this.volume = volume;
	}

	public int getSongid() {
		return songid;
	}

	public void setSongid(int songid) {
		this.songid = songid;
	}

	public String getSongname() {
		return songname;
	}

	public void setSongname(String songname) {
		this.songname = songname;
	}

	public float getVolume() {
		return volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}
	
	public static int findSongIndex(ArrayList<Que1> songList) {
		int a=-1;
        for (int i = 0; i < songList.size(); i++) {
            if (songList.get(i).volume >= 10) {
            	a=i;
            	break;
                
            }
        }
        return a;
    }
	 
	@Override
	public String toString() {
		return "\nQue1 [songid=" + songid + ", songname=" + songname + ", volume=" + volume + "]";
	}
	
	
}
