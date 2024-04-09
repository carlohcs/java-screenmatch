package br.com.screenmatch.helpers;

import br.com.screenmatch.models.Title;

public class TitleCalculator {
    private int total;

    // You can have multiple params
    // for the same function
//    public void add(Movie movie) {
//        // code here
//    }

//    public void add(Serie serie) {
//        // code here
//    }

    public void add(Title title) {
        this.total += title.getDuration();
    }

    public int getTotal() {
        return total;
    }
}
