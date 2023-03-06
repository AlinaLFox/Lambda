package employeeVar1;

public class Programmer extends Employee implements Training {
    public Programmer(String name, int workHours) {
        super(name, workHours);
    }

    @Override
    public void attendTraining() {
        System.out.println (getName() + " attends training.");
    }
}
