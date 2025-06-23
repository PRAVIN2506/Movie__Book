package dao;

import model.Movie;
import java.sql.*;
import java.util.*;

public class MovieDAO {
    public List<Movie> getAllMovies(){
        List<Movie> movies =new ArrayList<>();
        String query = "SELECT * FROM movies";

        try(Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery() ){

            while (rs.next()){
                Movie movie=new Movie();
                movie.setMovieId(rs.getInt("movie_id"));
                movie.setTitle(rs.getString("title"));
                movie.setGenre(rs.getString("genre"));
                movie.setDuration(rs.getInt("duration"));
                movie.setRating(rs.getFloat("rating"));
                movies.add(movie);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return movies;
    }
}
