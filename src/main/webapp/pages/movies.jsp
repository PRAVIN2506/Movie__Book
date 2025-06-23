<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page import="java.util.List" %>
<%@ page import="model.Movie" %>

<html>

<head>
    <title>Available Movies</title>
</head>

<body>
    <h2>Now Showing</h2>
    <table>
        <tr>
            <th>Title</th>
            <th>Genre</th>
            <th>Duration</th>
            <th>Rating</th>
        </tr>

        <%
            List<Movie> movies =(List<Movie) request.getAttribute("movieList");
            if(movies != null){
            for(Movie movie : movies){
            <tr>
                <td><%=movie.getTitle() %></td>
                <td><%=movie.getGenre() %></td>
                <td><%=movie.getDuration() %></td>
                <td><%=movie.getRating() %></td>
            </tr>
            <%
                }
            }
            %>
    </table>
</body>
</html>