class Ext6{ // �θ�Ŭ������� Ư���Ѱ� �ƴϴ�.
	int x;
	String str;
	
	void printExt6() {
		System.out.println("Ext6");
	}
}

class ExtendsEx6_2 extends Ext6{}
class ExtendsEx6_3 extends Ext6{}
class ExtendsEx6_4 extends Ext6{}


public class ExtendsEx6 extends Ext6{ // ��ӹ޾Ҵ� == ExtendsEx6 + Ext6
									  // ExtendsEx6 �ȿ� Ext6�� ������ ������ super
	int y;
	int z;
	double[] dd;
	
	void printclass() {
		System.out.println("ExtendsEx6");
	}
}

// ��ӹ��� ���� ��ü�� ���� ������ ����
// ��ӹ��� Ŭ������ ��� �ִ� �޼���� �Ȱ��� �� �޼��� - �������̵� �Ǿ���

// �θ�Ŭ����  = super class
// �ڽ� Ŭ���� = sub class