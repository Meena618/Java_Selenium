package Collections;
import java.util.*;

public class  Book{
int id,quantity;
String name,author,publisher;
public Book(int id,String name,String author,String publisher,int quantity) {
	this.id=id;
	this.name=name;
	this.author=author;
	this.publisher=publisher;
	this.quantity=quantity;
	

}

}
 class linkedListexample3
{
	public static void main(String args[])
	{
		List<Book>list=new LinkedList<Book>();
		Book b1=new Book(101,"Let us see","yeshwant","BPB",3);
		Book b2=new Book(102,"Data communication","","Ferouz",6);
		Book b3=new Book(103,"Java porgramming","Galvin","Wiley",3);
		list.add(b1);
		list.add(b2);
		list.add(b3);
		for(Book b:list)
		{
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}
}