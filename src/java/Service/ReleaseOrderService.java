/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import object.ReleaseOrder;

/**
 *
 * @author Coke
 */
@WebService(serviceName = "ReleaseOrderService")
public class ReleaseOrderService {



    
    public ArrayList<ReleaseOrder> getAllReleasedOrder() {
        try {
            Connection conexion = Conexion.getConnection();
            String query="Select " +
                " ro.id_release_order as \"ID_RELEASE_ORDER\", " +
                " CONCAT(CONCAT(cu.name_customer, ' '), cu.lastname_customer) as \"ID_CUSTOMER\", " +
                " po.name as \"ID_PRODUCT\", " +
                " st.state as \"ID_STATE\" " +
                " from release_order ro  " +
                " join customer cu on ro.id_customer = cu.id_customer " +
                " join state_release_order st on ro.id_state = st.id_state_release_order " +
                " join product po on ro.id_product = po.id ";
            PreparedStatement bus = conexion.prepareStatement(query);
            ResultSet rs = bus.executeQuery();
            ArrayList<ReleaseOrder> releaseOrderList = new ArrayList<>();
            
            while(rs.next()){
                ReleaseOrder releaseOrder = new ReleaseOrder();
                releaseOrder.setId(rs.getString("ID_RELEASE_ORDER"));
                releaseOrder.setIdCustomer(rs.getString("ID_CUSTOMER"));
                releaseOrder.setIdState(rs.getString("ID_STATE"));
                releaseOrder.setIdProducto(rs.getString("ID_PRODUCT"));
                releaseOrderList.add(releaseOrder);  
            }
            return releaseOrderList; 
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error al obtener los productos" + e);
        }
        return null;
    }
}
