package com.example.mvvm;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

		ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
		//绑定 ViewModel
		binding.setViewModel(new ViewModel(binding));
    }
}
