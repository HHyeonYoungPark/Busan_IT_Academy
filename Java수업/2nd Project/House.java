package secondproject;

public class House {
	String mete;
	int floor;
	
	House(){
		this.mete = "ö";
		this.floor = 18;
	}
	
	House(String mete){
		this.mete = mete;
		this.floor = 400;
	}
	
	House(String mete, int floor){
		this.mete = mete;
		this.floor = floor ;
	}
	
}
