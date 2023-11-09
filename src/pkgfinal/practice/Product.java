/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal.practice;
import java.io.*;

/**
 *
 * @author User
 */
public class Product implements Serializable {
    private int pId;
    private String title;
    private String description;
    private int price;
    private int qty;

    public Product(int pId, String title, String description, int price, int qty) {
        this.pId = pId;
        this.title = title;
        this.description = description;
        this.price = price;
        this.qty = qty;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    
    
    
}
