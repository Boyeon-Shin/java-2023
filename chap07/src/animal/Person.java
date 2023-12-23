package animal;

public class Person {
	private String name;
	// 1. 배열 샹성 같이 진행 
	//private Animal [] companions = new Animal[10];
	private Animal [] companions;
	private int companionCount;
	
	// 2. 배열은 생성자에서 생성 추천 (사람마다 동물의 개수를 다르게 할 수 있다)
	public Person(final String name , final int count) {
		this.companions = new Animal[count];
		this.name = name;
		this.companionCount = 0;
	}

	public void addCompanion(final Animal animal) {
		//animal 삽입할 위치를 알아야 함 
		this.companions[this.companionCount] = animal;
		this.companionCount++;
	}
	
	public void soundAll() {
		for(int i = 0; i < this.companionCount; i++) {
			Animal companion = this.companions[i];
			companion.sound();  // 동적 바인딩 
		}
		
	}
	
}
