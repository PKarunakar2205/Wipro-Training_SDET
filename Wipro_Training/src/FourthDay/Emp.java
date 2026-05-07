package FourthDay;

public class Emp {

		int empid;
		String name;
		// static variable
		static String companyname="Wipro";
		void show(int empid1, String name1)
		{
			empid=empid1;
			name=name1;
		
			System.out.println("empid= "+empid);
			System.out.println("name= "+name);
			System.out.println("companyname= "+companyname);
		}
		//static method
		static void details(int empid1, String name1)
		{
		     String st;
			//System.out.println("empid= "+empid);
			//System.out.println("name= "+name);
			System.out.println("companyname= "+companyname);
		}
		//static block
		static
		{
			System.out.println("block");
		}
	 
		public static void main(String[] args) {
			Emp emp=new Emp();
			emp.show(101, "Rohit");
			emp.show(102, "Soham");
			emp.show(103, "Mohan");
			//show(103, "Mohan");
			details(101, "Rohit");
	 
		}
	 
	}