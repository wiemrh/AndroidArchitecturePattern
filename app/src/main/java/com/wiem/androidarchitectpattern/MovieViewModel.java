package com.wiem.androidarchitectpattern;

import com.wiem.androidarchitectpattern.pojo.MovieModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
//get movie name from database and say that he get it
public class MovieViewModel extends ViewModel {
    public MutableLiveData<String> movieNameMutableLiveData = new MutableLiveData<>();

    //step 3 get movie name from DB
public void getMoviebyName(){
    String name = getMovieName().getName();
    //step4
    movieNameMutableLiveData.setValue(name);
}
    private MovieModel getMovieName (){

        return new MovieModel("Her","12-02-2019","Great movie",1);
    }

}
