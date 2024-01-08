package com.diwali4;

public class StringedInstrument1 extends Sound implements Musicalinstruments {

	@Override
	public void playMethod() {
		System.out.println("I am Playing in Stringed Instruments");
		
	}

	@Override
	void listenSound() {
		System.out.println("I am Listeing Sound in Stringed Instruments");
		
	}
	
	public static void main(String[] args) {
		
		StringedInstrument1 Violin = new StringedInstrument1();
		Violin.playMethod();
		Musicalinstruments.learnInstruments();
		Violin.listenSound();
		
	}
	
}
