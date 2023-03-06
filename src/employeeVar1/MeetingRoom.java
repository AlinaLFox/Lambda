
package employeeVar1;
import java.util.*; //importam pentru a crea lista in clasa data
public class MeetingRoom {
    // Declaram o lista de obiecte "Training"(variabila locala)
    private List<Training> trainingAttendance;
    // Constructorul clasei, care primeste ca argument o lista de obiecte "Training"
    public MeetingRoom(List<Training> trainingAttendance) {
        this.trainingAttendance = trainingAttendance;
    }
    // Metoda care ruleaza antrenamentele din lista de antrenamente
    public void attendTraining() {
        // Pentru fiecare obiect "Training" din lista de antrenamente
        for (Training training : trainingAttendance) {
            // Apelam metoda "attendTraining()" pentru acel obiect "Training"
            training.attendTraining();
        }
    }
}