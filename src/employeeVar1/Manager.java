package employeeVar1;

public class Manager extends Employee implements Training, Interview {
    // facem override la constructor din clasa extinsa(employee)
    public Manager(String name, int workHours) {
        // cuvintul super extrage variabile din superclasa
        super(name, workHours);
    }
//facem override la metodele din clasele implementate
    @Override
    public void attendTraining() {
        /*in corp de metoda scriem ce returnam
        (in cazul dat nu este necesar sa scriem system out in main,
        programa o sa ruleze asa
         */
        System.out.println (getName() + " attends training.");
    }

    @Override
    public void conductInterview() {
        System.out.println (getName() + " is conducting interview.");
    }
}
