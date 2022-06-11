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

import tes.samsung.project_samsung.MainActivity;
import tes.samsung.project_samsung.R;

public class Math_kv_yrav extends AppCompatActivity {

    private Button button_1_work;
    private Button button_2_reset;
    private TextView x1;
    private TextView x2;
    private EditText num_a;
    private EditText num_b;
    private EditText num_c;
    private TextView formula;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_kv_yrav);


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

                        if(num_a.length() != 0) {
                            if(num_b.length() == 0 && num_c.length() == 0){
                                Toast.makeText(Math_kv_yrav.this, "Введите значения", Toast.LENGTH_SHORT).show();
                                return;
                            }
                            if (num_c.length() == 0) {
                                formula.setText(String.valueOf("ax^2 + bx = 0"));
                                int a = Integer.parseInt(num_a.getText().toString());
                                int b = Integer.parseInt(num_b.getText().toString());
                                    int x_1 = -b / a;
                                    x1.setText(String.valueOf("x1 = " + x_1));
                                    x2.setText(String.valueOf("x2 = 0"));
                                return;
                            }
                            if (num_b.length() == 0) {
                                formula.setText(String.valueOf("ax^2 + c = 0"));


                                int a = Integer.parseInt(num_a.getText().toString());
                                int c = Integer.parseInt(num_c.getText().toString());
                                float x_1 = (float)(Math.sqrt(-c / a));
                                float x_2 = -x_1;
                                x1.setText(String.valueOf("x1 = " + x_1));
                                x2.setText(String.valueOf("x2 = " + x_2));
                                return;
                            }
                        }
                        if(num_a.length() == 0) {
                            Toast.makeText(Math_kv_yrav.this, "Введите значения", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        if(num_a.length() != 0 && num_b.length() != 0 && num_c.length() != 0){
                            formula.setText(String.valueOf("ax^2 + bx + c = 0"));

                        }


                        try {
                           float  a = Integer.parseInt(num_a.getText().toString());
                           float  b = Integer.parseInt(num_b.getText().toString());
                           float  c = Integer.parseInt(num_c.getText().toString());
                        } catch (Exception e) {
                            Toast.makeText(Math_kv_yrav.this, "Некорректное значение!", Toast.LENGTH_SHORT)
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
                        } else if (d == 0) {
                            float x_1 = (-b + D) / 2 * a;
                            x1.setText(String.valueOf("x1 = " + x_1));
                            x2.setText(String.valueOf("x2 = " + x_1));
                        } else if (d < 0) {
                            x1.setText(String.valueOf("x1 = нет"));
                            x2.setText(String.valueOf("x2 = нет"));
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
                        num_a = (EditText) findViewById(R.id.editTextText_1);
                        num_b = (EditText) findViewById(R.id.editText_2);
                        num_c = (EditText) findViewById(R.id.editText_3);
                        num_a.setText(String.valueOf(""));
                        num_b.setText(String.valueOf(""));
                        num_c.setText(String.valueOf(""));
                        formula.setText(String.valueOf("ax^2 + bx + c = 0"));
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
                        Intent i = new Intent(Math_kv_yrav.this, Menu_math.class);
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