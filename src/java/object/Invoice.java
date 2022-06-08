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
public class Invoice {
    
    private  String id; 
    private  String idCustomer;
    private  String date; 
    private  String description; 
    private  String amount; 
    private  String idSell; 
    private  String idReleaseOrder; 
    private  String idProduct; 
    private  String idService;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getIdSell() {
        return idSell;
    }

    public void setIdSell(String idSell) {
        this.idSell = idSell;
    }

    public String getIdReleaseOrder() {
        return idReleaseOrder;
    }

    public void setIdReleaseOrder(String idReleaseOrder) {
        this.idReleaseOrder = idReleaseOrder;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    @Override
    public String toString() {
        return "Invoice{" + "id=" + id + ", idCustomer=" + idCustomer + ", date=" + date + ", description=" + description + ", amount=" + amount + ", idSell=" + idSell + ", idReleaseOrder=" + idReleaseOrder + ", idProduct=" + idProduct + ", idService=" + idService + '}';
    }

    public Invoice() {
    }

    public Invoice(String id, String idCustomer, String date, String description, String amount, String idSell, String idReleaseOrder, String idProduct, String idService) {
        this.id = id;
        this.idCustomer = idCustomer;
        this.date = date;
        this.description = description;
        this.amount = amount;
        this.idSell = idSell;
        this.idReleaseOrder = idReleaseOrder;
        this.idProduct = idProduct;
        this.idService = idService;
    }
    
        
    
}
