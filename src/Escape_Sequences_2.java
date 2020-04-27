import java.util.Scanner;

public class Escape_Sequences_2 {
    public static void main(String[] args) {
        double cost;
        double totalCost =0;
        double total = 0;
        double totalOfTotal = 0;
        int quantity;
        int totalQuantity = 0;
        boolean add = true;
        String response;

        Scanner in = new Scanner(System.in);

        while(add) {
            System.out.print("Enter cost: ");
            cost = in.nextDouble();
            totalCost += cost;

            System.out.print("Enter quntity: ");
            quantity = in.nextInt();
            in.nextLine();
            totalQuantity += quantity;

            total = cost * quantity;
            totalOfTotal += total;


            System.out.println("Cost" + "\t" + "Quantity" + "\t" + "Total");
            System.out.println("$" + cost + "\t\t" + quantity + "\t\t" + total);

            System.out.println("Do yo have other values to enter?(yes/no)");
            response = in.nextLine();
            if(response.equalsIgnoreCase("no")){
                add = false;
            }
        }
        System.out.println("--------------------------------------------");
        System.out.println("Total " + "\t\t" + totalQuantity + "\t\t" + totalOfTotal);


    }
}
