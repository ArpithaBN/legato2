
public class HelloWorld {

	
	public static void main(String args[]){
		/*Employee e=new Employee();
		e.name="Arpitha";
        e.age=10;
        e.salary=15000;
        
        Employee a=new Employee();
        a.name="Jayanta";
        a.age=24;
        a.salary=15000;
		
		System.out.println(e.getEmployeeDetails());
		System.out.println(a.getEmployeeDetails());*/
		
		
		Employee e=new Employee("IIHT",20,150.88);
		Employee e1=new Employee("java",30,120.55);
		Calculator c=new Calculator(10,0);
		System.out.println(c.add());
		System.out.println(c.sub());
		System.out.println(c.mul());
		System.out.println(c.div());
		
	}
	
	
}