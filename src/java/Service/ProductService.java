/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import bd.Conexion;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import object.Product;
import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jocpa
 */
@WebService(serviceName = "ProductService")
public class ProductService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "getAllProduct")
    public ArrayList<Product> getAllProduct() {
        try {
            Connection conexion = Conexion.getConnection();
            String query="Select * from product";
            PreparedStatement bus = conexion.prepareStatement(query);
            ResultSet rs = bus.executeQuery();
            ArrayList<Product> productList = new ArrayList<>();
            
            while(rs.next()){
                Product product = new Product();
                product.setId(rs.getString("ID"));
                product.setName(rs.getString("NAME"));
                product.setValue(rs.getString("VALUE"));
                product.setMark(rs.getString("MARK"));
                product.setIsAvailable(rs.getString("IS_AVAILABLE"));
                product.setIsOfert(rs.getString("IS_OFERT"));
                product.setModel(rs.getString("MODEL"));
                product.setCategory(rs.getString("CATEGORY"));
                product.setDescription(rs.getString("DESCRIPTION"));
                productList.add(product);  
            }
            return productList; 
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error al obtener los productos" + e);
        }
        return null;
    }
}
