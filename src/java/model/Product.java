/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import annoted.ColumnField;
import annoted.TableAnnotation;

/**
 *
 * @author aram
 */
@TableAnnotation(nameTable = "produit")
public class Product {
    @ColumnField(column = "idProduit", primary_key = true)
    private String idProduct;
    
    @ColumnField(column = "nameProduit")
    private String nameProduct;
    
    @ColumnField(column = "refProduit")
    private String refProduct;
    
    @ColumnField(column = "typeStock")
    private Integer typeStock;
    
    // GETTERS AND SETTERS
    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getRefProduct() {
        return refProduct;
    }

    public void setRefProduct(String refProduct) {
        this.refProduct = refProduct;
    }

    public Integer getTypeStock() {
        return typeStock;
    }

    public void setTypeStock(Integer typeStock) {
        this.typeStock = typeStock;
    }
    
    
}
