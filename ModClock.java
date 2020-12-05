import java.util.Scanner;

class ModClock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please input current hour:");
        int currentHour = input.nextInt();

        System.out.print("Please input current minute:");
        int currentMinute = input.nextInt();


        System.out.print("Please input number of hours later:");
        int numberOfHours = input.nextInt();

        System.out.print("Please input number of minutes later:");
        int numberOfMinutes = input.nextInt();

    
        System.out.printf("%5s=%8s\n", "Current Time ", currentHour + ":" + currentMinute);

        int hourAhead = currentHour + numberOfHours;
        int minuteAhead = currentMinute + numberOfMinutes;
        int futureMinute = minuteAhead % 60;
        int futureHour = ((hourAhead) + (minuteAhead) / 60) %24;
        
        System.out.printf("%5s=%8s\n", "Future Time ",  futureHour + ":" + futureMinute);

        






    }

}
