
public class Test1 {
	
	 int a=10; 
	 static int b=20;
	 
	 public static void main (String [] args)
	 {
		 Test1 t=new Test1();
		 System.out.println(t.a);
		 System.out.println(t.b);
		 
		 t.a=40;
		 t.b=50;
		 System.out.println(t.a);
		 System.out.println(t.b);
		 
		 Test1 t1=new Test1();
		 System.out.println(t1.a);
		 System.out.println(t1.b);
		 
	 }

}
