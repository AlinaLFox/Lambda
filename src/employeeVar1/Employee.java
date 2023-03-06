package employeeVar1;

public class Employee {
//declaram variabile locale
    public String name;
    public int workHours;
// constructorul clasei Employee
    public Employee(String name, int workHours) {
        this.name = name;
        this.workHours = workHours;
    }
// constructorul de  geturi si seturi pentru variabile noastre
    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
