/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.ProductManagement;

/**
 *
 * @author kal bugrara
 */

// this class will extract summary data from the product
public class ProductSummary {
    int rank; // will be done later
    Product subjectProduct;

    int salesVolume;

    float averagePrice;

    int salesQuantity;
    int numberofsalesabovetarget;
    int numberofsalesbelowtarget;
    int productpriceperformance; // total profit above target --could be negative

    public ProductSummary(Product p) {

        numberofsalesabovetarget = p.getNumberOfProductSalesAboveTarget();
        productpriceperformance = p.getOrderPricePerformance();
        numberofsalesbelowtarget = p.getNumberOfProductSalesBelowTarget();

        rank = 0;
        subjectProduct = p;
        salesVolume = p.getSalesVolume();
        averagePrice = p.getAveragePrice();
        salesQuantity = p.getTotalQuantity();
    }

    public boolean isProductAlwaysAboveTarget() {
        return false; // to be implemented
    }

    public int getNumberAboveTarget() {
        return numberofsalesabovetarget;
    }

    public int getNumberBelowTarget() {
        return numberofsalesbelowtarget;
    }

    public Product getSubjectProduct() {
        return subjectProduct;
    }

    public int getSalesVolume() {
        return salesVolume;
    }

    public float getAveragePrice() {
        return averagePrice;
    }

    public void printProductSummary() {
        // System.out.println(subjectproduct.getName() + " | " + acutalsalesvolume + " |
        // " + numberofsalesabovetarget + " | " + productpriceperformance);
    }

}
