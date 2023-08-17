class employee {
    Integer EmployeeID;
    String name;
    Integer Age;
    Integer Salary;

    public void work() {
    }

    public void DisplayDetail() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.Age);
        System.out.println("EmployeeID: " + this.EmployeeID);
        System.out.println("Salary: " + this.Salary);
    }
}

class Manager extends employee {
    String Department;

    public Manager(String name, int Age, int EmployeeID, int Salary, String Department) {
        this.name = name;
        this.Age = Age;
        this.EmployeeID = EmployeeID;
        this.Salary = Salary;
        this.Department = Department;
    }

    public void CallMeeting() {
        System.out.println("Department: " + this.Department);
        System.out.println(this.name + " is working");
        System.out.println(this.name + " is scheduling a meeting");
    }
}

class Programmer extends employee {
    String Language;

    public Programmer(String name, int Age, int EmployeeID, int Salary, String Language) {
        this.name = name;
        this.Age = Age;
        this.EmployeeID = EmployeeID;
        this.Salary = Salary;
        this.Language = Language;
    }

    public void coding() {
        System.out.println("Language: " + this.Language);
        System.out.println(this.name + " is working");
        System.out.println(this.name + " is coding");
    }
}

class Security extends employee {
    String Shift;

    public Security(String name, int Age, int EmployeeID, int Salary, String Shift) {
        this.name = name;
        this.Age = Age;
        this.EmployeeID = EmployeeID;
        this.Salary = Salary;
        this.Shift = Shift;
    }

    public void Patrol() {
        System.out.println("Avaliable at " + this.Shift + " Shift");
        System.out.println(this.name + " is working");
        System.out.println(this.name + " is Patrolling");
    }
}

class Lab {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 40, 123, 50000, "IT");
        Programmer programmer = new Programmer("Jane Smith", 30, 456, 40000, "Java");
        Security security = new Security("Adam Jones", 45, 789, 18000, "Night");

        manager.DisplayDetail();
        manager.work();
        manager.CallMeeting();

        programmer.DisplayDetail();
        programmer.work();
        programmer.coding();

        security.DisplayDetail();
        security.work();
        security.Patrol();
    }
}