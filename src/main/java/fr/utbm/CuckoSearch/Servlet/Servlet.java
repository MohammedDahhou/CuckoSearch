package fr.utbm.CuckoSearch.Servlet;

import fr.utbm.CuckoSearch.GLPK.Gmpl;
import org.gnu.glpk.GLPK;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] arg = new String[2];
        arg[0] = "/Users/mohammeddahhou/Desktop/knapsac.mod";

        try {
            GLPK.glp_java_set_numeric_locale("C");
            System.out.println("-----------Solveur-------------------");
            new Gmpl().solve(arg);
        } catch (Throwable t) {
            t.printStackTrace();
        }


        PrintWriter out = response.getWriter();
        //out.println("<html><head>");
        out.println("<title>MyServlet</title>");



        //out.println("</head><body>");
        //out.println("<h1>My First Servlet</h1>"); //. . .
        //out.println("</body></html>");


    }
}
