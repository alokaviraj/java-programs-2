import java.sql.Date;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
public class DateAndTime {
    public static void main(String[] args) {
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println(dt.format(now));  
    }

    
}