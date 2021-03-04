package com.example.cipherb4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
//TODO:support more languages
public class MainActivity extends AppCompatActivity {
    Button bConvert;
    TextView tvOut;
    EditText tvIN;
    Spinner spinner;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        bConvert = findViewById(R.id.button);
        tvOut = findViewById(R.id.textViewOut);
        tvIN = findViewById(R.id.editTextTextPersonName2);
        spinner = findViewById(R.id.spinner);
        checkBox = findViewById(R.id.checkBox);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.cipher,
                android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                tvIN.setHint(CipherFactory.valueOf(spinner.getSelectedItem().toString().toUpperCase()).GetHint());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                tvIN.setHint(CipherFactory.CAESAR.GetHint());
            }
        });

        bConvert.setOnClickListener(view -> {
            String changedText;
            changedText = CipherFactory.valueOf(
                    spinner.getSelectedItem().toString().toUpperCase())
                    .CipheringText(tvIN.getText().toString(), checkBox.isChecked());

            tvOut.setText(changedText);
        });
    }
}