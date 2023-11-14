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
@TableAnnotation(nameTable = "detail_sortie")
public class Detail_sortie {
    @ColumnField(column = "idSortie")
    private String idSortie;
    
    @ColumnField(column = "idEntree")
    private String idEntree;
     
    @ColumnField(column = "quantityDetail")
    private Double quantityDetail;
      
    @ColumnField(column = "unitPriceDetail")
    private Double unitPriceDetail;
       
    @ColumnField(column = "montantDetail")
    private Double montantDetail;
    
    // CONSTRUCTORS
    public Detail_sortie(){};

    public Detail_sortie(String idSortie, String idEntree, Double quantityDetail, Double unitPriceDetail) throws Exception{
        try {
            this.setIdSortie(idSortie);
            this.setIdEntree(idEntree);
            this.setQuantityDetail(quantityDetail);
            this.setUnitPriceDetail(unitPriceDetail);
            this.setMontantDetail(quantityDetail * unitPriceDetail);
        } catch (Exception e) {
            throw new Exception("Error on constructing the detail sortie with " + e.getMessage());
        }
        
    }
    
    // GETTERS AND SETTERS
    public String getIdSortie() {
        return idSortie;
    }

    public void setIdSortie(String idSortie) {
        this.idSortie = idSortie;
    }

    public String getIdEntree() {
        return idEntree;
    }

    public void setIdEntree(String idEntree) {
        this.idEntree = idEntree;
    }

    public Double getQuantityDetail() {
        return quantityDetail;
    }

    public void setQuantityDetail(Double quantityDetail) throws Exception{
        if(quantityDetail < 0) throw new Exception("Error on setting the qty of detail sortie. Negative value");
        this.quantityDetail = quantityDetail;
    }

    public Double getUnitPriceDetail() {
        return unitPriceDetail;
    }

    public void setUnitPriceDetail(Double unitPriceDetail) {
        this.unitPriceDetail = unitPriceDetail;
    }

    public Double getMontantDetail() {
        return montantDetail;
    }

    public void setMontantDetail(Double montantDetail) {
        this.montantDetail = montantDetail;
    }
    
    
    
    
}
