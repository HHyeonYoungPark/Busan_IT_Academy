
public class ParameterEx {
	void sum(String y, int ... i) {//�迭�� ����ϸ� �ȴ� 
		// ��������
		// ������ ���� �� �ִ� ������ �Ѱ��� �� �� �ִ�.
		// �ٸ� ������ ������ ���� �ް� �ʹٸ� ������ �޴� ������ �տ� ��� ��.
		// (String s, int ... i) <-�̷�������
		//sum(10) <- int Ÿ���� �Ű������� ������ ���Ѵ�
		int s = 0;
		for(int x=0;x<i.length;x++) {
			s=s+i[x]; //�迭�� ���
		}
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		ParameterEx pe = new ParameterEx();
		pe.sum("a",10,20,30,40,50);
		pe.sum("b",20);
	}
}
