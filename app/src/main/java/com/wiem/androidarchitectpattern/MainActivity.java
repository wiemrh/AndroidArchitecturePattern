package com.wiem.androidarchitectpattern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.wiem.androidarchitectpattern.databinding.ActivityMainBinding;

// implements View.OnClickListener , MovieView
public class MainActivity extends AppCompatActivity {
//for butterknife
  /*  @BindView(R.id.textView) TextView movieNameTV ;
    @BindView(R.id.buttongetmovie) Button getMovieBt; */
    //MoviePresenter presenter ; //presenter for MVP
    MovieViewModel movieviewModel ;
    ActivityMainBinding binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //our binding redefine this
      //  setContentView(R.layout.activity_main);
       // ButterKnife.bind(this);

        //getMovieBt.setOnClickListener(this);

       binding = DataBindingUtil.setContentView(this , R.layout.activity_main );
      /*  binding.buttongetmovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movieviewModel.getMoviebyName();
            }
        });*/
        //presenter = new MoviePresenter(this);

        //the providers store data in the viewModel
        movieviewModel = ViewModelProviders.of(this).get(MovieViewModel.class);
       //replaced in the xml File
        /* binding.buttongetmovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movieviewModel.getMoviebyName();
            }
        });*/
        //assign the variable in XML
        binding.setViewModel(movieviewModel);
        binding.setLifecycleOwner(this);
        //step 5
        //activity listen to the mutable life data
        //replace it with variable in XML file
     /*   movieviewModel.movieNameMutableLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                //step 6 if there is a change in the s the tv change
                binding.textView.setText(s);
            }

        });*/






    }

//step 1
  /*  @Override
    public void onClick(View view) {

       if(view.getId() == R.id.buttongetmovie){
         // presenter.getMoviebyName(); //for MVP
           //Step 2
           movieviewModel.getMoviebyName();
       }
    }*/
/*
//For MVP
    @Override
    public void onGetMovieName(String name) {
        movieNameTV.setText(name);
    }

 */
}
