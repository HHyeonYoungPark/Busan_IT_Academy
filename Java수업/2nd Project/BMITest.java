package secondproject;

class BMI{
	
	void calc(String n, int h, int w) { //�޼���� �տ� ��ȯ��,, ��ȯ�� �޼���� - void ���� ��ȯ�Ұ� ����. ����Ǹ� ��
	System.out.println(n +"�� bmi������" + w/((h*0.01)*(h*0.01))+" �Դϴ�");
	}
}


public class BMITest {
	public static void main(String[] args) {
		BMI bmi = new BMI();
		bmi.calc("��ȫ��",176,80); //��ȫ���� bmi������ xxx�Դϴ�.
	}
}
