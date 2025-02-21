public class Main {
    public static void main(String[] args) {
        Films films = new Films();
        films.addFilm(new Film("Inception", "Christopher Nolan", 160000000, 2010, 1));
        films.addFilm(new Film("Titanic", "James Cameron", 200000000, 1997, 2));
        films.addFilm(new Film("Avatar", "James Cameron", 237000000, 2009, 3));
        films.addFilm(new Film("The Dark Knight", "Christopher Nolan", 185000000, 2008, 4));
        films.addFilm(new Film("Interstellar", "Christopher Nolan", 165000000, 2014, 5));
        
        System.out.println("All films:");
        films.printFilmsByProducer("");
        
        System.out.println("\nFilms by Christopher Nolan:");
        films.printFilmsByProducer("Christopher Nolan");
        
        System.out.println("\nHighest budget film:");
        films.printHighestBudgetFilm();
        
        System.out.println("\nAverage budget for all films: " + films.getAverageBudget(""));
        System.out.println("Average budget for James Cameron films: " + films.getAverageBudget("James Cameron"));
    }
}
