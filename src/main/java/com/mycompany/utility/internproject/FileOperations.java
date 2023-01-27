/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utility.internproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author giril
 */
public class FileOperations {

    public static void main(String[] args) throws FileNotFoundException {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\giril\\OneDrive\\Documents\\IT Exps Intern Projects\\project 1\\productdata.csv"));
        searchGoodProducts(br);

    }

    public static void searchGoodProducts(BufferedReader br1) {
        try {
//parsing a CSV file into BufferedReader class constructor  
            br1.readLine(); // this will read the first line
            String line;
            String splitBy = ",";
            ArrayList<Product> productlist = new ArrayList<Product>();
            while ((line = br1.readLine()) != null) //returns a Boolean value  
            {
                String token[] = line.split(splitBy);    // use comma as separator  
                if (token.length < 5) {
                    continue;
                }
                if (!token[0].isEmpty() && !token[1].isEmpty() && !token[2].isEmpty() && !token[3].isEmpty() && !token[4].isEmpty()) {
                    //System.out.println("Product [Id=" + token[0] + ", Name=" + token[1] + ", Price=" + token[2] + ", Vendor=" + token[3] + ", Qty= " + token[4] + "}");
                    //Product p1=new Product(token[0], token[1], token[2], token[3], token[4]);
                    Product p1 = new Product();
                    p1.setId(token[0]);
                    p1.setName(token[1]);
                    p1.setPrice(token[2]);
                    p1.setVendor(token[3]);
                    p1.setQty(token[4]);

                    productlist.add(p1);
                }
            }
            //Remove duplicates
            Set<Product> s = new HashSet<Product>();
            s.addAll(productlist);
            ArrayList<Product> newproductlist = new ArrayList<Product>();
            newproductlist.addAll(s);
            //print original
            printoldArray(productlist);
            //printgood data
            printnewArray(newproductlist);

            br1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    

    public static void printoldArray(ArrayList<Product> productlist) {
        for (Product q : productlist) {
            System.out.println("With Duplicates=" + q);
        }
    }

    public static void printnewArray(ArrayList<Product> newproductlist) {
        for (Product p : newproductlist) {
            System.out.println("Good data=" + p);
        }
    }

}
