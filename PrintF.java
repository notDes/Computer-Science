

public class PrintF {
    public static void main(String[] args) {
        int numberOfItemsPurcahsed = 15;
        double subTotal = 142.18;
        double Tax = 5.66;
        double Total = 147.84;
        int gasPointsEarned = 49;

        System.out.printf("%28s:%10d%n", "Number of Items purhcased",numberOfItemsPurcahsed);

        System.out.printf("                    %-7s:%10.2f\n", "Subtotal", subTotal);

        System.out.printf("                         %-2s:%10.2f\n ", "Tax", Tax);

        String lineBreak = "------";

        System.out.printf("%38s%n", lineBreak);

        System.out.printf("                       %-4s:%10.2f\n ", "Total", + Total);

        System.out.printf("%27s:%10d%n", "Gas points earned", gasPointsEarned);




    }
    
}
