package com.Assignments;


public class Outer_Anonymous implements Sing,Dance {
	
	Shape s = new Shape() {
		
		@Override
		public void draw() {
			System.out.println("In Draw of Anonymoius...");
		}
	};
	
	Learn l = new Learn() {

		@Override
		void english() {
			System.out.println("I am learning english");
			
		}
		
		
	};
	
	Play p = new Play() {
		@Override
		public void playing() {
			super.playing();
			System.out.println("I am Playing football");
		}
	};
	
	@Override
	public void dancing() {
		// TODO Auto-generated method stub
		System.out.println("I am Dancing");
	}

	@Override
	public void singing() {
		// TODO Auto-generated method stub
		System.out.println("I am Singing");
	}
	public static void main(String[] args) {
		
		Outer_Anonymous obj = new Outer_Anonymous();
		obj.s.draw();
		obj.l.english();
		obj.p.playing();
		obj.dancing();
		obj.singing();
		
		Outer_Anonymous obj1= new Outer_Anonymous(); // we can have a more than one object of an
		obj1.l.english(); 
	}

	


	
}

//6. Create anonymous class by implementing interface
interface Shape{
	
	void draw();
}

//7. Create anonymous class by extending abstract class.

abstract class Learn {
	
	abstract void english();
}

//8. Create anonymous class by extending concrete class.

class Play {
	
	public void playing() {
		System.out.println("I am Playing Cricket...");
	}
	
}

//9. Can we implement multiple interfaces while creating anonymous class ?
interface Dance{
	
	void dancing();
}

interface Sing{
	
	void singing();
}


