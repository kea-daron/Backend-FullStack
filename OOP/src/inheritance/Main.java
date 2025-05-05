package inheritance;

class Person{
    int id;
    String name;
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
}

class Student extends Person{
    String fatherName;
}
class Teacher extends Person{ }
public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.id = 1;
        Student s = new Student();
        s.name = "John";
    }
}
