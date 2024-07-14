package Date.Task_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Output {

    public static void main(String[] args) {

        LocalDate publishDate = LocalDate.now().minusDays(0);
        LocalTime publishTime = LocalTime.now()
            .minusHours(0)
            .minusMinutes(0);
        LocalDateTime timestamp = LocalDateTime.of(publishDate, publishTime);

        DateCalculation calculation = new DateCalculation();
        System.out.println(calculation.getTimestamp(timestamp));
    }
}
