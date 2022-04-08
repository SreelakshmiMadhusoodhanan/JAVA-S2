class Student{
	int std_id;
	String std_name;
	int m1,m2,m3;
	
	Student(){
		std_id = 1;
		std_name = "RESHMA";
		m1=50;
		m2=49;
		m3=45;
    }
	Student(int id,String name,int mark1,int mark2,int mark3){
		std_id=id;
		std_name=name;
		m1=mark1;
		m2=mark2;
		m3=mark3;
	}
	Student(int mark1,int mark2,int mark3){
		std_id=3;
		std_name="RAJU";
		m1=mark1;
		m2=mark2;
		m3=mark3;
	}
	void display(){
	int sum = m1+m2+m3;
	float avg = sum/3;
	System.out.println("\nStudent Details");
	System.out.println("-----------------");
	System.out.println("Student ID :"+std_id);
	System.out.println("Student ID :"+std_name);
	System.out.println("Student Mark1 :\t"+m1);
	System.out.println("Student Mark2 :\t"+m2);
	System.out.println("Student Mark3 :\t"+m3);
	System.out.println("MARK SUM  :\t"+sum);
    System.out.println("AVERAGE OF MARKS :"+avg);
   }
  
}
public class StudentDetails{
	public static void main(String args[]){
		Student S=new Student();
		S.display();
		Student S1=new Student(2,"REEMA",30,40,50);
		S1.display();
		Student S2=new Student(10,20,30);
		S2.display();
		
	}
}
	
