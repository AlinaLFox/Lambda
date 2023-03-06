import employeeVar1.*;

import java.sql.Array;
import java.util.*;

public class Execute {
    public static void main(String[] args) {
// creem un obiect cu nume "m" de tip manager
        Manager m = new Manager("Jena",7);
        // chemam pentru acest obiect metodele
        m.attendTraining();
        m.conductInterview();
// creem un obiect de tip programer
        Programmer p = new Programmer("Basil", 9);
        // chemam pentru acest obiect metodele
        p.attendTraining();
        /* declaram o lista de obiecte de tip Training,
        care mai departe vor fi folosite de metoda attendTraining
         */
        List<Training> list = new ArrayList<>();
        //adaugam obiect in lista prin metoda prescrisa pentru obiectele de tip list
        list.add(new Manager("Jhon", 6));
        list.add(new Programmer("Ann", 8));
//declaram un obiect nou de tip MeetingRoom
        MeetingRoom meetingRoom = new MeetingRoom(list); // in paranteze este argumentul pe care primeste(lista de obiecte "Training")
        /* chemam pentru acest obiect metoda,
        care va rula de atitea ori,
        cite obiecte sunt in lista
         */
        meetingRoom.attendTraining();

        System.out.println();
    }
}