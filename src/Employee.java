// Base Class
class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee is working.");
    }
}

// Derived Classes
class Doctor extends Employee {
    String specialization;

    public Doctor(String name, int id, double salary, String specialization) {
        super(name, id, salary);
        this.specialization = specialization;
    }

    @Override
    public void work() {
        System.out.println("Doctor is treating patients.");
    }
}

class Nurse extends Employee {
    int shiftHours;

    public Nurse(String name, int id, double salary, int shiftHours) {
        super(name, id, salary);
        this.shiftHours = shiftHours;
    }

    @Override
    public void work() {
        System.out.println("Nurse is taking care of patients.");
    }
}

class Receptionist extends Employee {
    int deskNumber;

    public Receptionist(String name, int id, double salary, int deskNumber) {
        super(name, id, salary);
        this.deskNumber = deskNumber;
    }

    @Override
    public void work() {
        System.out.println("Receptionist is managing appointments.");
    }
}

class Surgeon extends Doctor {
    int surgeryCount;

    public Surgeon(String name, int id, double salary, String specialization, int surgeryCount) {
        super(name, id, salary, specialization);
        this.surgeryCount = surgeryCount;
    }

    @Override
    public void work() {
        System.out.println("Surgeon is performing surgery.");
    }
}

// Hospital Class
class Hospital {
    public void manageEmployee(Employee emp) {
        emp.work();
    }

    public void paySalary(Employee emp) {
        System.out.printf("The salary of %s %s is %.2f PKR.%n", emp.getClass().getSimpleName(), emp.name, emp.salary);
    }
}
