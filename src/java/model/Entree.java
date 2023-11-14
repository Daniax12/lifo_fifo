/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import annoted.ColumnField;
import annoted.TableAnnotation;
import java.sql.Connection;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author aram
 */
@TableAnnotation(nameTable = "entree")
public class Entree {
    @ColumnField(column = "idEntree", primary_key = true)
    private String idEntree;
    
    @ColumnField(column = "idProduit")
    private String idProduct;
    
    @ColumnField(column = "dateEntree")
    private java.sql.Date dateEntree;
    
    @ColumnField(column = "quantity")
    private Double quantity;
    
    @ColumnField(column = "unitPriceEntree")
    private Double unitPriceEntree;
    
    @ColumnField(column = "montantEntree")
    private Double montantEntree;
    
    @ColumnField(column = "idMagasin")
    private String idWarehouse;
    
    @ColumnField(column = "availability")
    private Double availability;
    
    // METHOD
    
    /*
    GET THE STOCK AVAILABLE > 0
    */
    public List<Entree> getAvailableStock(java.sql.Date dateReport, Connection connection) throws Exception{
        // where available > 0
        // But order by depending on lifo or fifo
        return null;
    }
    
    /*
    Get the sum of quntity of entries
    */
    public static double getSumStockEntries(List<Entree> entries){
        return 0;
    }
  
    /*
    Get the pump of a list of entries
    */
    public static double getPUMPofEntries(List<Entree> entries){
        return 0;
    }
    
    
    /*
    Avoir tous es entrees d'un produit a un date donne et un report s'il y en a
    */
    public List<Entree> getEntreeBetween(java.sql.Date dateReport, Connection connection, Report lastReport) throws Exception{
        // LastReport can be null here
        // if null -> Tous les entree before date
        // else -> entre 2 dates
        // get the id ka
        return null;
    }
    
    // CONSTRUCTORS
    public Entree(String idProduct, String idWarehouse){
    
    }
    
    public Entree(){}

    public Entree(String idEntree, String idProduct, Date dateEntree, Double quantity, Double unitPriceEntree, String idWarehouse, Double availability) throws Exception{
        try {
            this.setIdEntree(idEntree);
            this.setIdProduct(idProduct);
            this.setDateEntree(dateEntree);
            this.setQuantity(quantity);
            this.setUnitPriceEntree(unitPriceEntree);
            this.setIdWarehouse(idWarehouse);
            this.setAvailability(availability);
        } catch (Exception e) {
            throw new Exception("Error on constructing the Entree with "+e.getLocalizedMessage());
        }
        
    }
    
    
    
    // Getters and setters
    public String getIdEntree() {
        return idEntree;
    }

    public void setIdEntree(String idEntree) {
        this.idEntree = idEntree;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public Date getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(Date dateEntree) {
        this.dateEntree = dateEntree;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) throws Exception{
        if(quantity < 0) throw new Exception("Error on setting the quantity of entree. Negative value");
        this.quantity = quantity;
    }

    public Double getUnitPriceEntree() {
        return unitPriceEntree;
    }

    public void setUnitPriceEntree(Double unitPriceEntree) {
        this.unitPriceEntree = unitPriceEntree;
    }

    public Double getMontantEntree() {
        return montantEntree;
    }

    public void setMontantEntree(Double montantEntree) {
        this.montantEntree = montantEntree;
    }

    public String getIdWarehouse() {
        return idWarehouse;
    }

    public void setIdWarehouse(String idWarehouse) {
        this.idWarehouse = idWarehouse;
    }

    public Double getAvailability() {
        return availability;
    }

    public void setAvailability(Double availability) {
        this.availability = availability;
    }
    
    
    
}
