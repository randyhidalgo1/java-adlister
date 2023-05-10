import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(httpServletRequest
    req, httpServletResponse resp) throws
            ServletException, IOException {
    String searchTerm = req.getParameter
    ("search");
    resp.setContentType("text/html");
    resp.getWriter().println("<h2>Search results for: " + searchTerm + "</h2>");
    }
}
