import java.util.Scanner;


class student{
    int id;
    String name, program;
    student(int id, String name, String program){
        this.id = id;
        this.name = name;
        this.program = program;
    }
    void display(){
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
    }
}
class instructor{
    int id;
    String name, department, title;

    instructor(int id, String name, String department, String title){
        this.id = id;
        this.name = name;
        this.department = department;
        this.title = title;
    }
    void display(){
        System.out.println("Instructor ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Title: " + title);
    }
}
class course{
    int id;
    String syllabus;
    String title;
    String credits;
    String prerequisites;
    course(int id, String syllabus, String title, String credits, String prerequisites){
        this.id = id;
        this.syllabus = syllabus;
        this.title = title;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }
    void display(){
        System.out.println("Course ID: " + id);
        System.out.println("Syllabus: " + syllabus);
        System.out.println("Title: " + title);
        System.out.println("Credits: " + credits);
        System.out.println("Prerequisites: " + prerequisites);
    }
}
class courseoffering{
    int stduentid;
    int instructorid;
    int courseid;

    String time;
    int secno;
    int roomid;
    int year;
    String semester;
    courseoffering(int stduentid, int instructorid, int courseid, String time, int secno, int roomid, int year, String semester){
        this.stduentid = stduentid;
        this.instructorid = instructorid;
        this.courseid = courseid;
        this.time = time;
        this.secno = secno;
        this.roomid = roomid;
        this.year = year;
        this.semester = semester;
    }
    void display(){
        System.out.println("Student ID: " + stduentid);
        System.out.println("Instructor ID: " + instructorid);
        System.out.println("Course ID: " + courseid);
        System.out.println("Time: " + time);
        System.out.println("Section Number: " + secno);
        System.out.println("Room ID: " + roomid);
        System.out.println("Year: " + year);
        System.out.println("Semester: " + semester);
    }

}

public class p7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        student s1 = new student(1, "Nafis", "Software Engineering");
        instructor i1 = new instructor(1, "Fazle Rakib", "Software Engineering", "Lecturer");
        course c1 = new course(1, "Object Oriented Programming", "SWE-221", "3", "None");
        
        courseoffering co1 = new courseoffering(1, 1, 1, "10:00 AM", 1, 101, 2024, "Fall"); 
        
        s1.display();
        System.out.println();
        i1.display();
        System.out.println();
        c1.display();
        System.out.println();


        co1.display();

    }
}