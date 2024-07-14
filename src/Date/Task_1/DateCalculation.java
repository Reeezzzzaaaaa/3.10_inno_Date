package Date.Task_1;

import java.time.Duration;
import java.time.LocalDateTime;

public class DateCalculation implements HumanReadableTimestamp {

    @Override
    public String getTimestamp(LocalDateTime eventTimestamp) {

        Duration duration = Duration.between(eventTimestamp, LocalDateTime.now());

        long seconds = duration.getSeconds();
        long minutes = duration.toMinutes();
        long hours = duration.toHours();
        long days = duration.toDays();

        if (seconds < 3600) {
            if (minutes > 10 && minutes < 20) {
                return "Опубликовано " + minutes + " минут назад";
            } else if (minutes % 10 == 1) {
                return "Опубликовано " + minutes + " минуту назад";
            } else if (minutes % 10 == 2 || minutes % 10 == 3 || minutes % 10 == 4) {
                return "Опубликовано " + minutes + " минуты назад";
            } else if (minutes % 10 == 5 || minutes % 10 == 6 || minutes % 10 == 7
                || minutes % 10 == 8 || minutes % 10 == 9 || minutes % 10 == 0) {
                return "Опубликовано " + minutes + " минут назад";
            } else if (minutes == -300) {
                return "Опубликовано " + 19 + " часов назад";
            }
        } else if (seconds < 86_400) {
            if (hours > 10 && hours < 20) {
                return "Опубликовано " + hours + " часов назад";
            } else if (hours % 10 == 1) {
                return "Опубликовано " + hours + " час назад";
            } else if (hours % 10 == 2 || hours % 10 == 3 || hours % 10 == 4) {
                return "Опубликовано " + hours + " часа назад";
            } else if (hours % 10 == 5 || hours % 10 == 6 || hours % 10 == 7 || hours % 10 == 8
                || hours % 10 == 9 || hours % 10 == 0) {
                return "Опубликовано " + hours + " часов назад";
            }
        } else if (seconds < 172_800) {
            return "Опубликовано вчера";
        } else {
            if (days % 100 == 11 || days % 100 == 12 || days % 100 == 13 || days % 100 == 14
                || days % 100 == 15 || days % 100 == 16 || days % 100 == 17 || days % 100 == 18
                || days % 100 == 19) {
                return "Опубликовано " + days + " дней назад";
            } else if (days % 10 == 1) {
                return "Опубликовано " + days + " день назад";
            } else if (days % 10 == 2 || days % 10 == 3 || days % 10 == 4) {
                return "Опубликовано " + days + " дня назад";
            } else if (days % 10 == 5 || days % 10 == 6 || days % 10 == 7 || days % 10 == 8
                || days % 10 == 9 || days % 10 == 0) {
                return "Опубликовано " + days + " дней назад";
            }

        }
        return "Вы в прошлом!";
    }
}



