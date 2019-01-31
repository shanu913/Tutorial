
public class Demo {

	public static void main(String[] args)
	{
	StringBuffer s1=new StringBuffer("rattaiah");
	s1.append("addanki");//mutability
	System.out.println(s1);
	StringBuffer s2=new StringBuffer("durgasoft");
	StringBuffer s3=s1;
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	}
	
}
