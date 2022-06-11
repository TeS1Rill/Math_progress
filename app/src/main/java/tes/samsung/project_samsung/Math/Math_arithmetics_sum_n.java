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

public class Math_arithmetics_sum_n extends AppCompatActivity {

    private Button button_reset;
    private Button button_work;
    private EditText a11;
    private EditText n1;
    private EditText d1;
    private TextView res;
    private Button button_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_arithmetics_sum_n);

        onClickReset();
        onClickBack();
        onClickWork();
    }
    private void onClickWork(){
        button_work = (Button)findViewById(R.id.button_1_work);
        button_work.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        a11 = (EditText) findViewById(R.id.a1);
                        n1 = (EditText) findViewById(R.id.n);
                        d1 = (EditText) findViewById(R.id.d);
                        res = (TextView) findViewById(R.id.result);

                        if(a11.length() == 0 || n1.length() == 0 || d1.length() == 0){
                            Toast.makeText(Math_arithmetics_sum_n.this, "Введите значения!", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        try {
                            float a_1 = Float.parseFloat(a11.getText().toString());
                            float n_1 = Float.parseFloat(n1.getText().toString());
                            float d_1 = Float.parseFloat(d1.getText().toString());
                        }catch (Exception e){
                            Toast.makeText(Math_arithmetics_sum_n.this, "Некорректное значение!", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        float a_1 = Float.parseFloat(a11.getText().toString());
                        float n_1 = Float.parseFloat(n1.getText().toString());
                        float d_1 = Float.parseFloat(d1.getText().toString());

                        float r = a_1 + (n_1 - 1) * d_1;
                        res.setText(String.valueOf("an = " + r));
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
                        a11 = (EditText) findViewById(R.id.a1);
                        n1 = (EditText) findViewById(R.id.n);
                        d1 = (EditText) findViewById(R.id.d);
                        res = (TextView) findViewById(R.id.result);
                        a11.setText(String.valueOf(""));
                        n1.setText(String.valueOf(""));
                        d1.setText(String.valueOf(""));
                        res.setText(String.valueOf("an = 0"));
                    }
                }
        );
    }
    private void onClickBack(){
        button_back = (Button)findViewById(R.id.btn_back_onMenu_math);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Math_arithmetics_sum_n.this, Math_Arithmetics_progress.class);
                startActivity(i);
                finish();
            }
        });

    }
    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, Math_Arithmetics_progress.class);
        startActivity(i);
        finish();
    }
}