public class PostageCalculator {

    public static double calculatePostage(String from, String to, double weight, double length, double width, double height){
        double baseCost = 3.75;

        double countyCost = Math.abs(Double.parseDouble(from.substring(0, 3)) - Double.parseDouble(to.substring(0, 3))) / 100;

        double weightCost = Math.ceil(weight * 10) * 0.05;

        double oversizeCost = 0;
        if (length + width + height > 36){
            oversizeCost = (length + width + height - 36) * 0.10;
        }

        double overweightCost = 0;
        if (weight > 40) {
            overweightCost = Math.ceil((weight - 40) * 10) * 0.10;
        }
        double cost = baseCost + countyCost + weightCost + oversizeCost + overweightCost;

        return cost;
    }

    public static double calculatePostage(Package pack)
    {
        double cost = 3.75;
        double combined = pack.getLength() + pack.getHeight() + pack.getWidth();
        if (pack.getWeight() > 40){
            double perTenthPound = 0.05 * (int) (40 / (0.1));
            cost += perTenthPound;
            perTenthPound = 0.1 * (int)(((pack.getWeight())-40) /0.1);
            cost += perTenthPound;
        }
        if (combined  > 36){
            double perInch = 0.1 * (int)(combined-36);
            cost += perInch;
        }
        else{
            double perTenthPound = 0.05 * (int) (pack.getWeight() / (0.1));
            cost += perTenthPound;
        }
        double ccDiff = Math.abs(pack.getDestination().getZipCode() - pack.getOrigin().getZipCode());
        ccDiff /= 100;
        cost += ccDiff;
        return cost;
    }

    public static double calculatePostage(Address origin, Address destination, double weight, double height, double length, double width) {
        double cost = 3.75;
        double combined = height + length + width;
        if (weight > 40) {
            double perTenthPound = 0.05 * (int) (40 / (0.1));
            cost += perTenthPound;
            perTenthPound = 0.1 * (int)(((weight)-40) /0.1);
            cost += perTenthPound;
        }
        if (combined > 36) {
            double perInch = 0.1 * (int)(combined-36);
            cost += perInch;
        }
        else {
            double perTenthPound = 0.05 * (int) (weight / (0.1));
            cost += perTenthPound;
        }
        double ccDiff = Math.abs(origin.getZipCode() - destination.getZipCode());
        ccDiff /= 100;
        cost += ccDiff;
        return cost;
    }



}
