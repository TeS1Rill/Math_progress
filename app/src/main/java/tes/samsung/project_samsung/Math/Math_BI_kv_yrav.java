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

public class Math_BI_kv_yrav extends AppCompatActivity {


    private Button button_1_work;
    private Button button_2_reset;
    private TextView x1;
    private TextView x2;
    private TextView x3;
    private TextView x4;
    private EditText num_a;
    private EditText num_b;
    private EditText num_c;
    private TextView formula;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_bi_kv_yrav);


        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );

        ////////
        onClickListenerWork();
        onClickListenerReset();
        onClickListenerIntentKvYrav();
        ///////
    }
    public void onClickListenerWork(){
        button_1_work = (Button) findViewById(R.id.button_1_work);
        button_1_work.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        num_a = (EditText) findViewById(R.id.editTextText_1);
                        num_b = (EditText) findViewById(R.id.editText_2);
                        num_c = (EditText) findViewById(R.id.editText_3);
                        formula = (TextView) findViewById(R.id.textView_formula);
                        x1 = (TextView) findViewById(R.id.res_1);
                        x2 = (TextView) findViewById(R.id.res_2);
                        x3 = (TextView) findViewById(R.id.res_3);
                        x4 = (TextView) findViewById(R.id.res_4);

                        if(num_a.length() == 0 || num_b.length() == 0 || num_c.length() == 0) {
                            Toast.makeText(Math_BI_kv_yrav.this, "Введите значения", Toast.LENGTH_SHORT).show();
                            return;
                        }



                        try {
                            int a = Integer.parseInt(num_a.getText().toString());
                            int b = Integer.parseInt(num_b.getText().toString());
                            int c = Integer.parseInt(num_c.getText().toString());
                        } catch (Exception e) {
                            Toast.makeText(Math_BI_kv_yrav.this, "Некорректное значение!", Toast.LENGTH_SHORT)
                                    .show();
                            return;
                        }
                        int a = Integer.parseInt(num_a.getText().toString());
                        int b = Integer.parseInt(num_b.getText().toString());
                        int c = Integer.parseInt(num_c.getText().toString());
                        float d = (b * b) - (4 * a * c);
                        float D = (float) Math.sqrt(d);
                        if (d > 0) {
                            float x_1 = (-b + D) / 2 * a;
                            float x_2 = (-b - D) / 2 * a;
                            x1.setText(String.valueOf("x1 = " + x_1));
                            x2.setText(String.valueOf("x2 = " + x_2));
                            x3.setText(String.valueOf("x3 = " + -x_1));
                            x4.setText(String.valueOf("x4 = " + -x_2));
                        } else if (d == 0) {
                            float x_1 = (-b + D) / 2 * a;
                            x1.setText(String.valueOf("x1 = " + x_1));
                            x2.setText(String.valueOf("x2 = " + x_1));
                            x3.setText(String.valueOf("x3 = " + -x_1));
                            x4.setText(String.valueOf("x4 = " + -x_1));
                        } else if (d < 0) {
                            x1.setText(String.valueOf("x1 = нет"));
                            x2.setText(String.valueOf("x2 = нет"));
                            x3.setText(String.valueOf("x3 = нет"));
                            x4.setText(String.valueOf("x4 = нет"));
                        }

                    }
                }
        );
    }
    public void onClickListenerReset(){
        button_2_reset = (Button) findViewById(R.id.button_2_reset);
        button_2_reset.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        x1 = (TextView) findViewById(R.id.res_1);
                        x2 = (TextView) findViewById(R.id.res_2);
                        x1.setText(String.valueOf("x1 = 0"));
                        x2.setText(String.valueOf("x2 = 0"));
                        x3.setText(String.valueOf("x3 = 0"));
                        x4.setText(String.valueOf("x4 = 0"));
                        num_a = (EditText) findViewById(R.id.editTextText_1);
                        num_b = (EditText) findViewById(R.id.editText_2);
                        num_c = (EditText) findViewById(R.id.editText_3);
                        num_a.setText(String.valueOf(""));
                        num_b.setText(String.valueOf(""));
                        num_c.setText(String.valueOf(""));
                    }
                }
        );
    }
    public void onClickListenerIntentKvYrav(){
        button = (Button) findViewById(R.id.math_back_kv_yrav);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Math_BI_kv_yrav.this, Menu_math.class);
                        startActivity(i);
                        finish();
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