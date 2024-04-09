package br.com.screenmatch.models;

public class Movie extends Title {
    private String director;

    public java.lang.String getDirector() {
        return director;
    }

    public void setDirector(java.lang.String director) {
        this.director = director;
    }

    public void displayTechnicalSheet() {
        System.out.println("Movie name: " + name);
        System.out.println("Release Year: " + releaseYear);
    }
}
