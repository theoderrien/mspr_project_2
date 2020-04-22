package controller;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import model.EmployeeModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


@WebServlet( name = "homeController", urlPatterns = {"/home"})
public class HomeController extends HttpServlet {

    private static final String PAGE_HOME_JSP = "/WEB-INF/home.jsp";

    public HomeController() {
        super();
    }

    private String formatDate(String date){
        String dateTab[] = date.split("-");
        return dateTab[2] + "/" + dateTab[1] + "/" + dateTab[0];
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher(PAGE_HOME_JSP).forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
        // Connect to the URL using java's native library
        URL url = new URL("https://apex.oracle.com/pls/apex/myspacepc/hr/employees/");
        HttpURLConnection requete = (HttpURLConnection) url.openConnection();
        requete.connect();

        // Convert to a JSON object to print data
        JsonParser jp = new JsonParser(); //from gson
        JsonElement root = jp.parse(new InputStreamReader((InputStream) requete.getContent())); //Convert the input stream to a json element
        JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object.
        String job = rootobj.get("job").getAsString(); //just grab the job
        System.out.println("job : " + job);*/


        String date = request.getParameter("date");
        String nbTournees = request.getParameter("nbTournees");
        String nomEntreprise = request.getParameter("nomEntreprise");

        request.setAttribute("date", date);
        request.setAttribute("nbTournees", nbTournees);
        request.setAttribute("nomEntreprise", nomEntreprise);

        this.getServletContext().getRequestDispatcher(PAGE_HOME_JSP).forward(request, response);
    }

}
