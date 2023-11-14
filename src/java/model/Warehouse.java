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
@TableAnnotation(nameTable = "magasin")
public class Warehouse {
    @ColumnField(column = "idMagasin", primary_key = true)
    private String idWarehouse;
    
    @ColumnField(column = "nameMagasin")
    private String nameWarehouse;
    
    @ColumnField(column = "adress")
    private String adress;
    
    // Getters and setters

    public String getIdWarehouse() {
        return idWarehouse;
    }

    public void setIdWarehouse(String idWarehouse) {
        this.idWarehouse = idWarehouse;
    }

    public String getNameWarehouse() {
        return nameWarehouse;
    }

    public void setNameWarehouse(String nameWarehouse) {
        this.nameWarehouse = nameWarehouse;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    
}
