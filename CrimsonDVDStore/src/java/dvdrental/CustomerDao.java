/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdrental;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author willk
 */
public class CustomerDao
{

    private Connection connection;

    public CustomerDao()
    {
        connection = DbConnectionUtil.getConnection();
    }

    public void addCustomer(Customer customer)
    {
        try
        {
            PreparedStatement st = connection.prepareStatement("INSERT INTO customernobs (Username,password,Customer_Pref,Payment,Email) VALUES(?,?,?,?,?)");

            st.setString(1, customer.getUsername());
            st.setString(2, customer.getPassword());
            st.setString(3, customer.getCustomerPref());
            st.setString(4, customer.getPayment());
            st.setString(5, customer.getEmail());
            
            st.executeUpdate();

        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void deleteCustomer(String username)
    {
        try
        {
            PreparedStatement st = connection.prepareStatement("DELETE FROM customernobs WHERE Customer_Id= ?");
            st.setString(1,username);
            st.executeUpdate();
        } catch (SQLException ex)
        {
            System.out.println("SQL statement is not executed!" + ex);
        }
    }

    public void updateCustomer(Customer customer)
    {
        try
        {
            PreparedStatement st = connection.prepareStatement("update customernobs set Username=?, Password=?, Customer_Pref=?, Payment=?, Email=?" + "where Customer_Id=?");

            st.setString(1, customer.getUsername());
            st.setString(2, customer.getPassword());
            st.setString(3, customer.getCustomerPref());
            st.setString(4, customer.getPayment());
            st.setString(5, customer.getEmail());            
            st.setInt(6, customer.getCustomerId());

            st.executeUpdate();

        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public List<Customer> getAllCustomers()
    {
        List<Customer> customers = new ArrayList<Customer>();
        try
        {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from customernobs");
            while (rs.next())
            {
                Customer customer = new Customer();
                customer.setCustomerId(rs.getShort("customerId"));
                customer.setUsername(rs.getString("username"));
                customer.setPassword(rs.getString("password"));
                customer.setCustomerPref(rs.getString("customerpref"));
                customer.setPayment(rs.getString("payment"));
                customer.setEmail(rs.getString("email"));

                customers.add(customer);
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }

        return customers;
    }

    public Customer getCustomerByCustomerId(int customerId)
    {
        Customer customer = new Customer();
        try
        {
            PreparedStatement ps = connection.prepareStatement("select * from customernobs where Customer_Id=?");
            ps.setInt(1, customerId);
            ResultSet rs = ps.executeQuery();

            if (rs.next())
            {
                customer.setUsername(rs.getString("username"));
                customer.setUsername(rs.getString("password"));
                customer.setUsername(rs.getString("customerpref"));
                customer.setUsername(rs.getString("payment"));
                customer.setUsername(rs.getString("email"));
                
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }

        return customer;
    }
}
