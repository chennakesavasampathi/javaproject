package javapractice;

import java.util.ArrayList;
import java.util.Collections;

public class Mp4 {

	public static void main(String[] args) {
		Song song1=new Song("kushi","vijay",2023);
		Song song2=new Song("aaradya","samantha ",2010);
		Song song3=new Song("naa roja","vijay",2021);
		
		ArrayList<Song> musiclist=new ArrayList<>();
		
		musiclist.add(song1);
		musiclist.add(song2);
		musiclist.add(song3);
		
		for(Song temp:musiclist) {
			
			System.out.println(temp);
			
			
		}
		
		Collections.sort(musiclist);
		System.out.println("after sorting the elements ");
		for(Song temp:musiclist) {
			
			System.out.println(temp);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
