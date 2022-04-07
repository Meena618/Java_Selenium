package AbstratctInterfaces;

public interface Showable {
	void display();

}
interface Printable{
	void print();
	
}
class A7 implements Printable,Showable{
	public void display() {System.out.println("This is interface ");}
	public void print() {System.out.println("Welcome to abstract");}
	public static void main(String args[]) {
		A7 obj=new A7();
		obj.display();
		obj.print();
	}
}