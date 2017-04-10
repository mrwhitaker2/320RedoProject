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
@Named(value = "filmController")
@SessionScoped
public class FilmController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/login.jsp";
    private static String LIST_FILM = "/Browse.jsp";
    private FilmDAO dao;
    /**
     * Creates a new instance of FilmController
     */
    int startId;
    int endId;
    DataModel filmTitles;
    FilmHelper helper;
    private int recordCount = 1000;
    private int pageSize = 10;

    private Film current;
    private int selectedItemIndex;

    public FilmController() {
        super();
        dao = new FilmDAO();
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
            request.setAttribute("customer", cust);
        } else if (action.equalsIgnoreCase("listCustomer")) {
            forward = LIST_FILM;
            request.setAttribute("customers", dao.getAllCustomers());
        } else {
            forward = INSERT_OR_EDIT;
        }

        //fowards it to the specific page
        RequestDispatcher view = request.getRequestDispatcher(forward);

        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Customer cust = new Customer();
        cust.setUsername(request.getParameter("customerId"));
        cust.setPassword(request.getParameter("productId"));
        cust.setCustomerPref(request.getParameter("quality"));
        cust.setPayment(request.getParameter("payment"));
        cust.setEmail(request.getParameter("shippingCost"));

        RequestDispatcher view = request.getRequestDispatcher(LIST_FILM);
        request.setAttribute("customers", dao.getAllCustomers());
        view.forward(request, response);
    }
}
