package com.diwali3;

interface P {

	String p ="PPPP";
	String methodP();
}
interface Q extends P 
{
	String q= "QQQQ";
	String methodQ();
}
class R implements P,Q {

	@Override
	public String methodP() {
		
		return q+p;
	}

	@Override
	public String methodQ() {
		
		return p+q;
	}
	 
}
public class Test {
	
	public static void main(String[] args) {
		
		R r = new R();
		
		System.out.println(r.methodP());
		System.out.println(r.methodQ());
	}
}







