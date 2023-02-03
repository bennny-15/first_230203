// super 키워드 = 부모 객체를 나타내는 키워드


public class TruckExam {

	public static void main(String[] args) {
		Truck t = new Truck();
	}
	/* 이렇게 생성만 하면 Car의 기본 생성자와 Truck의 기본 생성자가 실행됨
	 내가 태어나기 위해서는 부모가 먼저 태어나야함 -> truck의 인스턴스가 생성될 때
	 부모인 car가 먼저 인스턴스로 생성된다. 메모리에 Car객체가 메모리에 먼저 생성되고
	 자식인 Truck객체가 메모리에 생성된다.
	*/

}
