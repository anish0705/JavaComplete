
import java.util.Scanner;

public class Animal {
	
	private int age;
	private boolean hasOwner = false;
	private String name;
	private int uniqueId;
	protected static int numberOfAnimals = 0;
	static Scanner userInput = new Scanner(System.in);
	
	//constructor of the class
	public Animal() {
	/*	numberOfAnimals++;
		//getting the name
		System.out.println("Enter name");
		if(userInput.hasNextLine()) {
			this.setName(userInput.nextLine());
		}
		
		//getting the owner type
		System.out.println("Is there an owner?");
		if (userInput.hasNextLine()) {
			if (userInput.nextLine().equals("Yes"))
				this.setOwner(true);
			else
				this.setOwner(false);
		}
		
		//getting the uniqueid
		System.out.println("Enter unique id");
		if (userInput.hasNextInt()) {
			this.setUniqueID(userInput.nextInt());
		}*/
	}
	
	//setters and getters for all fields
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setOwner(boolean owner) {
		this.hasOwner = owner;
	}
	
	public boolean getOwner() {
		return this.hasOwner;
	}
	
	public void setUniqueID(int uid) {
		this.uniqueId = uid;
	}
	
	public int getUniqueID() {
		return this.uniqueId;
	}
	
	//makeSound method
	public String makeSound() {
		return "Grrr";
	}
	
	//main method
	public static void main(String[] args) {
		Animal theAnimal = new Animal();
	}
}
