import java.time.LocalDate;

public class dateExcercises {
    public static void main(String[] args) {

    LocalDate today = LocalDate.now();
    
    LocalDate piDay = LocalDate.of(2020,3,14); 
    // System.out.print(piDay);
    String weekday = piDay.getDayOfWeek().toString();
    System.out.println("The weekday of PI day was "+ weekday);
    
    LocalDate beginning_of_the_year_month_year = LocalDate.of(2020, 1, 1);
    LocalDate programmersDay = beginning_of_the_year_month_year.plusDays(256 - 1);
    String weekday_programmersDay = programmersDay.getDayOfWeek().toString();

    System.out.println("Programmer's day is on "+ programmersDay + " The day of the week was " + weekday_programmersDay);
    
    LocalDate earlier = today.minusDays(10000);
    String weekday_earlier = earlier.getDayOfWeek().toString();
    System.out.println("10,000 Days ago from today was, " + earlier + " The day of the week was " + weekday_earlier);


    
  }
}

