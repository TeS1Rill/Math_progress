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

public class Math_combinator_sochetanie extends AppCompatActivity {

    private EditText n1;
    private EditText k1;
    private TextView result;
    private Button button_work;
    private Button button_reset;
    private Button button_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_combinator_sochetanie);

        onBackMenu_Sochetanie();
        onReset_sochetanie();
        onWork_sochetanie();


        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );

    }

    public void onBackMenu_Sochetanie() {
        button_back = (Button) findViewById(R.id.btn_back_onMenu_math);
        button_back.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Math_combinator_sochetanie.this, Math_combinator.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }

    public void onReset_sochetanie() {
        button_reset = (Button) findViewById(R.id.button_2_reset);
        button_reset.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        n1 = findViewById(R.id.n);
                        k1 = findViewById(R.id.k);
                        result = findViewById(R.id.result);
                        n1.setText(String.valueOf(""));
                        k1.setText(String.valueOf(""));
                        result.setText(String.valueOf("C = 0"));
                    }
                }
        );

    }

    public void onWork_sochetanie() {
        button_work = (Button) findViewById(R.id.button_1_work);
        button_work.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        n1 = findViewById(R.id.n);
                        k1 = findViewById(R.id.k);
                        result = findViewById(R.id.result);
                        if (n1.length() == 0 || k1.length() == 0) {
                            Toast.makeText(Math_combinator_sochetanie.this, "введите значения!", Toast.LENGTH_SHORT)
                                    .show();
                            return;
                        }try {
                            float n = Float.parseFloat(n1.getText().toString());
                            float k = Float.parseFloat(k1.getText().toString());
                        }catch (Exception e){
                            Toast.makeText(Math_combinator_sochetanie.this, "введите значения!", Toast.LENGTH_SHORT)
                                    .show();
                            return;
                        }
                        float n = Float.parseFloat(n1.getText().toString());
                        float k = Float.parseFloat(k1.getText().toString());
                        if (n < k) {
                            Toast.makeText(Math_combinator_sochetanie.this, "n должно быть больше k", Toast.LENGTH_SHORT)
                                    .show();
                        }
                        if (n <= 0 || k <= 0) {
                            Toast.makeText(Math_combinator_sochetanie.this, "Некорректное значение!", Toast.LENGTH_SHORT)
                                    .show();
                        } else {
                            long res_n = 1L;
                            long res_nk = 1L;
                            long res_k = 1L;
                            for (long factorial = 1; factorial < n + 1; factorial++) {
                                res_n *= factorial;
                            }
                            for (long factorial = 1; factorial < k + 1; factorial++) {
                                res_k *= factorial;
                            }
                            for (long factorial = 1; factorial < ((n - k) + 1); factorial++) {
                                res_nk *= factorial;

                            }
                            result.setText(String.valueOf("C = " + (res_n / (res_nk * res_k))));
                        }
                    }
                });
    }
    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, Math_combinator.class);
        startActivity(i);
        finish();
    }
}