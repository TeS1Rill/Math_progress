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

public class Math_arithmetics_svoistvo extends AppCompatActivity {

    private Button button_work;
    private Button button_reset;
    private EditText an_1;
    private EditText an_2;
    private TextView res;
    private Button button_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_arithmetics_svoistvo);

        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );


        onClickReset();
        onClickBack();
        onClickWork();
    }
    private void onClickWork(){
        button_work = (Button) findViewById(R.id.button_1_work);
        button_work.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        an_1 = (EditText) findViewById(R.id.an_1);
                        an_2 = (EditText) findViewById(R.id.an_2);
                        res = (TextView) findViewById(R.id.result);

                        if (an_2.length() == 0 || an_1.length() == 0) {
                            Toast.makeText(Math_arithmetics_svoistvo.this, "Введите значение!", Toast.LENGTH_SHORT).show();
                            return;
                        }

                            try {
                               float  a_1 = Float.parseFloat(an_1.getText().toString());
                               float  a_2 = Float.parseFloat(an_2.getText().toString());
                            } catch (Exception e) {
                                Toast.makeText(Math_arithmetics_svoistvo.this, "Некорректное значение!", Toast.LENGTH_SHORT).show();
                                return;
                            }
                        float a_1 = Float.parseFloat(an_1.getText().toString());
                        float a_2 = Float.parseFloat(an_2.getText().toString());
                                float r = (a_2 + a_1) / 2;
                                res.setText(String.valueOf("an = " + r));
                        }

                }
        );
    }
    private void onClickReset(){
        button_reset = (Button) findViewById(R.id.button_2_reset);
        button_reset.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        an_1 = (EditText) findViewById(R.id.an_1);
                        an_2 = (EditText) findViewById(R.id.an_2);
                        res = (TextView) findViewById(R.id.result);

                        an_1.setText(String.valueOf(""));
                        an_2.setText(String.valueOf(""));
                        res.setText(String.valueOf("an = 0"));
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
                        Intent i = new Intent(Math_arithmetics_svoistvo.this, Math_Arithmetics_progress.class);
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