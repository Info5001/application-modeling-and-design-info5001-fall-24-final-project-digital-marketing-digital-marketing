package model.ProductManagement;

import java.util.Comparator;

public class ProductSummaryComparator implements Comparator<ProductSummary> {

    String sortingRule;

    public ProductSummaryComparator(String sortingRule) {
        this.sortingRule = sortingRule;
    }

    @Override
    public int compare(ProductSummary o1, ProductSummary o2) {
        if (sortingRule.equals("Name")) {
            return o1.getSubjectProduct().getName().compareTo(o2.getSubjectProduct().getName());
        }

        if (sortingRule.equals("Price")) {
            return (-1) * Float.compare(o1.getAveragePrice(), o2.getAveragePrice());
        }

        return (-1) * Integer.compare(o1.getSalesVolume(), o2.getSalesVolume());
    }

}
