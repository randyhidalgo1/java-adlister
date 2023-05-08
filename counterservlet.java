public class counterservlet {
    @WebServlet ("/count")
public class CounterServlet extends HttpServlet {
        Public static int count = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("reset") != null) {
            count = 0;
        }
        resp.setContentType("text/html");
        resp.getWriter().println("<p>" + ++count + "</p>");
    }
}
