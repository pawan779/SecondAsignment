package com.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.pawan.secondasignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Palindrome extends Fragment implements View.OnClickListener {

private Button btnPalindrome;
private EditText etPalindrome;
private TextView tvPalindrome;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_palindrome,container,false);
        etPalindrome=view.findViewById(R.id.etPalindrome);
        btnPalindrome=view.findViewById(R.id.btnPalindrome);
        tvPalindrome=view.findViewById(R.id.tvPalindrome);
        btnPalindrome.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int reversedInteger = 0, remainder, originalInteger;

        int num=Integer.parseInt(etPalindrome.getText().toString());
        originalInteger = num;

        // reversed integer is stored in variable
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            tvPalindrome.setText(originalInteger+ " is a palindrome");
        else
           tvPalindrome.setText(originalInteger + " is not a palindrome.");



    }
}
