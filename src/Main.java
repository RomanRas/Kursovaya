import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employeeList = new Employee[10];
        employeeList[0] = new Employee("Васильев Василий Васильевич", 1, 50000);
        employeeList[1] = new Employee("Иванов Иван Иванович", 2, 55000);
        employeeList[2] = new Employee("Семёнов Семён Семёнович", 3, 54300);
        employeeList[3] = new Employee("Романов Роман Романович", 4, 61000);
        employeeList[4] = new Employee("Алексеев Алексей Алексеевич", 5, 39500);
        employeeList[5] = new Employee("Макаров Макар Макарович", 5, 42400);
        employeeList[6] = new Employee("Кириллов Кирилл Кириллович", 4, 46250);
        employeeList[7] = new Employee("Маринова Марина Мариновна", 3, 48600);
        employeeList[8] = new Employee("Янова Яна Яновна", 2, 38600);
        employeeList[9] = new Employee("Юльева Юлия Юльевна", 1, 44000);
        toString(employeeList);
        System.out.println("Затраты на зарплату в месяц: " + calculateSalarySpendings(employeeList));
        findLowestSalary(employeeList);
        findHighestSalary(employeeList);
        System.out.println("Средняя зарплата по компании: " + findAverageSalary(employeeList));
        showAllEmployeeNames(employeeList);
    }
    public static void toString(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("ФИО: " + employees[i].getFullName());
            System.out.println("Отдел: " + employees[i].getBranch());
            System.out.println("Зарплата: " + employees[i].getSalary());
            System.out.println("Идентификатор: " + employees[i].getEmployeeID());
            System.out.println();
        }
    }

    public static int calculateSalarySpendings(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public static void findLowestSalary(Employee[] employees) {
        int lowestSalary = 100000000;
        for (int i = 0; i < employees.length; i++) {
            if (lowestSalary > employees[i].getSalary()) {
                lowestSalary = employees[i].getSalary();
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() == lowestSalary) {
                System.out.println("Сотрудник с минимальной зарплатой: " + employees[i].getFullName() + ", отдел: " + employees[i].getBranch() + ", идентификатор: " + employees[i].getEmployeeID() + ", зарплата: " + employees[i].getSalary());
            }
        }
    }
    public static void findHighestSalary(Employee[] employees) {
        int highestSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (highestSalary < employees[i].getSalary()) {
                highestSalary = employees[i].getSalary();
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() == highestSalary) {
                System.out.println("Сотрудник с максимальной зарплатой: " + employees[i].getFullName() + ", отдел: " + employees[i].getBranch() + ", идентификатор: " + employees[i].getEmployeeID() + ", зарплата: " + employees[i].getSalary());
            }
        }
    }

    public static int findAverageSalary(Employee[] employees) {
        int averageSalary = calculateSalarySpendings(employees) / employees.length;
        return averageSalary;
    }
    public static void showAllEmployeeNames(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("ФИО: " + employees[i].getFullName());
        }
    }
}