package student;

public class StudentRecord {
    private String name;
    private String id;
    private double gpa;

    public StudentRecord(String name, String id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        if(this.gpa>4.0 || this.gpa<0)
        {
            throw new IllegalArgumentException("gpa poza zakresem");
        }
    }
    public boolean isHonorStudent()
    {
        return gpa >= 3.5;
    }

    public String printDetails() {
        return "StudentRecord{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

class TestStudentRecord {
    public static void main(String[] args) {
        StudentRecord s1= new StudentRecord("Janek","997",4);
        StudentRecord s2= new StudentRecord("Marek","1001",3);
        System.out.println(s1.printDetails());
        System.out.println(s2.printDetails());
        System.out.println(s1.isHonorStudent());
        System.out.println(s2.isHonorStudent());
    }
}