package tes.samsung.project_samsung.Math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import tes.samsung.project_samsung.R;

public class Math_Arithmetics_progress extends AppCompatActivity {

    private Button button_s;
    private Button button_o;
    private Button button_sum_n;
    private Button button_back;
    private Button button_f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_arithmetics_progress);

        onClickSvoistvo();
        onClickOpredelenie();
        onClickSum_n();
        onClickSumFn();
        onClickBack();
    }
    private void onClickSvoistvo(){
        button_s = (Button)findViewById(R.id.svoistvo);
        button_s.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Math_Arithmetics_progress.this, Math_arithmetics_svoistvo.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickOpredelenie(){
        button_o = (Button)findViewById(R.id.opredel);
        button_o.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Math_Arithmetics_progress.this, Math_arithmetics_opredelenie.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickSum_n(){
        button_sum_n = (Button)findViewById(R.id.sum_n);
        button_sum_n.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Math_Arithmetics_progress.this, Math_arithmetics_sum_n.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickBack(){
        button_back = (Button) findViewById(R.id.btn_back_onMenu_math);
        button_back.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Math_Arithmetics_progress.this, Menu_math.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickSumFn(){
        button_f = (Button) findViewById(R.id.sum_n_first);
        button_f.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Math_Arithmetics_progress.this, Math_arithmetics_sum_firts_n.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }  @Override
    public void onBackPressed() {
        Intent i = new Intent(this, Menu_math.class);
        startActivity(i);
        finish();
    }


}