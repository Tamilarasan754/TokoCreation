import java.lang.ref.Reference;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class RegistrationTest {
    static Registration[] registrations = new Registration[25];

    public static void main(String[] args) {
        setup();
        // Events with the most registrations in September.
        // MostEventSep();
        // // Events registered after October 5, 2023
        // eventAfterReg();
        // // Events that were registered on the same date as another
        // sameDateEvent();
        // // Registration data for events with names starting with "S."
        // startWithS();
        // // Event with the highest number of
        // hgst();
        // // List of unique event names.
        // uniqueEventNames();

        ///////

        List<Registration> list=Arrays.asList(registrations);
       // list.stream().filter(x->x.getEvent_name().equals("Marathon")).forEach(System.out::println);
        list.stream().filter(x->x.getRegistration_date().getMonth().equals(Month.SEPTEMBER)).forEach(System.out::println);
        

        Comparator<Registration> methodRef = Comparator.comparing(Registration::length);
        

    }

    public static void setup() {

        // Create an array of Registration objects with sample data

        // Sample data entries
        registrations[0] = new Registration(1, "Marathon", "John Doe", LocalDate.of(2023, 10, 1));
        registrations[1] = new Registration(2, "Swimming Competition", "Alice Smith", LocalDate.of(2023, 9, 25));
        registrations[2] = new Registration(3, "Soccer Tournament", "David Johnson", LocalDate.of(2023, 9, 1));
        registrations[3] = new Registration(4, "Tennis Open", "Emily Davis", LocalDate.of(2023, 10, 5));
        registrations[4] = new Registration(5, "Basketball Championship", "Sophia Brown", LocalDate.of(2023, 9, 15));
        registrations[5] = new Registration(6, "Cycling Race", "John Doe", LocalDate.of(2023, 10, 2));
        registrations[6] = new Registration(7, "Gymnastics Show", "Olivia Lee", LocalDate.of(2023, 9, 15));
        registrations[7] = new Registration(8, "Volleyball Tournament", "Ethan Anderson", LocalDate.of(2023, 10, 8));
        registrations[8] = new Registration(9, "Table Tennis Championship", "Alice Smith", LocalDate.of(2023, 9, 22));
        registrations[9] = new Registration(10, "Weightlifting Competition", "Liam Perez", LocalDate.of(2023, 9, 13));
        registrations[10] = new Registration(11, "Running Race", "Chloe Taylor", LocalDate.of(2023, 10, 1));
        registrations[11] = new Registration(12, "High Jump Championship", "Noah Hernandez", LocalDate.of(2023, 9, 30));
        registrations[12] = new Registration(13, "Badminton Tournament", "Grace Scott", LocalDate.of(2023, 10, 10));
        registrations[13] = new Registration(14, "Diving Competition", "Alice Smith", LocalDate.of(2023, 9, 26));
        registrations[14] = new Registration(15, "Archery Contest", "Aria Adams", LocalDate.of(2023, 10, 7));
        registrations[15] = new Registration(16, "Wrestling Championship", "Mia Turner", LocalDate.of(2023, 9, 19));
        registrations[16] = new Registration(17, "Marathon", "Logan Hall", LocalDate.of(2023, 9, 19));
        registrations[17] = new Registration(18, "Karate Tournament", "Aiden White", LocalDate.of(2023, 9, 6));
        registrations[18] = new Registration(19, "Fencing Championship", "Alice Smith", LocalDate.of(2023, 10, 6));
        registrations[19] = new Registration(20, "Shot Put Competition", "Mason King", LocalDate.of(2023, 9, 23));
        registrations[20] = new Registration(21, "Boxing Match", "Layla Turner", LocalDate.of(2023, 10, 9));
        registrations[21] = new Registration(22, "Marathon", "Jackson Green", LocalDate.of(2023, 9, 27));
        registrations[22] = new Registration(23, "Taekwondo Championship", "Harper Allen", LocalDate.of(2023, 10, 8));
        registrations[23] = new Registration(24, "Pole Vault Competition", "Lucas Adams", LocalDate.of(2023, 9, 21));
        registrations[24] = new Registration(25, "Marathon", "Luna Brown", LocalDate.of(2023, 10, 11));
    }

    // Events with the most registrations in September.
    public static void MostEventSep() {
        System.out.println("// Events with the most registrations in September.");
        int count = 0;
        String str1 = "";
        for (Registration reg : registrations) {
            if(reg.getRegistration_date().getMonth().equals(Month.SEPTEMBER))
            {
            String str = reg.getEvent_name();
            count = 0;
            for (int i = 0; i < 25; i++) {
                if (str == registrations[i].getEvent_name()&&registrations[i].getRegistration_date().getMonth().equals(Month.SEPTEMBER)) {
                    count++;
                }
                if (count > 0)
                    str1 = str;

            }
        }
        }
        System.out.println(str1);
    

    }

    // List of unique event names.
    public static void uniqueEventNames() {
        System.out.println("// List of unique event names.");
        int count = 0;
        for (int j = 0; j < 25; j++) {
            // String str= reg.getEvent_name();
            count = 0;
            for (int i = j + 1; i < 25; i++) {
                if (registrations[j].getEvent_name() == registrations[i].getEvent_name()) {
                    registrations[i].setEvent_name(null);
                }

            }
        }
        for (Registration reg : registrations) {
            if (reg.getEvent_name() != null)
                System.out.println(reg.getEvent_name());
        }

    }

    // Events registered after October 5, 2023
    public static void eventAfterReg() {
        System.out.println("// Events registered after October 5, 2023");
        LocalDate date2 = LocalDate.parse("2023-10-05");
        for (Registration reg : registrations) {
            if (reg.getRegistration_date().isAfter(date2))
                System.out.println(reg);
        }
    }

    // Events that were registered on the same date as another event
    public static void sameDateEvent() {
        System.out.println("// Events that were registered on the same date as another event");
        Map<LocalDate, Integer> ss = new HashMap<>();
        for (Registration reg : registrations) {
            ss.put(reg.getRegistration_date(), ss.getOrDefault(reg.getRegistration_date(), 0) + 1);
        }

        for (Entry<LocalDate, Integer> en : ss.entrySet()) {
            if (en.getValue() > 1) {
                System.out.println(en.getKey());
                for (Registration reg : registrations) {

                    if (reg.getRegistration_date().equals(en.getKey()))
                        System.out.println(reg.getEvent_name());
                }
            }
        }

    }

    // Registration data for events with names starting with "S."
    public static void startWithS() {
        System.out.println("// Registration data for events with names starting with \"S.\"");
        Map<LocalDate, String> st = new HashMap<>();
        for (Registration reg : registrations) {
            String str = reg.getEvent_name();
            if (str.charAt(0) == 'S')
                st.put(reg.getRegistration_date(), reg.getEvent_name());
        }
        st.entrySet().stream().forEach(System.out::println);
    }

    // Event with the highest number of registrations
    public static void hgst() {
        System.out.println("// Event with the highest number of registrations");
        Map<String, Integer> high = new HashMap<>();
        int count = 0;
        String str = null;
        for (int i = 0; i < 25; i++) {
            int count1 = 0;
            for (int j = i + 1; j < 25; j++) {
                if ((registrations[i].getEvent_name() == registrations[j].getEvent_name())
                        && registrations[i].getEvent_name() != null) {
                    count1++;
                    registrations[j].setEvent_name(null);
                }
            }
            if (count < count1) {
                count = count1;
                str = registrations[i].getEvent_name();
            }
        }
        System.out.println(str);
    }
}
