package secondproject;

class Car {
	//생성자 만들기 - 초기화 (클래스 변수)
	String name;
	String color;
	int price;
	Car(){ // 생성자(메서드) 이름은 Car() 똑같다. ()괄호 안에 있는 타입,개수,순서
		this.name="제네시스"; // 이게 다르다면 오버로딩 되었다.
		this.color="검정";
		this.price=1000;
	}
		Car(String name){
			this.name=name; //클래스변수의 name = 받아온 변수가 담긴 name
			this.color="빨강";
			this.price=800; // this는 이 클래스를 가르키고 this.price는 이 클래스 변수 price를 말한다
		}
		Car(String name,String color){
			this.name=name;
			this.color=color;
			this.price=700;
		}
		Car(String name,String color,int price){
			this.name=name;
			this.color=color;
			this.price=price;
		}
	
}
