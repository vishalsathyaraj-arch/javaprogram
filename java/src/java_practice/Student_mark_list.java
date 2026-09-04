package java_practice;

public class Student_mark_list {
       String student_name;
       int Age;
       double Percentage;
       boolean pass;
       public void display() {
    	   System.out.println("student name :"+ student_name);
    	   System.out.println("age :"+ Age);
    	   System.out.println("percentage :"+ Percentage);
    	   System.out.println("pass :"+ pass);
       }
	public static void main(String[] args) {
		Student_mark_list abisheak = new Student_mark_list();
 		abisheak.student_name = "Abisheak";
     	abisheak.Age = 25;
		abisheak.Percentage =65.8;
		abisheak.pass = true;
		abisheak.display();
		 
		Student_mark_list bala = new Student_mark_list();
		bala.student_name ="Bala";
		bala.Age  = 24;
    	bala.Percentage =25.0;
    	bala.pass =false;
		bala.display();
		
		Student_mark_list vishal =new Student_mark_list();
		vishal.student_name="Vishal";
		vishal.Age =23;
		vishal.Percentage= 80.5;
		vishal.pass=true;
		vishal.display();
		}
}


