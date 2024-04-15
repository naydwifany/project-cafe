/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import model.Product;

/**
 *
 * @author Diandra L
 */
public class ProductDao {
    
    public static void save(Product product){
    String query = "Insert into product(name, category, price) values ('"+product.getName()+"'. '"+product.getCategory()+"', '"+product.getPrice()+"')";
    DbOperations.setdataOrDekete(query, "Product added successfully!");
    }
}
