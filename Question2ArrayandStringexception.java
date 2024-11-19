package javatask7;

public class Question2ArrayandStringexception {
	public static int[] myarrayinteger = new int[5];
	public static String[] myarraystring =new String[5];
	public static void main(String[] args) {
		Arrayexception();
		}
	public static void Arrayexception() {
		try {
			
			myarrayinteger[0]=23;
			myarrayinteger[1]=3;
			myarrayinteger[2]=12;
			myarrayinteger[3]=23;
			myarrayinteger[4]=23;
			myarrayinteger[5]=67;
			for(int i=0;i<myarrayinteger.length;i++)
			{
			System.out.println("Array Values are -- "+myarrayinteger[i]);}
		}
	
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error Caught -- "+e.getMessage());
	}
	}
}
