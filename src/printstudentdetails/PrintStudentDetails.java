/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentdetails;

/** 2023,25
 * this is the branch parttime
 * @author srinivsi
 */
public class PrintStudentDetails {

    /** user interactions - view class
     * to print 3 student details - name , age,stid
     */
    public static void main(String[] args)
    {
      Student[] list = new Student[4] ;  //array of object decalration
      //define 3 students  by creating object of student class
        Student s1 = new Student(); // s1 - object
        s1.setName("peter");
        s1.setAge(21);
         Student s2 = new Student(); // s2 - object
        s2.setName("jasdeep");
        s2.setAge(21);
         Student s3 = new Student(); // s3 - object
        s3.setName("kiran");
        s3.setAge(20);
         Student s4 = new Student(); // s4 - object
        s4.setName("radwan");
        s4.setAge(21);
        //store object in array
          list[0] = s1;       
            list[1] = s2;   
            list[2] = s2;  
        list[3]= s4;
            for(int i=0;i<list.length;i++) //read the array 
            {
                System.out.println(list[i].getName() + " "+list[i].getAge());
            }
       // fetch + merge           
    }
    
}
