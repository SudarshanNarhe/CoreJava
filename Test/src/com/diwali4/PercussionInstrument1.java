package com.diwali4;

public class PercussionInstrument1 extends Sound implements Musicalinstruments{

	
	@Override
	public void playMethod() {
		System.out.println("I am Playing Percussion Instrument");
		
	}
	@Override
	void listenSound() {
		System.out.println("I am Listening Sound in Percussion Instrument");
		
	}

	public static void main(String[] args) {
		
		PercussionInstrument1 tabla = new PercussionInstrument1();
		tabla.playMethod();
		Musicalinstruments.learnInstruments();
		tabla.listenSound();
	}
	
}
