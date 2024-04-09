package br.com.screenmatch.models;

import br.com.screenmatch.interfaces.Classification;

public class Title implements Classification {

    public String name;
    public int releaseYear;
    boolean includedOnPlan;
    double rating;
    public int totalReviews;
    private double sumRatings;
    int duration;

    // A simple function it should use 'void'
    public void displayTechnicalSheet() {
        System.out.println("Title name: " + name);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Classification: " + this.getClassification());
    }

    public void setRate(double rate) {
        this.sumRatings += rate;
        this.totalReviews++;
    }

    public double getMedia() {
        return sumRatings / totalReviews;
    }

    public double getSumRatings() {
        return sumRatings;
    }

    public int getTotalReviews() {
        return totalReviews;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @java.lang.Override
    public int getClassification() {
        return (int) this.getMedia() / 2;
    }
}
