

public class Student implements Comparable<Student> {
    private String name;
    public Student(String name){
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    @Override
    public int compareTo(Student stu){
//        return this.name.compareTo(stu.getName());
        return this.name.compareToIgnoreCase(stu.getName());

    }
    @Override
    public String toString() {
        return name;
    }

}
