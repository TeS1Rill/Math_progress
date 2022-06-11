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

public class Math_procent extends AppCompatActivity {

    private Button button_back;
    private EditText num_n;
    private EditText procent;
    private TextView res_procent;
    private Button button_work;
    private Button button_reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_procent);


        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //////////
        onClickBackOnMenu();
        onClickResetProcent();
        onClickWorkProcent();

        /////////
    }

    private void onClickBackOnMenu() {
        button_back = (Button) findViewById(R.id.button_back_menu_math_procent);
        button_back.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Math_procent.this, Menu_math.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }

    private void onClickWorkProcent() {
        button_work = (Button) findViewById(R.id.button_1_work);
        button_work.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        num_n = (EditText) findViewById(R.id.num_n);
                        procent = (EditText) findViewById(R.id.procent);
                        res_procent = (TextView) findViewById(R.id.res_procent);

                        if (num_n.length() == 0 || procent.length() == 0) {
                            Toast.makeText(Math_procent.this, "Введите значения!", Toast.LENGTH_SHORT)
                                    .show();
                            return;
                        }

                        try {
                            float n = Float.parseFloat(num_n.getText().toString());
                            float proc = Float.parseFloat(procent.getText().toString());
                        } catch (Exception e) {
                            Toast.makeText(Math_procent.this, "Некорректное значение!", Toast.LENGTH_SHORT)
                                    .show();
                            return;
                        }
                        float n = Float.parseFloat(num_n.getText().toString());
                        float proc = Float.parseFloat(procent.getText().toString());
                        float c = proc * 100;
                        float res = c / n;
                        res_procent.setText(String.valueOf(proc + " % " + n + " = " + res + " %"));
                    }
                }
        );
    }

    private void onClickResetProcent() {
        button_reset = (Button) findViewById(R.id.button_2_reset);
        button_reset.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        num_n = (EditText) findViewById(R.id.num_n);
                        procent = (EditText) findViewById(R.id.procent);
                        res_procent = (TextView) findViewById(R.id.res_procent);

                        num_n.setText(String.valueOf(""));
                        res_procent.setText(String.valueOf("0 % = 0 %"));
                        procent.setText(String.valueOf(""));
                    }
                }
        );
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(Math_procent.this, Menu_math.class);
        startActivity(i);
        finish();
    }
}