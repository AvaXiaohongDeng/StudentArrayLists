import java.util.ArrayList;
import java.util.Iterator;

public class StudentArrayLists {
    public static void main(String[] args) {
        //Creating user-defined class objects
        Student s1=new Student(101,"Henry",44);
        Student s2=new Student(102,"Ava",44);
        Student s3=new Student(103,"Yoyo",15);
        Student s4=new Student(104,"Andy",6);
        //creating arraylist
        ArrayList<Student> studentLists = new ArrayList<Student>();
        studentLists.add(s1);//adding Student class object
        studentLists.add(s2);
        studentLists.add(s3);
        studentLists.add(s4);
        //Getting Iterator
        Iterator itr=studentLists.iterator();
        //traversing elements of ArrayList object
        while(itr.hasNext()){
            Student st=(Student)itr.next();
            System.out.println(st.id+" "+st.name+" "+st.age);
        }
    }
}
