package com.rakib.myapplication.viewModel;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.rakib.myapplication.model.User;
import com.rakib.myapplication.model.UserRepository;

public class MainActivityViewModel  extends AndroidViewModel {

    UserRepository userRepository;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        userRepository = new UserRepository(application);
    }

    public LiveData<User[]> getAllUserData(){
        return userRepository.getUserData();
    }
}
