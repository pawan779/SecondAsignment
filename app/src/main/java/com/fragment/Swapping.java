package com.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
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
public class Swapping extends Fragment implements View.OnClickListener {
    private Button btnSwapping;
    private TextView tvSwapping;
    private EditText etFirst, etSecond;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_swapping, container, false);
        etFirst = view.findViewById(R.id.etFirst);
        etSecond = view.findViewById(R.id.etSecond);
        btnSwapping = view.findViewById(R.id.btnSwapping);
        tvSwapping = view.findViewById(R.id.tvSwapping);

        btnSwapping.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        if(TextUtils.isEmpty(etFirst.getText()))
        {
            etFirst.setError("Enter first number");
            return;
        }
        if(TextUtils.isEmpty(etSecond.getText()))
        {
            etSecond.setError("Enter second number");
            return;
        }

        int first, second;
        first = Integer.parseInt(etFirst.getText().toString());
        second = Integer.parseInt(etSecond.getText().toString());
        first = first + second;
        second = first - second;
        first = first - second;

        tvSwapping.setText("first number: " + first + "second number: " + second);
    }
}
