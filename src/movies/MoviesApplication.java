package movies;


import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {

        Movie[] movies = MoviesArray.findAll();
        // This call prints the movies in the horror category
        printMovies(movies, "horror");
        printMovies(movies, "drama");
        // This call prints all of the movies
        printMovies(movies, "");

    }


    public static void printMovies(Movie[] movies, String category){
        for (Movie movie: movies){
            if(category.equalsIgnoreCase(movie.getCategory())) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }
}
