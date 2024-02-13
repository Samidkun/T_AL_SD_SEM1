import java.util.HashMap;
import java.util.Map;

public class RoyalGardenfunction {
    private static final int[][] FLOWER_STOCK = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
    };

    private static final Map<String, Integer> FLOWER_PRICES = new HashMap<>();
    private static final Map<String, Integer> FLOWER_REDUCTION = new HashMap<>();

    static {
        FLOWER_PRICES.put("Aglonema", 75000);
        FLOWER_PRICES.put("Caladium", 50000);
        FLOWER_PRICES.put("Alocasia", 60000);
        FLOWER_PRICES.put("Rose", 10000);

        FLOWER_REDUCTION.put("Aglonema", -1);
        FLOWER_REDUCTION.put("Caladium", -2);
        FLOWER_REDUCTION.put("Alocasia", 0);
        FLOWER_REDUCTION.put("Rose", -5);
    }

    public static void main(String[] args) {
        RoyalGardenfunction royalGarden = new RoyalGardenfunction();
        royalGarden.displayRevenue();
        royalGarden.displayStockAtBranch(4);
    }

    private void displayRevenue() {
        for (int branch = 0; branch < FLOWER_STOCK.length; branch++) {
            int totalRevenue = calculateBranchRevenue(branch);
            System.out.println("Revenue for Branch " + (branch + 1) + ": $" + totalRevenue);
        }
    }

    private int calculateBranchRevenue(int branch) {
        int totalRevenue = 0;
        for (int flowerIndex = 0; flowerIndex < FLOWER_STOCK[branch].length; flowerIndex++) {
            totalRevenue += FLOWER_STOCK[branch][flowerIndex] * FLOWER_PRICES.get(getFlowerName(flowerIndex));
        }
        return totalRevenue;
    }

    private void displayStockAtBranch(int branch) {
        System.out.println("Stock at Branch " + branch + ":");
        for (int flowerIndex = 0; flowerIndex < FLOWER_STOCK[branch - 1].length; flowerIndex++) {
            int stock = FLOWER_STOCK[branch - 1][flowerIndex] + FLOWER_REDUCTION.get(getFlowerName(flowerIndex));
            System.out.println(getFlowerName(flowerIndex) + ": " + stock);
        }
    }

    private String getFlowerName(int index) {
        switch (index) {
            case 0:
                return "Aglonema";
            case 1:
                return "Caladium";
            case 2:
                return "Alocasia";
            case 3:
                return "Rose";
            default:
                return "";
        }
    }
}
