package br.com.screenmatch.models;

import br.com.screenmatch.interfaces.Classification;

public class Episode extends Title implements Classification {
    private int number;
    private String name;
    private Serie serie;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @java.lang.Override
    public int getClassification() {
        if (this.getTotalReviews() > 100) {
            return 4;
        }

        return 2;
    }
}
