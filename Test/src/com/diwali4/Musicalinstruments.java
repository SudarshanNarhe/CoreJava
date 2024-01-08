package com.diwali4;

/*Write MusicalInstrument interface with play method. It also has common behavior (static) learnInstrument.
Create Abstract class Sound with abstract method listenSound.
Implement MusicalInstrument interface in  PercussionInstrument  and  StringedInstrument classes. 
Also extend Sound class in both classes.
Create object ‘Tabla’ of PercussionInstrument class and object  ‘Violin’ of StringedInstrument class. 
call Paly, learnInstrument and listenSound methods of both objects.
*/

public interface Musicalinstruments {

	void playMethod();
	
	public static void learnInstruments()
	{
		System.out.println("I am learning the Insturments");
	}
	
}

abstract class Sound {
	
	abstract void listenSound();
	
}

