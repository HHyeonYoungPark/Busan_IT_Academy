import java.util.Scanner;// ��ĳ�ʸ� ���� ���� �غ�

class BMI{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������(kg)�� �Է��ϼ��� :");
		double i = sc.nextDouble();// Ű����κ��� �Է¹��� �Ǽ����� i�� ��´�.
		System.out.print("Ű(m)�� �Է��ϼ��� :");
		double j = sc.nextDouble();// Ű����κ��� �Է¹��� �Ǽ����� j�� ��´�.
		
		System.out.print("����� BMI ��ġ�� :");
		System.out.print(i/(j*j));//i/(j*j) ���� ���
		System.out.println("�Դϴ�.");
	}
}