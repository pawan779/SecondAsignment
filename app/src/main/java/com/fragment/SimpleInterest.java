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
public class SimpleInterest extends Fragment implements View.OnClickListener{

private Button btnSI;
private EditText etPrincipal, etTime,etRate;
private TextView tvSI;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view=inflater.inflate(R.layout.fragment_simple_interest,container,false);
       etPrincipal=view.findViewById(R.id.etPrincipal);
       etRate=view.findViewById(R.id.etRate);
       etTime=view.findViewById(R.id.etTime);
       btnSI=view.findViewById(R.id.btnSI);
       tvSI=view.findViewById(R.id.tvSI);

       btnSI.setOnClickListener(this);
       return view;
    }

    @Override
    public void onClick(View v) {

        if(TextUtils.isEmpty(etPrincipal.getText()))
        {
            etPrincipal.setError("Enter principal");
            return;
        }
        if(TextUtils.isEmpty(etTime.getText()))
        {
            etTime.setError("Enter time");
            return;
        }
        if(TextUtils.isEmpty(etRate.getText()))
        {
            etRate.setError("Enter rate");
            return;
        }


        float p,t,r, si;
        p=Float.parseFloat(etPrincipal.getText().toString());
        t=Float.parseFloat(etTime.getText().toString());
        r=Float.parseFloat(etRate.getText().toString());

        si=(p*t*r)/100;

        tvSI.setText("Simple Interest is "+si);

    }
}
