/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
      //first student
        student s1 =new student(1,"issa","dabel",536897894,1999,"darckoush");
        studentcoure a1_s1 =new studentcoure(1,"two",1999, 1, 1)
        studentcoure a2_s1 =new studentcoure(2,"three",2000, 1, 1)
        s1.Studentcourses .add(a1_s1);
        s1.Studentcourses .add(a2_s1);
        //End student






  //first student
  student s2 =new student(2,"issa","dabel",536897894,1999,"darckoush");
  studentcoure a1_s2 =new studentcoure(1,"two",1999, 2, 2)
  studentcoure a2_s2 =new studentcoure(2,"three",2000, 2,2)
  s1.Studentcourses .add(a1_s2);
  s1.Studentcourses .add(a2_s2);
  //End student


  student. Students.add(s1);
  student.printAA();
        student. Students.add(s2);
        student.printAA();
        System.out.println("---------------------");
        student. Students.remove(s1);
         student.printAA();
        
      
    }

}