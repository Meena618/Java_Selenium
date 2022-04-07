package AbstratctInterfaces;

interface InterfaceExample {
void a();
void b();
void c();
void d();
void e();
}
abstract class B implements InterfaceExample
{
	public void c() {System.out.println("My name is Tanoja");}
	
	}
	class M extends B{  
		public void a(){System.out.println("My name is Meena");}
		public void b(){System.out.println("My name is Sridhar");}
		public void d(){System.out.println("My name is Sai");}
		public void e(){System.out.println("My name is Vishnupriya");}
	}
	class Test3
	{
		public static void main(String args[])
		{
			InterfaceExample I=new M();
			I.a();
			I.b();
			I.c();
			I.d();
			I.e();
			
		}
	}
