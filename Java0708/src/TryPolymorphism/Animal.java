package TryPolymorphism;

public class Animal {
	public static final int DOG = 0;
	public static final int BIRD = 1;
	public static final int CAT = 2;
	public static final int FOX = 3;
	public static final int SLOTH = 4;
	
	private String name;
	private int type;
	
	//建構子
	public Animal(String name, int type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	//封裝
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	

}
