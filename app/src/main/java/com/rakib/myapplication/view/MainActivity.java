package com.rakib.myapplication.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import com.rakib.myapplication.R;
import com.rakib.myapplication.viewModel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainActivityViewModel model = new ViewModelProvider(this).get(MainActivityViewModel.class);

    }

}