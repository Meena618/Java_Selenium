package SimpleJavaPrograms;
import java.util.Random;

public class RandomExample2 {
	public static void main(String args[]) {
		Random random=new Random();
		int x=random.nextInt(50);
		int y=random.nextInt(1000);
		System.out.println("Randomely generated interger values");
		System.out.println(x);
		System.out.println(y);
		double a = random.nextDouble();   
		double b = random.nextDouble();
		System.out.println("Randomely generated Double values");
		System.out.println(a);
		System.out.println(b);
		float f=random.nextFloat();
		float f2=random.nextFloat();
		System.out.println("Randomely generated  float values");
		System.out.println(f);
		System.out.println(f2);
		long l1=random.nextLong();
		long l2=random.nextLong();
		System.out.println("Randomely generated long values");
		System.out.println(l1);
		System.out.println(l2);
		boolean s1=random.nextBoolean();
		boolean s2=random.nextBoolean();
		System.out.println("Randomely generated boolean values");
		System.out.println(s1);
		System.out.println(s2);
	}

}
