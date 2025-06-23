package servlet;

import dao.MovieDAO;
import model.Movie;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class MovieServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MovieDAO movieDAO=new MovieDAO();
        List<Movie> movies = movieDAO.getAllMovies();

        request.setAttribute("movieList",movies);
        RequestDispatcher dispatcher=request.getRequestDispatcher("/pages/movies.jsp");
        dispatcher.forward(request,response);
    }
}
