class IOParents{	
}
class IOChild extends IOParents{
}


public class instanceOfEx {
	public static void main(String[] args) {
		IOParents iop = new IOChild();
		IOParents iop2 = new IOParents();
		//IOChild ioc = new IOParents(); 자식보다 부모가 늦게 만들어짐 - error 발생 
										// (IOChild)new IOParents();
		System.out.println(iop instanceof IOParents);
		System.out.println(iop instanceof IOChild);
		System.out.println(iop2 instanceof IOChild);
		//생성된 변수가 instanceOf 타입이냐
		//생성된 변수를 instanceOf 타입변수에 넣을수있냐
		String str = "하이";
		System.out.println(str instanceof Object);
		                 //앞에 있는 내용이 뒤의 내용에 들어갈 수 있는지..?
						 //str이 Object에 포함이 되는지...
	}
		
}
