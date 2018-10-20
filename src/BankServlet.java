import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "BankServlet",urlPatterns = "/0986825095")
public class BankServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double amount=Double.parseDouble(request.getParameter("amount"));
        double rate=Double.parseDouble(request.getParameter("monthlyRate\""));
        int term=Integer.parseInt(request.getParameter("term"));
        double totalPayment=amount+(amount*rate/100*term);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1> The total payment is: " + totalPayment + "</h1>");
        writer.println("</html>");



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
