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
public class Automorphic extends Fragment implements View.OnClickListener {

private Button btnAuto;
private EditText etAuto;
private TextView tvAuto;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_automorphic,container,false);
        etAuto=view.findViewById(R.id.etAutomorphic);
        tvAuto=view.findViewById(R.id.tvAutomorphic);
        btnAuto=view.findViewById(R.id.btnAutomorphic);

        btnAuto.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {

        if(TextUtils.isEmpty(etAuto.getText()))
        {
            etAuto.setError("Enter any number");
            return;
        }
        int num=Integer.parseInt(etAuto.getText().toString());



        int d=1; int i;
        for(i=num;i>0;i=i/10)
        {
            d=d*10;
        }
        if((num*num)%d==num)
        {
            tvAuto.setText(num+"\t"+"is Automorphic Number");
        }
        else
        {
            tvAuto.setText(num+"\t"+"is not Automorphic Number");
        }
    }


}
