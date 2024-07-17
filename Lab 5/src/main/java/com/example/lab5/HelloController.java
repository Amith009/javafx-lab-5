package com.example.lab5;

import com.google.gson.Gson;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    public void parseJSON() {
        String jsonString = "{\"productID\":\"001\",\"productName\":Backpack,\"orderDate\":\"12/07/2024,\",\"manufacturer\":adidas\"}";

        Gson gson = new Gson();
        //parsing the json to the java object

        Product product = gson.fromJson(jsonString, Product.class);

        System.out.println("Product ID: " + product.productID);
        System.out.println("Product Name: " + product.productName);
        System.out.println("Order Date: " + product.orderDate);
        System.out.println("Manufacturer: " + product.manufacturer);

        //convert jaava object to JSON

        String jsonOutput = gson.toJson(product);
        System.out.println("The output for JSON " + jsonOutput);


    }
}