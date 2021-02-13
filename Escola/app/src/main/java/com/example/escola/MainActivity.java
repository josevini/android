package com.example.escola;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtN1, edtN2;
    TextView txtM, txtSit;
    LinearLayout layResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtN1 = (EditText) findViewById(R.id.editN1);
        edtN2 = (EditText) findViewById(R.id.editN2);
        txtM = (TextView) findViewById(R.id.txtM);
        txtSit = (TextView) findViewById(R.id.txtSit);
    }

    public void calcular(View view) {
        float n1 = Float.parseFloat(edtN1.getText().toString());
        float n2 = Float.parseFloat(edtN2.getText().toString());
        float media = (n1 + n2) / 2;
        txtM.setText(String.format("%.1f", media));
        if (media < 5) {
            txtSit.setText(getString(R.string.strSitRp));
        } else if (media < 7) {
            txtSit.setText(getString(R.string.strSitRc));
        } else {
            txtSit.setText(getString(R.string.strSitAp));
        }
    }
}