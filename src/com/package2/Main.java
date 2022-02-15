package com.package2;
 
import com.package1.Department;
import com.package1.Semester;
import com.package1.Student;


public class Main {

    public static void main(String[] args) {
        
        
    Department dept =new Department("SWE",35);
    Semester sem =new Semester("Spring 2020",201);
    
    Student Stud1= new Student("Sk Asir Abrar" ,dept,sem,31);
    Student Stud2= new Student("Arup Ratan Dey",dept,sem,31);
    Student Stud3= new Student("Rahat Ahamed",dept,sem,31);
    Student Stud4= new Student("Md Wasim",dept,sem,31);
    Student Stud5= new Student("Sk Md Abuzar Gifari",dept,sem,31);
    
    System.out.println("Students Information:");
        Stud1.ShowInfo();
        Stud2.ShowInfo();
        Stud3.ShowInfo();
        Stud4.ShowInfo();
        Stud5.ShowInfo();
        
 
    
    /*Teacher Tec1= new Teacher("710002084", "Md Shohel Arman","Software Engineering","Lecturer(Senior Scale)");
    Teacher Tec2= new Teacher("710001444", "Md. Mushfiqur Rahman","Software Engineering","Lecturer");*/
    
        //System.out.println("Teachers Information:");
        //Tec1.ShowInfo1();
        //Tec2.ShowInfo1();
        
    }
    
}
