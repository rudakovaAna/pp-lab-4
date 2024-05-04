import employees.Employee;
import employees.Manager;
import employees.Worker;


public class Company {
    public static void Main(String[] args); 
    Employee[] employees = new Employee[5];
    employees[0] = new Manager("Anna Lee", 2000, 0);
        employees[1] = new Worker("Carl Bas", 6000, "Director");
        employees[2] = new Manager("Jacob White", 7000, 2);
        employees[3] = new Worker("Andru Krown", 5500, "Marketing specialist");
        employees[4] = new Worker("Jan Brown", 6500, "Business coach");
        int nonManagerCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerCount++;
            }
        }
        ((Manager) employees[0]).setNumberOfSubordinates(nonManagerCount);
        employees[0].setSalary(7500);
        System.out.println("Dane pracownika o indeksie 3:");
        System.out.println(employees[3].toString());
        employees[3].setSalary(60000);
        System.out.println("\nDane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }