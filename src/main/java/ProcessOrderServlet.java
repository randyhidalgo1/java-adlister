import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name ="processOrderServlet", urlPatterns= "/pizzaOrder")
public class ProcessOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/pizzaOrder.jsp").forward(request, response);
        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce");
        String size = request.getParameter("size");
        String[] toppings = request.getParameterValues("topping");
        String address = request.getParameter("address");

        System.out.println("Crust: " + crust);
        System.out.println("Sauce: " + sauce);
        System.out.println("Size: " + size);
        System.out.print("Toppings: ");
        for (String topping : toppings) {
            System.out.print(topping + " ");
        }
        System.out.println();
        System.out.println("Delivery Address: " + address);
    }
}
