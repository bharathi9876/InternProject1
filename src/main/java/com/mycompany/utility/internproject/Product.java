/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utility.internproject;

import java.util.Objects;

/**
 *
 * @author giril
 */
public class Product {
    private String id;
    private String name;
    private String price;
    private String vendor;
    private String qty;

    public Product(String id, String name, String price, String vendor, String qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.vendor = vendor;
        this.qty = qty;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", vendor=" + vendor + ", qty=" + qty + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getQty() {
        return qty;
    }

    
    public void setQty(String qty) {
        this.qty = qty;
    }

 @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if(obj instanceof Product)
        {
            Product temp = (Product) obj;
            if(this.id.equals(temp.id) && this.name.equals(temp.name) && this.price.equals(temp.price) && this.vendor.equals(temp.vendor) && this.qty.equals(temp.qty))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        
        return (this.id.hashCode() + this.name.hashCode() + this.price.hashCode() + this.vendor.hashCode() + this.qty.hashCode());        
    }    
   
    }

    
   
    

