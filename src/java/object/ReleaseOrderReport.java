/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author jocpa
 */
public class ReleaseOrderReport {
    
    private String idReleaseOrder;
    private String idInvoice; 
    private String fullNameCustomer;
    private String nameProduct; 
    private String stateReleaseOrder;

    public String getIdReleaseOrder() {
        return idReleaseOrder;
    }

    public void setIdReleaseOrder(String idReleaseOrder) {
        this.idReleaseOrder = idReleaseOrder;
    }

    public String getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(String idInvoice) {
        this.idInvoice = idInvoice;
    }

    public String getFullNameCustomer() {
        return fullNameCustomer;
    }

    public void setFullNameCustomer(String fullNameCustomer) {
        this.fullNameCustomer = fullNameCustomer;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getStateReleaseOrder() {
        return stateReleaseOrder;
    }

    public void setStateReleaseOrder(String stateReleaseOrder) {
        this.stateReleaseOrder = stateReleaseOrder;
    }

    public ReleaseOrderReport() {
    }

    public ReleaseOrderReport(String idReleaseOrder, String idInvoice, String fullNameCustomer, String nameProduct, String stateReleaseOrder) {
        this.idReleaseOrder = idReleaseOrder;
        this.idInvoice = idInvoice;
        this.fullNameCustomer = fullNameCustomer;
        this.nameProduct = nameProduct;
        this.stateReleaseOrder = stateReleaseOrder;
    }

    @Override
    public String toString() {
        return "ReleaseOrderReport{" + "idReleaseOrder=" + idReleaseOrder + ", idInvoice=" + idInvoice + ", fullNameCustomer=" + fullNameCustomer + ", nameProduct=" + nameProduct + ", stateReleaseOrder=" + stateReleaseOrder + '}';
    }
    
    
}
