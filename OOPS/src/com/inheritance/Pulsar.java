package com.inheritance;

public class Pulsar extends Bike
{

public Pulsar()
{
	
}
@Override
public void bikeInfo(String colour, int speed)
{
	super.bikeInfo("Red", 125);
}
@Override
public String toString() {
	return "Pulsar [colour=" + colour + ", speed=" + speed + "]";
}

public static void main (String []args)
{
	Bike bk= new Pulsar();
	bk.bikeInfo("Blue", 130);
	System.out.println(bk);
}

}
