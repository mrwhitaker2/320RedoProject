/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdrental;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mrwhi
 */
public class FilmDAO {

    private Connection connection;

    public FilmDAO() {
        connection = DBConnection.getConnection();
    }
    
    
    
    public List<Film> getProductsByCategory(String )
    {
        List<Product> products = new ArrayList<Product>();
        Product product = new Product();
       try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from product where order_num=?");
            preparedStatement.setInt(1, Integer.parseInt(order_num));
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                product.setProduct_id(rs.getInt("product_id"));
                product.setCustomer_id(rs.getInt("customer_id"));
                product.setOrder_num(rs.getInt("order_num"));
                product.setQuantity(rs.getInt("quantity"));
                product.setShipping_cost(rs.getInt("shipping_cost"));
                product.setSales_date(rs.getDate("sales_date"));
                product.setShipping_date(rs.getDate("shipping_date"));
            }
            
            products.add(product);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }
}
