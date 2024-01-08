package com.inheritance;

/*Create class IPLTeam with method play. Create child classes of IPLTeam 
called as CSK, RCB. In main, call play from child class objects.*/

 public class IPL_Team {
	
	String team;
	
	public IPL_Team() {
		

	}
     public IPL_Team(String team) 
     {
		this.team=team;

	}

	public void Play() {
		System.out.println(team+" is Playing in IPL");
	}
	
public static void main(String[] args) {
		
		CSK sk=new CSK();
		RCB rb=new RCB();
		
		sk.Play();
		rb.Play();

	}

}

 class CSK extends IPL_Team {

	public CSK() {
		super("CSK");
	}

	public void play() {
		super.Play();
	}

}

 class RCB extends IPL_Team {

	public RCB() {
		super("RCB");
	}
    public void play()
    {
    	super.Play();
    }


}


