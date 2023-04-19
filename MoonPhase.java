import java.time.LocalDate;

public class MoonPhase {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        double age = getMoonAge(currentDate);
        String phase = getMoonPhase(age);

        System.out.println("On " + currentDate + " the moon is in the " + phase + " phase.");
    }

    public static double getMoonAge(LocalDate date) {
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        double totalDays = (year - 1900) * 365.2422 + ((year - 1900) / 4) + day;
        if (month <= 2) {
            year--;
            month += 12;
        }
        totalDays += (month - 2) * 30.6;
        double age = totalDays % 29.53;
        return age;
    }

    public static String getMoonPhase(double age) {
        if (age < 1.84566 || age >= 28.147) {
            return "New Moon";
        } else if (age < 5.53699) {
            return "Waxing Crescent";
        } else if (age < 9.22831) {
            return "First Quarter";
        } else if (age < 12.91963) {
            return "Waxing Gibbous";
        } else if (age < 16.61096) {
            return "Full Moon";
        } else if (age < 20.30228) {
            return "Waning Gibbous";
        } else if (age < 23.99361) {
            return "Last Quarter";
        } else {
            return "Waning Crescent";
        }
    }
}