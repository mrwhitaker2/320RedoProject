/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdrental;

import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author willk
 */
@Named(value = "customerController")
@SessionScoped
public class CustomerController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/login.jsp";
    private static String LIST_CUSTOMER = "/Browse.jsp";
    private CustomerDao dao;
    /**
     * Creates a new instance of FilmController
     */
    int startId;
    int endId;
    DataModel filmTitles;
    FilmHelper helper;

    public CustomerController() {
        super();
        dao = new CustomerDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String forward = "";

        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")) {
            String username = request.getParameter("userName");
            dao.deleteCustomer(username);
            forward = INSERT_OR_EDIT;
            request.setAttribute("customer", dao.getAllCustomers());
        } else if (action.equalsIgnoreCase("edit")) {
            forward = INSERT_OR_EDIT;
            String username = request.getParameter("username");
            Customer cust = dao.getCustomerByUsername(username);
            request.setAttribute("product", cust);
        } else if (action.equalsIgnoreCase("listCustomer")) {
            forward = LIST_CUSTOMER;
            request.setAttribute("products", dao.getAllCustomers());
        } else {
            forward = INSERT_OR_EDIT;
        }
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Customer customer = new Customer();
        customer.setUsername(request.getParameter("username"));
        customer.setPassword(request.getParameter("password"));
        customer.setCustomerPref(request.getParameter("moviePref"));
        //customer.setPayment(request.getParameter("quantity"));
        customer.setEmail(request.getParameter("email"));

        String orderNumber = request.getParameter("orderNumber");

        RequestDispatcher view = request.getRequestDispatcher(LIST_CUSTOMER);
        request.setAttribute("products", dao.getAllCustomers());
        view.forward(request, response);
    }

}
