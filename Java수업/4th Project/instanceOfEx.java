class IOParents{	
}
class IOChild extends IOParents{
}


public class instanceOfEx {
	public static void main(String[] args) {
		IOParents iop = new IOChild();
		IOParents iop2 = new IOParents();
		//IOChild ioc = new IOParents(); �ڽĺ��� �θ� �ʰ� ������� - error �߻� 
										// (IOChild)new IOParents();
		System.out.println(iop instanceof IOParents);
		System.out.println(iop instanceof IOChild);
		System.out.println(iop2 instanceof IOChild);
		//������ ������ instanceOf Ÿ���̳�
		//������ ������ instanceOf Ÿ�Ժ����� �������ֳ�
		String str = "����";
		System.out.println(str instanceof Object);
		                 //�տ� �ִ� ������ ���� ���뿡 �� �� �ִ���..?
						 //str�� Object�� ������ �Ǵ���...
	}
		
}
