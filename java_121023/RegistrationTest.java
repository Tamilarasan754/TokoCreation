import java.util.HashMap;
import java.util.Map;

public class RegistrationTest {
    public static void main(String[] args)

    {

        // Creating sample data

        Registration[] registrations = new Registration[5];

        registrations[0] = new Registration(1, 101, 1001, "2023-10-10");

        registrations[1] = new Registration(2, 102, 1002, "2023-10-11");

        registrations[2] = new Registration(3, 103, 1003, "2023-10-10");

        registrations[3] = new Registration(4, 104, 1004, "2023-10-13");

        registrations[4] = new Registration(5, 105, 1005, "2023-10-10");

 

        // Create a map to store registration_date and count

        Map<String, Integer> dateCountMap = new HashMap<>();

 

        // Count registration_date occurrences

        for (Registration registration : registrations) {

            String registrationDate = registration.getRegistration_date();

            dateCountMap.put(registrationDate, dateCountMap.getOrDefault(registrationDate, 0) + 1);

        }

        

        // Print registration_date and count
        System.out.println(dateCountMap);

        for (Map.Entry<String, Integer> entry : dateCountMap.entrySet()) {

            String registrationDate = entry.getKey();

            int count = entry.getValue();

            System.out.println("Registration Date: " + registrationDate + ", Count: " + count);

    }

}
    
}
