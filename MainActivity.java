package com.example.tugasbesar1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnhitung;
    EditText edcelcius;
    TextView tvhasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnhitung=findViewById(R.id.btn_hitung);
        edcelcius=findViewById(R.id.ed_celcius);
        tvhasil=findViewById(R.id.tv_hasil);

        btnhitung.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String Inputcelcius=edcelcius.getText().toString().trim();

        Double hasil=(Double.parseDouble(Inputcelcius)*9/5)+32;
        tvhasil.setText(String.valueOf(hasil));

    }
}
