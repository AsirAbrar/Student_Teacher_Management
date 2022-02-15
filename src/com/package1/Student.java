
package com.package1;

public class Student extends Person{
    private String Id;
    private int Batch;
    private Semester admissionSem=new Semester();
    private final int lastSerial=2000;
    private static int count;
    
    public Student(String Name, Department dept, Semester sem,int Batch){
    this.Name=Name;
    this.dept=dept;    
    this.Batch=Batch;
    this.admissionSem=sem;
    count++;
    this.Id=generateID();
    
    }
    
    public String generateID(){
    int serial=lastSerial+count;
    return admissionSem.getCode()+"-"+dept.getCode()+"-"+serial;
        
    }

    
    @Override
    public void ShowInfo(){
    
    System.out.println("Id : "+Id);
    super.ShowInfo();
    System.out.println("Semester: "+admissionSem.getName());
    System.out.println("Batch : "+Batch);
    System.out.println();
    } 
}
