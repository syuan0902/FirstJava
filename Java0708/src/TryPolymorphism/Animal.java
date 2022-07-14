package TryPolymorphism;

//用關鍵字"abstract"定義Animal為抽象概念
public abstract class Animal {
	private String name;
	
	//建構子
	//要用多型, 所以不需要用type屬性儲存動物的種類
	public Animal(String name) {
		super();
		this.name = name;
		
	}
	
	//讓Animal類別擁有判斷動物叫聲的方法 (物件導向)
	//因為是抽象類別, 所以只要定義好有哪些方法就好, 不用寫方法內容
	public abstract void Talk();
	
	//覓食方法
	public abstract void Eat();
	
	//交配方法 (參數為交配對象)
	public abstract void Mating(Animal animal);
	
	//封裝
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
