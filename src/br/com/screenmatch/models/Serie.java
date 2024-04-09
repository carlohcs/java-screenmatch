package br.com.screenmatch.models;

public class Serie extends Title {
    private int seasons;
    private int episodesPerSeason;
    private double minutesPerEpisode;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    // Some notations
    // @Deprecated - method is deprecated
    // @Override - overwrite a method
    // @NotNull - attribute it should not be null

    // Override is not needed in this case
    @Override
    public void displayTechnicalSheet() {
//        how to call parent
//        super.displayTechnicalSheet();

        System.out.println("Serie name: " + name);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Seasons: " + seasons);
    }

    public double getDurationInMinutes() {
        return seasons * episodesPerSeason * minutesPerEpisode;
    }
}
