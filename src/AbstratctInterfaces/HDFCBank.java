package AbstratctInterfaces;

public interface HDFCBank {
	float rateOfIntrest();

}
class SBI implements HDFCBank{
	
		public float rateOfIntrest(){return 8.50f;}
		
	}
	class PNB implements HDFCBank
	{
		public float rateOfIntrest(){return 8.20f;}
	}
	class TestInterface6
	{               
		public static void main(String args[]) {
			HDFCBank b=new SBI();
			System.out.println("Rate of interest"+b.rateOfIntrest());
		}

}
