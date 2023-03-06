import java.util.Scanner;

public class PackageSimulatorRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean stop = false;
        System.out.print("""
               --------------------------------------------------
               What would you like to do?
               1. Calculate cost of one package
               2. Simulate packages
               3. How package costs are calculated
               4. Exit
               """);
        String choice = "";
        choice = s.nextLine();
        while (stop == false) {
            if (choice.equals("1")){
                System.out.println("Enter the zip code of the origin package: ");
                String origin = s.nextLine();
                System.out.println("Enter the zip code of the destination package: ");
                String destination = s.nextLine();
                System.out.println("Enter the weight of the package: ");
                double weight = s.nextDouble();
                System.out.println("Enter the length of the package: ");
                double length = s.nextDouble();
                System.out.println("Enter the width of the package: ");
                double width = s.nextDouble();
                System.out.println("Enter the height of the package: ");
                double height = s.nextDouble();
                System.out.println("Cost: " + PostageCalculator.calculatePostage(origin, destination, weight, length, width, height));
                stop = true;
            }
            else if (choice.equals("2")){
                System.out.println("Feature not complete.");
                stop = true;
            }
            else if (choice.equals("3")){
                System.out.println("The base cost is $3.75 and the cost increases depending on the zip codes, weight, and dimensions of the package");
                System.out.println("Regarding zip codes, we divide the difference of the first three digits of a zip code by 100 and add that to calculate the final total");
                System.out.println("Regarding weight, 5 cents is added for every tenth of a pound of the package");
                System.out.println("If the total weight is greater than 40 pounds, everything over the 40 pound limit will be charged 10 cents for every tenth of a pound");
                System.out.println("Regarding dimensions, if length + width + height > 36, every additional inch will cost 10 cents");
                stop = true;
            }
            else if (choice.equals("4")){
                stop = true;
            }
        }
    }


}