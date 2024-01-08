package com.diwali5;

import java.util.Arrays;
import java.util.Scanner;

/*Create array of 5 Bus objects .
Bus class is as follows  Bus – { int bus id , Seat[] sarr  } 
Seat { int seatno , String seatType int price } . 
Accept values from user. */

class Seat {
	
	int seatNo;
	String seatType;
	int price;
	
	public Seat() {}
	
	public Seat (int seatno, String type, int p) {
		
		this.price=p;
		this.seatNo=seatno;
		this.seatType=type;
	}
	
	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public String getSeatType() {
		return seatType;
	}

	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString () {
		
		return "Seat No : "+seatNo+"\nSeat Type : "+seatType+"\nPrice : "+price;
	}
}

public class Bus {

	int busID;
	Seat []sarr;
	
	public Bus() {}
	
	public Bus (int busID, Seat []sarr) {
		this.busID=busID;
		this.sarr=sarr;
	}
	public String toString() {
		
		return "Bus ID : "+busID+Arrays.toString(sarr);
	}
	
	public static void main(String[] args) {
        Bus[] buses = new Bus[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Bus ID for Bus " + (i + 1) + ": ");
            int busId = scanner.nextInt();

            Seat[] seatArray = new Seat[10]; // Assuming each bus has 10 seats for simplicity

            for (int j = 0; j < 3; j++) {
                System.out.println("Enter Seat Number for Seat " + (j + 1) + ": ");
                int seatNo = scanner.nextInt();

                System.out.println("Enter Seat Type for Seat " + (j + 1) + ": ");
                String seatType = scanner.next();

                System.out.println("Enter Price for Seat " + (j + 1) + ": ");
                int price = scanner.nextInt();

                seatArray[j] = new Seat(seatNo, seatType, price);
            }

            buses[i] = new Bus(busId, seatArray);    
        }
        for(int i=0;i<buses.length;i++) {
        	
        	System.out.println(buses[i]);
        	System.out.println("-------------------------------------");
        }
        
       scanner.close();
	}
	
}
