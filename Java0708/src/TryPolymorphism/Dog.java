package TryPolymorphism;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
		
	}

	@Override
	public void Talk() {
		System.out.println("汪汪");
		
	}

	@Override
	public void Eat() {
		System.out.println("吃飼料");
		
	}

	@Override
	public void Mating(Animal animal) {
		System.out.println("秘密");
		
	}
	

}
