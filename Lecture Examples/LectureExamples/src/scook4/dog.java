package scook4;

/* Superclass: Animal 
Methods:
Eat()
Eat(String food)

Sub class: Dog
Eat(string food, int servings) */
class Animal
{
	public void eat()
	{
		System.out.println("Animals eat food");
	}
	public void eat(String food)
	{
		System.out.println("Animals eat" + food);
	}
}
public class dog extends Animal{
	
	public void eat(String food, int servings)
	{
		System.out.println("Dog eats"+food+" servings of "+servings);
	}
	public void eat()
	{
		System.out.println("Dogs eat bones");
	}
	static void main(String[] args) {
		Animal a1= new Animal();
		a1.eat();
		a1.eat("grass");
		
		dog dog = new dog();
		dog.eat();
		dog.eat("Bones");
		dog.eat("Bones", 3);
		
		Animal dog2 = new dog();
		((dog)dog2).eat();
		
	}
}

