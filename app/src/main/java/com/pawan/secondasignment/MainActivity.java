package com.pawan.secondasignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fragment.Area;
import com.fragment.Palindrome;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

private Button btnArea,btnPalindrome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnArea=findViewById(R.id.btnArea);
        btnPalindrome=findViewById(R.id.btnPalindrome);


        btnArea.setOnClickListener(this);
        btnPalindrome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        switch (v.getId()){
            case R.id.btnArea:
                Area area=new Area();
                fragmentTransaction.replace(R.id.fragmentContainer,area);
                fragmentTransaction.commit();
                break;

            case R.id.btnPalindrome:
                Palindrome palindrome=new Palindrome();
                fragmentTransaction.replace(R.id.fragmentContainer,palindrome);
                fragmentTransaction.commit();
                break;

        }

    }
}
