//protected 접근제한자
public class A {
	protected String field;
	
	protected A() {	
	}
	
	protected void method() {	
	}
}

class B{
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}

class C{
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}

class D extends A{
	public D() {
		super();
		this.field = "value";
		this.method();
	}
}