package TryPolymorphism;

public class TryPoly {

	public static void main(String[] args) {
		
		
//		Animal[] animals = new Animal [] {new Animal("鳥", Animal.BIRD),
//										new Animal("狗", Animal.DOG),
//										new Animal("貓", Animal.CAT)};
		
		//建立一個名為animals的陣列, 資料型別為Animal, 裡面裝了三個含參數的物件
		Animal[] animals = {new Animal("鳥", Animal.BIRD),
							new Animal("狗", Animal.DOG),
							new Animal("貓", Animal.CAT),
							new Animal("狐狸", Animal.FOX),
							new Animal("樹懶", Animal.SLOTH),};
		
		//用for-each迴圈得到陣列內的物件資訊
		for( Animal animal : animals) {
			System.out.print(animal.getName() + ":");
			switch (animal.getType()) {
			case Animal.BIRD:
				System.out.println("唧唧");
				break;
			case Animal.DOG:
				System.out.println("汪汪");
				break;
			case Animal.CAT:
				System.out.println("喵喵");
				break;
			case Animal.FOX:
				System.out.println("狐狐");
				break;
			case Animal.SLOTH:
				System.out.println("樹樹");
				break;
			default:
				break;
			}
		}
	}
}
