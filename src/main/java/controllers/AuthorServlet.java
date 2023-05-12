package controllers;

public class AuthorServlet {
    public class AuthorServlet {
        private void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.setAttribute("authors", DaoFactory.getAuthorsDao().all());
            request.getRequestDispatcher("/authors/index.jsp").forward(request, response);
        }
    }
}
