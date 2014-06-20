
public class Cat extends Animal {

		public Cat() {
			
		}
	
		//makeSound method
		public String makeSound() {
			return "Meow";
		}
		
		public static void main(String[] args) {
			Animal Cleo= new Dog();
			System.out.println(Cleo.makeSound());
			Animal Pup = new Cat();
			System.out.println(Pup.makeSound());
			Animal generic = new Animal();
			System.out.println(generic.makeSound());
			
		}
		
		
}
