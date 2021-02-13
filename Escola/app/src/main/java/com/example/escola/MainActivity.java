package com.example.escola;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtN1, edtN2;
    TextView txtM, txtSit;
    ImageView imgSit;
    LinearLayout layResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtN1 = (EditText) findViewById(R.id.editN1);
        edtN2 = (EditText) findViewById(R.id.editN2);
        txtM = (TextView) findViewById(R.id.txtM);
        txtSit = (TextView) findViewById(R.id.txtSit);
        imgSit = findViewById(R.id.imgSit);
    }

    public void calcular(View view) {
        boolean ok = true;
        if (edtN1.getText().toString().trim().isEmpty()) {
            ok = false;
            edtN1.setError(getString(R.string.msgErro));
        }
        if (edtN2.getText().toString().trim().isEmpty()) {
            ok = false;
            edtN2.setError(getString(R.string.msgErro));
        }

        if (ok) {
            float n1 = Float.parseFloat(edtN1.getText().toString());
            float n2 = Float.parseFloat(edtN2.getText().toString());
            float media = (n1 + n2) / 2;
            txtM.setText(String.format("%.1f", media));
            if (media < 5) {
                txtSit.setText(getString(R.string.strSitRp));
                txtSit.setTextColor(Color.parseColor("#7e1010"));
                // Outra forma → txtSit.setTextColor(Color,getResources().getColor(R.color.cor));
                Toast.makeText(getApplicationContext(), getString(R.string.msgRp), Toast.LENGTH_SHORT).show();
                imgSit.setImageResource(R.drawable.emojireprovado);
            } else if (media < 7) {
                txtSit.setText(getString(R.string.strSitRc));
                txtSit.setTextColor(Color.parseColor("#21219c"));
                Toast.makeText(getApplicationContext(), getString(R.string.msgRc), Toast.LENGTH_SHORT).show();
                imgSit.setImageResource(R.drawable.emojirecuperacao);
            } else {
                txtSit.setText(getString(R.string.strSitAp));
                txtSit.setTextColor(Color.parseColor("#0e801b"));
                Toast.makeText(getApplicationContext(), getString(R.string.msgAp), Toast.LENGTH_SHORT).show();
                imgSit.setImageResource(R.drawable.emojiaprovado);
            }
        }
    }
}