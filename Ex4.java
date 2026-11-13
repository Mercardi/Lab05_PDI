package lab05;
class Employee {
    private int id;
    private String name;
    private String department;
    private String position;
    private double salary;
    public Employee(int id, String name, String department, String position, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }
    public int getId(){ 
        return id; 
    }
    public String getName(){ 
        return name; 
    }
    public String getDepartment(){ 
        return department; 
    }
    public String getPosition(){ 
        return position; 
    }
    public double getSalary(){ 
        return salary; 
    }
    public void setId(int id){ 
        this.id = id; 
    }
    public void setName(String name){ 
        this.name = name; 
    }
    public void setDepartment(String department){ 
        this.department = department; 
    }
    public void setPosition(String position){ 
        this.position = position; 
    }
    public void setSalary(double salary) {
        if (salary >= 0) this.salary = salary;   // simple validation
    }

    public void display() {
        System.out.printf("ID: %d | Name: %s | Dept: %s | Position: %s | Salary: %.2f%n",
                id, name, department, position, salary);
    }
}

public class Ex4 {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Siti Aminah", "IT", "Developer", 4500.00);
        System.out.println("Initial details:");
        emp.display();
        emp.setPosition("Senior Developer");
        emp.setSalary(5500.00);
        System.out.println("\nAfter update (via setters):");
        System.out.println("Name    : " + emp.getName());
        System.out.println("Position: " + emp.getPosition());
        System.out.println("Salary  : " + emp.getSalary());
    }
}
