
public class SmurfRunner {
public static void main(String[] args) {
	Smurf papa = new Smurf ("papa");
	System.out.println(papa.getName());
	System.out.println(papa.getHatColor()); 
	System.out.println(papa.isGirlOrBoy());
	System.out.println(papa.getName());
	
	
	
	
	
	Smurf handy = new Smurf ("handy");
	handy.eat();
	System.out.println(handy.getName());
	
	
	
	
	
	Smurf smurfette = new Smurf ("smurfette");
	System.out.println(smurfette.getName());;
	System.out.println(smurfette.getHatColor());
	System.out.println(smurfette.isGirlOrBoy());
}
}
