
class ConEx2{
	int i;
	String s;
	
	ConEx2() {// �⺻�����ڰ� �ʼ��� �ƴϴ�.
		i=10;
		s="�ȳ�";
	}
	ConEx2(int k) {// �������� Ʋ���� ���� ����� ����. Ÿ�԰� ����, ������ �����Ѵ�.
		i=k;
		s="�ȳ�";
	}	
	ConEx2(String str) {// �����Ҷ� new �ڿ� ������ ��()��ȣ�� �ִ°ſ� ���� ������
		i=10;
		s=str;
	}
	ConEx2(int k,String str){
		i=k;
		s=str;
	}//����,����
	ConEx2(String str,int k){
		System.out.println("���� ����");
		i=k;
		s=str;
	}//����,����
}
public class ConEx3 {
	public static void main(String[] args) {
		ConEx2 c = new ConEx2();
		System.out.println(c.i+" "+c.s);
		
		ConEx2 c2 = new ConEx2(100);
		System.out.println(c2.i+" "+c2.s);
		
		ConEx2 c3 = new ConEx2("������");
		System.out.println(c3.i+" "+c3.s);
		
		ConEx2 c4 = new ConEx2(1000,"�ö�ö�");
		System.out.println(c4.i+" "+c4.s);
		
		ConEx2 c5 = new ConEx2("�ݰ�����",500);
		System.out.println(c5.i+" "+c5.s);
	}
}



