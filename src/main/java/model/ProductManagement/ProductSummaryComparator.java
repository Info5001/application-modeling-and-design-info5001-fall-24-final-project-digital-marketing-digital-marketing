package model.ProductManagement;

import java.util.Comparator;

public class ProductSummaryComparator implements Comparator<ProductSummary> {

    String sortingRule;

    public ProductSummaryComparator(String sortingRule) {
        this.sortingRule = sortingRule;
    }

    @Override
    public int compare(ProductSummary o1, ProductSummary o2) {
        int sortOutcomeByPrice = (-1) * Float.compare(o1.getAveragePrice(), o2.getAveragePrice());

        if (sortOutcomeByPrice == 0) {
            return (-1) * Integer.compare(o1.getSalesVolume(), o2.getSalesVolume());
        } else
            return sortOutcomeByPrice;

        // Follow natural ordering of Integers but in reverse (thats where -1 comes in)

    }

}
