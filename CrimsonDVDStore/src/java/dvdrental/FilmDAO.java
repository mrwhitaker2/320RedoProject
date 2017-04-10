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

    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<Customer>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM CUSTOMERNOBS");
            while (rs.next()) {
                Customer cust = new Customer();
                cust.setUsername(rs.getString("Username"));
                cust.setPassword(rs.getString("Password"));
                cust.setCustomerPref(rs.getString("Customer_Pref"));
                cust.setPayment(rs.getString("Payment"));
                cust.setEmail(rs.getString("Email"));
                customers.add(cust);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return customers;
    }

    public void addCustomer(Customer cust) {
        List<Customer> customers = getAllCustomers();
        for (int i = 0; i < customers.size(); i++) {
            if (cust.getUsername() == customers.get(i).getUsername()) {
                //We need to do something here to return back to the webpage an error that the username is taken
            }
        }

        try {
            PreparedStatement st = connection.prepareStatement("INSERT INTO CUSTOMERNOBS(Username, Password,customer_Pref, Payment, Email) VALUES(?,?,?,?,?)");

            st.setString(1, cust.getUsername());
            st.setString(2, cust.getPassword());
            st.setString(3, cust.getCustomerPref());
            st.setString(4, cust.getPayment());
            st.setString(5, cust.getEmail());
            st.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteCustomer(String username) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from customernobs where username = " + username);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public Customer getCustomerByUsername(String username) {
        Customer cust = new Customer();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("SELECT * FROM CUSTOMERNOBS WHERE USERNAME = ?");
            preparedStatement.setString(1, username);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                cust.setUsername(rs.getString("USERNAME"));
                cust.setPassword(rs.getString("PASSWORD"));
                cust.setCustomerPref(rs.getString("CUSTOMER_PREF"));
                cust.setPayment(rs.getString("PAYMENT"));
                cust.setEmail(rs.getString("EMAIL"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cust;
    }

    public static boolean validate(Customer bean) {
        boolean status = false;
        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                    "select * from CUSTOMERNOBS where username=? and password=?");

            ps.setString(1, bean.getUsername());
            ps.setString(2, bean.getPassword());

            ResultSet rs = ps.executeQuery();
            status = rs.next();

        } catch (Exception e) {
        }

        return status;

    }
    /*
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
    }*/
}
