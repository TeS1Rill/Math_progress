package tes.samsung.project_samsung.Math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import tes.samsung.project_samsung.R;

public class Math_brobality extends AppCompatActivity {

    private Button btn_back;
    private EditText num_x;
    private EditText num_n;
    private TextView res;
    private Button button_work;
    private Button button_reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_brobality);


        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );

        ////////////
        onClickBtnBackOnMenuMath();
        onClickWorkProbability();
        onClickResetProbability();
        ///////////
    }
    public void onClickBtnBackOnMenuMath(){
        btn_back = (Button) findViewById(R.id.btn_back_onMenu_math);
        btn_back.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Math_brobality.this, Menu_math.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    public void onClickWorkProbability(){
        button_work = (Button) findViewById(R.id.button_1_work);
        button_work.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        num_n = (EditText) findViewById(R.id.num_n);
                        num_x = (EditText) findViewById(R.id.num_x);
                        res = (TextView) findViewById(R.id.res_probability);

                        if(num_n.length() == 0 || num_x.length() == 0){
                            Toast.makeText(Math_brobality.this, "Введите значения!", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        try {
                            float a = Float.parseFloat(num_n.getText().toString());
                           float  b = Float.parseFloat(num_x.getText().toString());
                        }catch (Exception e){
                            Toast.makeText(Math_brobality.this, "Некорректное значение!", Toast.LENGTH_SHORT)
                                    .show();
                            return;
                        }
                        float a = Float.parseFloat(num_n.getText().toString());
                        float b = Float.parseFloat(num_x.getText().toString());
                        if(b > a){
                            Toast.makeText(Math_brobality.this, "Наоборот", Toast.LENGTH_SHORT).show();
                            return;
                        }else if(b < a) {
                            float res_a = b / a;
                            res.setText(String.valueOf("P = " + res_a));
                        }



                    }
                }
        );

    }
    public void onClickResetProbability(){
        button_reset = (Button) findViewById(R.id.button_2_reset);
        button_reset.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        res = (TextView) findViewById(R.id.res_probability);
                        num_n = (EditText) findViewById(R.id.num_n);
                        num_x = (EditText) findViewById(R.id.num_x);
                        res.setText(String.valueOf("P = 0"));
                        num_n.setText(String.valueOf(""));
                        num_x.setText(String.valueOf(""));
                    }
                }
        );
    }
    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, Menu_math.class);
        startActivity(i);
        finish();
    }

}