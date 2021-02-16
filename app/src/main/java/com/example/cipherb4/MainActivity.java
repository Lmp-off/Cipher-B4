package com.example.cipherb4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bConvert;
    TextView tvOut;
    EditText tvIN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        bConvert =findViewById(R.id.button);
        tvOut =findViewById(R.id.textViewOut);
        tvIN =findViewById(R.id.editTextTextPersonName2);

        bConvert.setOnClickListener(view->{
            tvOut.setText(CipherFactory.CEZAR.CipheringText(tvIN.getText().toString()));
        });

    }
}