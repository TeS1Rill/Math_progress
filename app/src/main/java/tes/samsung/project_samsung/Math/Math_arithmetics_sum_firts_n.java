package tes.samsung.project_samsung.Math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import tes.samsung.project_samsung.R;

public class Math_arithmetics_sum_firts_n extends AppCompatActivity {

    private Button button_work;
    private Button button_reset;
    private EditText a1, an, n;
    private Button button_back;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_arithmetics_sum_firts_n);

        onClickBack();
        onClickWork();
        onClickReset();
    }
    private void onClickWork(){
        button_work = (Button) findViewById(R.id.button_1_work);
        button_work.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        a1 = (EditText) findViewById(R.id.a1);
                        an = (EditText) findViewById(R.id.an);
                        n = (EditText) findViewById(R.id.n);
                        res = (TextView) findViewById(R.id.result);

                        if(an.length() == 0 || an.length() == 0 || n.length() == 0){
                            Toast.makeText(Math_arithmetics_sum_firts_n.this, "Введите значения!", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        try {
                            float a_1 = Float.parseFloat(a1.getText().toString());
                            float a_n = Float.parseFloat(an.getText().toString());
                            float n_n = Float.parseFloat(n.getText().toString());
                        }catch (Exception e){
                            Toast.makeText(Math_arithmetics_sum_firts_n.this, "Некорректное значение!", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        float a_1 = Float.parseFloat(a1.getText().toString());
                        float a_n = Float.parseFloat(an.getText().toString());
                        float n_n = Float.parseFloat(n.getText().toString());

                        float r = ((a_1 + a_n) / 2 ) * n_n;
                        res.setText(String.valueOf("Sn = " + r));
                    }
                }
        );
    }
    private void onClickReset(){
        button_reset = (Button)findViewById(R.id.button_2_reset);
        button_reset.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        a1 = (EditText) findViewById(R.id.a1);
                        an = (EditText) findViewById(R.id.an);
                        n = (EditText) findViewById(R.id.n);
                        res = (TextView) findViewById(R.id.result);
                        a1.setText(String.valueOf(""));
                        an.setText(String.valueOf(""));
                        n.setText(String.valueOf(""));
                        res.setText(String.valueOf("Sn = 0"));
                    }
                }
        );
    }
    private void onClickBack(){
        button_back = (Button)findViewById(R.id.btn_back_onMenu_math);
        button_back.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Math_arithmetics_sum_firts_n.this, Math_Arithmetics_progress.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, Math_Arithmetics_progress.class);
        startActivity(i);
        finish();
    }
}