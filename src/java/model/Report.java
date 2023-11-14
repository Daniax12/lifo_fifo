/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import annoted.ColumnField;
import annoted.TableAnnotation;
import java.sql.Date;
import java.sql.Connection;

/**
 *
 * @author aram
 */
@TableAnnotation(nameTable = "report")
public class Report {
    @ColumnField(column = "idReport", primary_key = true)
    private String idReport;
    
    @ColumnField(column = "dateReport")
    private java.sql.Date dateReport;
     
    @ColumnField(column = "idProduit")
    private String idProduct;
      
    @ColumnField(column = "qtyReport")
    private Double qtyReport;
       
    @ColumnField(column = "pumpReport")
    private Double pumpReport;
        
    @ColumnField(column = "montantReport")
    private Double montantReport;
         
    @ColumnField(column = "idMagasin")
    private String idWarehouse;
    
    // METHODS
    
    

    
    
    
    /*
    Make the report from a date and its lastReport
    */
    public Report makeReport(java.sql.Date dateReport, Connection connection, Report lastReport) throws Exception{
        return null;
    }
    
    
    /*
    Get the last report of a certain product
    */
    public Report getLastReport(java.sql.Date dateReport, Connection connection) throws Exception{
        return null;
    }
    
    /*
    Get the report of product in a specific date
    */
    public Report getReportAtDate(java.sql.Date dateReport, Connection connection) throws Exception{
        // If null
        // get last report
        // makeReport -> Insert in database as report at this date
        return null;
    }
    
    // CONSTRUCTORS
    public Report(){}
    
    public Report(String idProduct, String idWarehouse){
    
    }
    
    
    // GETTERE AND SETTERS

    public String getIdReport() {
        return idReport;
    }

    public void setIdReport(String idReport) {
        this.idReport = idReport;
    }

    public Date getDateReport() {
        return dateReport;
    }

    public void setDateReport(Date dateReport) {
        this.dateReport = dateReport;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public Double getQtyReport() {
        return qtyReport;
    }

    public void setQtyReport(Double qtyReport) {
        this.qtyReport = qtyReport;
    }

    public Double getPumpReport() {
        return pumpReport;
    }

    public void setPumpReport(Double pumpReport) {
        this.pumpReport = pumpReport;
    }

    public Double getMontantReport() {
        return montantReport;
    }

    public void setMontantReport(Double montantReport) {
        this.montantReport = montantReport;
    }

    public String getIdWarehouse() {
        return idWarehouse;
    }

    public void setIdWarehouse(String idWarehouse) {
        this.idWarehouse = idWarehouse;
    }
    
    
    
}
