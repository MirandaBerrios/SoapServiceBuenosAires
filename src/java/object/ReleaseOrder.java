
package object;

/**
 *
 * @author mirandaBerrios
 */
public class ReleaseOrder {
    
        private String id; 
	private String idCustomer; 
	private String idState; 
	private String idProducto; 
	private String idSell; 
	private String idInvoice; 

    public ReleaseOrder() {
      }

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

    public String getIdState() {
        return idState;
    }

    public void setIdState(String idState) {
        this.idState = idState;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getIdSell() {
        return idSell;
    }

    public void setIdSell(String idSell) {
        this.idSell = idSell;
    }

    public String getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(String idInvoice) {
        this.idInvoice = idInvoice;
    }

    public ReleaseOrder(String id, String idCustomer, String idState, String idProducto, String idSell, String idInvoice) {
        this.id = id;
        this.idCustomer = idCustomer;
        this.idState = idState;
        this.idProducto = idProducto;
        this.idSell = idSell;
        this.idInvoice = idInvoice;
    }

    @Override
    public String toString() {
        return "ReleaseOrder{" + "id=" + id + ", idCustomer=" + idCustomer + ", idState=" + idState + ", idProducto=" + idProducto + ", idSell=" + idSell + ", idInvoice=" + idInvoice + '}';
    }
        
        
}
