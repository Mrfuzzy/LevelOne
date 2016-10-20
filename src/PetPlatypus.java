public class PetPlatypus {
	private String name;
	public PetPlatypus(String name) {
		this.name=name;
	}
	void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
	
	public static void main(String[] args) {
		//1. Make an instance of your new pet platypus
		PetPlatypus Perry = new PetPlatypus("Perry");
		//2. Call the sayHi method
		Perry.sayHi();
		//3. Create a constructor in the platypus class so that you can give your platypus a name.
	}
}
