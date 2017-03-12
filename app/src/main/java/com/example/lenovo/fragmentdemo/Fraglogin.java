package com.example.lenovo.fragmentdemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Fraglogin extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        container = (ViewGroup) inflater.inflate(R.layout.activity_fraglogin, container, false);
        final EditText uname=(EditText)container.findViewById(R.id.uname);
        final EditText pwd=(EditText)container.findViewById(R.id.password);
        Button signin=(Button)container.findViewById(R.id.signin);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String s1=uname.getText().toString();
//                String s2=pwd.getText().toString();
//                if(s1.equals("Trupti")&& s2.equals("123"))
//                {
//                    Toast.makeText(getContext(),"wellcome user",Toast.LENGTH_SHORT).show();
//                }
//                else
//                {
                    Intent i= new Intent("android.intent.action.VIEW");
//                    i.setData(Uri.parse("http://www.google.co.in/"));
                    i.setData(Uri.parse("http://www.github.com/"));
                    startActivity(i);
                Toast.makeText(getContext(),"wellcome user",Toast.LENGTH_SHORT).show();
                   // Toast.makeText(getContext(),"enter username and password",Toast.LENGTH_SHORT).show();
                //}



            }
        });

        return container;
    }
}


