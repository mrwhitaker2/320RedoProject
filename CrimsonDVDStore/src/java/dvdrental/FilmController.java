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
            request.setAttribute("product", cust);
        } else if (action.equalsIgnoreCase("listCustomer")) {
            forward = LIST_FILM;
            request.setAttribute("products", dao.getAllCustomers());
        } else {
            forward = INSERT_OR_EDIT;
        }

        //fowards it to the specific page
        RequestDispatcher view = request.getRequestDispatcher(forward);

        view.forward(request, response);
    }

    public FilmController(int startId, int endId) {
        helper = new FilmHelper();
        this.startId = startId;
        this.endId = endId;
    }

    public Film getSelected() {
        if (current == null) {
            current = new Film();
            selectedItemIndex = -1;
        }
        return current;
    }

    public DataModel getFilmTitles() {
        if (filmTitles == null) {
            filmTitles = new ListDataModel(helper.getFilmTitles(startId, endId));
        }
        return filmTitles;
    }

    void recreateModel() {
        filmTitles = null;
    }

    public boolean isHasNextPage() {
        if (endId + pageSize <= recordCount) {
            return true;
        }
        return false;
    }

    public boolean isHasPreviousPage() {
        if (startId - pageSize > 0) {
            return true;
        }
        return false;
    }

    public String next() {
        startId = endId + 1;
        endId = endId + pageSize;
        recreateModel();
        return "index";
    }

    public String previous() {
        startId = startId - pageSize;
        endId = endId - pageSize;
        recreateModel();
        return "index";
    }

    public int getPageSize() {
        return pageSize;
    }

    public String prepareView() {
        current = (Film) getFilmTitles().getRowData();
        return "browse";
    }

    public String prepareList() {
        recreateModel();
        return "index";
    }

    /*
    public String getLanguage()
    {
        int langID = current.getLanguageByLanguageId().getLanguageId().intValue();
        String language = helper.getLangByID(langID);
        return language;
    }

    public String getActors()
    {
        List actors = helper.getActorsByID(current.getFilmId());
        StringBuffer totalCast = new StringBuffer();
        for (int i = 0; i < actors.size(); i++)
        {
            Actor actor = (Actor) actors.get(i);
            totalCast.append(actor.getFirstName());
            totalCast.append(" ");
            totalCast.append(actor.getLastName());
            totalCast.append("  ");
        }
        return totalCast.toString();
    }

    public String getCategory()
    {
        Category category = helper.getCategoryByID(current.getFilmId());
        return category.getName();
    }
     */
}
