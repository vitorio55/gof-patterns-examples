package com.learning.gofpatterns.structural.facade;

public interface MarketPlaceOperations {
    void buyItem(String userName, String itemCode, float price);
    void listItemForSale(String userName, String itemCode, float price);
}
