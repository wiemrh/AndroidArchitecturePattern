package com.wiem.androidarchitectpattern;

import com.wiem.androidarchitectpattern.pojo.MovieModel;

public class MoviePresenter {
MovieView view ;

    public MoviePresenter(MovieView view) {
        this.view = view;
    }
    public MovieModel getMovieName (){
        return new MovieModel("Her","12-02-2019","Great movie",1);
    }

    public void getMoviebyName(){
        view.onGetMovieName(getMovieName().getName());
    }

}
