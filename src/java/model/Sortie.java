/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import annoted.ColumnField;
import annoted.TableAnnotation;
import database.ConnectionBase;
import java.sql.*;
import java.util.List;

/**
 *
 * @author aram
 */
@TableAnnotation(nameTable = "sortie")
public class Sortie {
    @ColumnField(column = "idSortie", primary_key = true)
    private String idSortie;
    
    @ColumnField(column = "idProduit")
    private String idProduct;
    
    @ColumnField(column = "dateSortie")
    private java.sql.Date dateSortie;
    
    @ColumnField(column = "quantity")
    private Double quantity;
    
    @ColumnField(column = "montantSortie")
    private Double montantSortie;
    
    @ColumnField(column = "idMagasin")
    private String idWarehouse;
    
    @ColumnField(column = "unitPriceSortie")  
    private Double unitPriceSortie;
    
    private List<Detail_sortie> sorties_fille;
    
    private Product productSortie;
    
    private Warehouse warehouseSortie;
    
    // METHOD
    
    
    /*
    Make the process of sortie
    */
    public static int makeSortie(Connection connection) throws Exception{
        // check stock
        // if yes
        // get available stock
        // 
        return 1;
    }
        
    public static void updateStock(Sortie sortie, List<Entree> entries, List<Detail_sortie> filles, int index_entries, Connection connection) throws Exception{
        // updating the availability of entries concerned until index
        // update the sortie pu 
        // insert filles
    }
    
    
    /*
    Get the PUMP Of sortie
    */
    public static double getPUsortie(List<Detail_sortie> filles, double a_sortir){
        // sttaic because filles mety tsy avy any anaty base
        return 0.0;
    }
    
    
    
    /*
    Know if we can make sortie
    */
    public boolean canMakeSortie(String valueHtml, java.sql.Date dateSortie, Connection connection) throws Exception{
        
        // Get the report at this date
        // make the difference -> if > 0 -> true
        return false;
    }
        
    /*
    Get the sum of quntity of sorties
    */
    public static double getSumStockSorties(List<Sortie> sorties){
        return 0;
    }
    
    
    /*
    Avoir tous les sorties d'un produit a un date donne et un report s'il y en a
    */
    public List<Sortie> getSortieBetween(java.sql.Date dateReport, Connection connection, Report lastReport) throws Exception{
        // LastReport can be null here
        // if null -> Tous les sorties before date
        // else -> entre 2 dates
        // get the id ka
        return null;
    }
    
    // CONSTRUCTORS
    public Sortie(String idProduct, String idWarehouse, String qtyHtml) throws Exception{
        Connection connection = null;
        ConnectionBase cb = new ConnectionBase();
        try {
            double value = Double.valueOf(qtyHtml);
            if(value < 0) throw new Exception("Can not set the quantity because value is negative");
            this.setQuantity(value);
            
            
            
        } catch (Exception e) {
            throw new Exception("Error on constructing the sortie with "+e.getMessage());
        }
        
    }
    
    public Sortie(){}
    
    // GETTERS AND SETTERS
    public String getIdSortie() {
        return idSortie;
    }

    public void setIdSortie(String idSortie) {
        this.idSortie = idSortie;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getMontantSortie() {
        return montantSortie;
    }

    public void setMontantSortie(Double montantSortie) {
        this.montantSortie = montantSortie;
    }

    public String getIdWarehouse() {
        return idWarehouse;
    }

    public void setIdWarehouse(String idWarehouse) {
        this.idWarehouse = idWarehouse;
    }

    public Double getUnitPriceSortie() {
        return unitPriceSortie;
    }

    public void setUnitPriceSortie(Double unitPriceSortie) {
        this.unitPriceSortie = unitPriceSortie;
    }

    public List<Detail_sortie> getSorties_fille() {
        return sorties_fille;
    }

    public void setSorties_fille(List<Detail_sortie> sorties_fille) {
        this.sorties_fille = sorties_fille;
    }

    public Product getProductSortie() {
        return productSortie;
    }

    public void setProductSortie(Product productSortie) {
        this.productSortie = productSortie;
    }
    
    public void setProductSortie() throws Exception{
        if(this.getIdProduct() == null) throw new Exception("Error on setting the product. The id is null");
    }

    public Warehouse getWarehouseSortie() {
        return warehouseSortie;
    }

    public void setWarehouseSortie(Warehouse warehouseSortie) {
        this.warehouseSortie = warehouseSortie;
    }
    
    
    
}
