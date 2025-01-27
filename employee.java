package scook4;
public class employee extends person {
    private double salary;
    private String jobTitle;

    public employee(String name, int age, double salary, String jobTitle) {
        super(name, age);
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String toString() {
        return getName() + " " + getAge() + " " + salary + " " + jobTitle;
    }

    public static void main(String[] args) {
        employee e1 = new employee("Kevin Hart", 45, 670000.9, "comedian");
        e1.setAge(47);
        System.out.println(e1);
    }
}
