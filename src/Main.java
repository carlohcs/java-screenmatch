// When creating a package, the standard is to create with `reverse domain` (eg.: screenmatch.com.br ->  br.com.screenmatch)
import br.com.screenmatch.helpers.TitleCalculator;
import br.com.screenmatch.models.Episode;
import br.com.screenmatch.models.Movie;
import br.com.screenmatch.models.Serie;

// When we are on the same package, you can directly access the properties from
// a class. But when you create a package for specific file, you need to define the access level for that property
public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();

//        movie.name = "Green Mile";
//        movie.releaseYear = 1999;
        movie.setName("Green Mile");
        movie.setReleaseYear(1999);
        movie.setDuration(60);

        // System.out.println(movie); // br.com.screenmatch.model.Movie@67b64c45 -> this is an address on the memory

        movie.displayTechnicalSheet();

        movie.setRate(8);
        movie.setRate(5);
        movie.setRate(10);

        // System.out.println("Total sum of rating: " + movie.sumRatings);
        // System.out.println("Total sum of rating: " + movie.getSumRatings());
        System.out.println("Total sum of rating: " + movie.getSumRatings());
        System.out.println("Total reviews: " + movie.getTotalReviews());
        System.out.println("Media: " + movie.getMedia());

        // https://docs.oracle.com/en/java/javase/19/docs/api/index.html

        System.out.println("\n\n");

        Serie serie = new Serie();
        serie.setName("The Office");
        serie.setReleaseYear(2005);
        serie.setSeasons(9);
        serie.setDuration(100);

        serie.displayTechnicalSheet();

        TitleCalculator titleCalculator = new TitleCalculator();
        titleCalculator.add(serie);

        System.out.println("Total duration: " + titleCalculator.getTotal());

        Episode episode = new Episode();
        episode.setName("Prison Mike");
        episode.setReleaseYear(2006);
        episode.setSerie(serie);

        System.out.println("\n");

        episode.displayTechnicalSheet();
    }
}
