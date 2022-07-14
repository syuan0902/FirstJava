package TryPolymorphism;

public class Main {

public static void main(String[] args) {
		
		
//		Animal[] animals = new Animal[] {new Dog("狗"), new Cat("貓")};
		
		//建立一個名為animals的陣列, 資料型別為Animal, 裡面裝了兩個物件 (狗&貓)
		//陣列能裝不同資料型別的物件?
		//貓跟狗都是動物, 所以能放在動物陣列裡面 > 這就是多型
		//以Animal角度看每個元素
		Animal[] animals = { new Dog("狗"), new Cat("貓")};
		
		//如果從貓的角度看, 就能使用貓的方法
		Cat cat = new Cat("貓2");
		cat.scratch();
		
		//如果宣告貓的陣列, 就無法放狗
		//Cat[] cats = { new Dog(狗2)};
		
		//用for-each迴圈得到陣列內的物件資訊
		for( Animal animal : animals) {
			System.out.print(animal.getName() + ":");
			System.out.println();
			animal.Talk();
			animal.Eat();
			animal.Mating(animal);
			System.out.println();
		}
	}
}
