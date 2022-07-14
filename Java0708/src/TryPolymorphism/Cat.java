package TryPolymorphism;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
		
	}

	@Override
	public void Talk() {
		System.out.println("喵喵");
		
	}

	@Override
	public void Eat() {
		System.out.println("吃魚");
		
	}

	@Override
	public void Mating(Animal animal) {
		System.out.println("秘密");
		
	}
	
	//新增一個貓獨有的方法
	public void scratch() {
		System.err.println("抓抓");
	}

}
