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

public class Math_combinator_razmechenie extends AppCompatActivity {

    private EditText n1;
    private EditText m1;
    private TextView result;
    private Button button_work;
    private Button button_reset;
    private Button button_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_combinator_razmechenie);

        onWorkRazmechenie();
        onResetRazmecchenie();
        onBackRazmechenie();


        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );

    }
    private void onWorkRazmechenie(){
        button_work = (Button) findViewById(R.id.button_1_work);
        button_work.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        n1 = findViewById(R.id.n);
                        m1 = findViewById(R.id.m);
                        result = findViewById(R.id.result);


                        if (n1.length() == 0 || m1.length() == 0) {
                            Toast.makeText(Math_combinator_razmechenie.this, "Введите значения!", Toast.LENGTH_SHORT)
                                    .show();
                            return;
                        }

                        try {
                            float  n = Float.parseFloat(n1.getText().toString());
                             float m = Float.parseFloat(m1.getText().toString());
                        }catch (Exception e){
                            Toast.makeText(Math_combinator_razmechenie.this, "Некорректное значение!", Toast.LENGTH_SHORT)
                                    .show();
                            return;
                        }
                        float n = Float.parseFloat(n1.getText().toString());
                        float m = Float.parseFloat(m1.getText().toString());

                        if (n < m) {
                            Toast.makeText(Math_combinator_razmechenie.this, "n должно быть больше m!", Toast.LENGTH_SHORT)
                                    .show();
                        } else {
                            if (n <= 0 || m <= 0) {
                                Toast.makeText(Math_combinator_razmechenie.this, "Некорректное значение!", Toast.LENGTH_SHORT)
                                        .show();
                            } else {
                                long res_n = 1L;
                                long res_m = 1L;
                                for (long factorial = 1; factorial < n + 1; factorial++) {
                                    res_n *= factorial;
                                }
                                for (long factorial = 1; factorial < ((n - m) + 1); factorial++) {
                                    res_m *= factorial;
                                }
                                result.setText(String.valueOf("A = " + (res_n / res_m)));
                            }
                        }

                    }
                }
        );

    }
    private void onResetRazmecchenie(){
        n1 = findViewById(R.id.n);
        m1 = findViewById(R.id.m);
        result = findViewById(R.id.result);
        n1.setText(String.valueOf(""));
        m1.setText(String.valueOf(""));
        result.setText(String.valueOf("A = 0"));
    }
    private void onBackRazmechenie(){
        button_back = (Button) findViewById(R.id.btn_back_onMenu_math);
        button_back.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Math_combinator_razmechenie.this, Math_combinator.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, Math_combinator.class);
        startActivity(i);
        finish();
    }
}