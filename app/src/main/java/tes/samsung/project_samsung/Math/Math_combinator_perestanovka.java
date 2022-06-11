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

public class Math_combinator_perestanovka extends AppCompatActivity {

    private Button button_work;
    private Button button_reset;
    private TextView res;
    private Button button_back;
    private EditText num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_combinator_perestanovka);

        onClickBack();
        onResetPerestanovka();
        onClickWorkPerestanovka();


        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );

    }
    private void onClickBack(){
        button_back = (Button) findViewById(R.id.btn_back_onMenu_math);
        button_back.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Math_combinator_perestanovka.this, Math_combinator.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickWorkPerestanovka(){
        button_work = (Button) findViewById(R.id.button_1_work);
        button_work.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        num = (EditText) findViewById(R.id.number);
                        res = (TextView) findViewById(R.id.result);

                        if(num.length() == 0){
                            Toast.makeText(Math_combinator_perestanovka.this, "Введите значения!", Toast.LENGTH_SHORT)
                                    .show();
                            return;
                        }

                        try {
                            float n = Float.parseFloat(num.getText().toString());
                        }catch (Exception e){
                            Toast.makeText(Math_combinator_perestanovka.this, "Некорректное значение!", Toast.LENGTH_SHORT)
                                    .show();
                            return;
                        }
                        float n = Float.parseFloat(num.getText().toString());

                        if(n <= 0){
                            Toast.makeText(Math_combinator_perestanovka.this, "некоректнное значение!", Toast.LENGTH_SHORT)
                                    .show();
                        }else {
                            Long result = 1L;
                            for (long factorial = 1; factorial < n+1; factorial++){
                                result*=factorial;
                            }
                            res.setText(String.valueOf("P = " + result));
                        }
                    }
                }
        );
    }
    private void onResetPerestanovka(){
        button_reset = (Button) findViewById(R.id.button_2_reset);
        button_reset.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        res = (TextView) findViewById(R.id.result);
                        num = (EditText) findViewById(R.id.number);
                        res.setText(String.valueOf("P = 0"));
                        num.setText(String.valueOf(""));
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