public class Company {
    public static void Main(String[] args); 
    Employee[] employees = new Employee[5];
    employees[0] = new Employee("Anna Lee", 2000);
        employees[1] = new Employee("Carl Bas", 6000);
        employees[2] = new Employee("Jacob White", 7000);
        employees[3] = new Employee("Andru Krown", 5500);
        employees[4] = new Employee("Jan Brown", 6500);
        System.out.println("Dane pracownika o indeksie 3:");
        System.out.println(employees[3].toString());
        employees[3].setSalary(60000);
        System.out.println("\nDane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
