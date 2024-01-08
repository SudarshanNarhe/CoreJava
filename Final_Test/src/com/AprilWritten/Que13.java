package com.AprilWritten;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/*14) Class Car is as follows , { int carno  , String color } . 
 * By mistake multiple car objects are added in a collection.  
 * Find out duplicate objects in that collection and remove them. 
 * Car is same only if (carno  and  color both are same)[1M]*/

class Car {
	
	int carno;
	String colour;
	
	public Car() {
	
		
	}

	public Car(int carno, String colour) {
		super();
		this.carno = carno;
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "\nCar carno=" + carno + ", colour=" + colour ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(carno, colour);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return carno == other.carno && Objects.equals(colour, other.colour);
	}
	
	
		
}

public class Que13 {
	
	public static void main(String[] args) {
		
		ArrayList<Car> car = new ArrayList<Car>();
		car.add(new Car(101, "White"));
		car.add(new Car(102, "Black"));
		car.add(new Car(103, "Blue"));
		car.add(new Car(104, "Yellow"));
		car.add(new Car(105, "Red"));
		car.add(new Car(102, "Black"));
		car.add(new Car(105, "Red"));
		car.add(new Car(101, "White"));
		car.add(new Car(104, "Pink"));
		
		System.out.println("Original : ");
		System.out.println(car);
		
		System.out.println("\nWithout duplicates : ");
		HashSet<Car> newcar = new HashSet<Car>(car);
		System.out.println(newcar);
	}
	
};
