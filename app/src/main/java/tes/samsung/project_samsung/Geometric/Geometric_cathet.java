package tes.samsung.project_samsung.Geometric;

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

import tes.samsung.project_samsung.Math.Math_procent;
import tes.samsung.project_samsung.Math.Menu_math;
import tes.samsung.project_samsung.R;

public class Geometric_cathet extends AppCompatActivity {

    private Button button_back;
    private Button button_reset;
    private Button button_work;
    private EditText hypoten;
    private EditText cathet;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometric_cathet);


        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );

        ///////////
        onClickBackCathet();
        onClickResetCathet();
        onClickWorkCathet();
        /////////
    }
    private void onClickBackCathet(){
        button_back = (Button) findViewById(R.id.button_back);
        button_back.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Geometric_cathet.this, Menu_geometric.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickWorkCathet(){
        button_work = (Button) findViewById(R.id.button_1_work);
        button_work.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        hypoten = (EditText) findViewById(R.id.hypoten);
                        cathet = (EditText) findViewById(R.id.cathen);
                        res = (TextView) findViewById(R.id.res);


                        if(hypoten.length() == 0 || cathet.length() == 0){
                            Toast.makeText(Geometric_cathet.this, "Введите значения!", Toast.LENGTH_SHORT).show();
                            return;
                        }

                         try {
                            float h = Float.parseFloat(hypoten.getText().toString());
                            float c = Float.parseFloat(cathet.getText().toString());
                         }catch (Exception e){
                             Toast.makeText(Geometric_cathet.this, "Некорректное значение!", Toast.LENGTH_SHORT).show();
                             return;
                         }
                        float h = Float.parseFloat(hypoten.getText().toString());
                        float c = Float.parseFloat(cathet.getText().toString());
                         float res_c = (h * h) - (c * c);
                         float x = (float) Math.sqrt(res_c);
                         res.setText(String.valueOf("катет = " + x));
                    }
                }
        );

    }
    private void onClickResetCathet(){
        button_reset = (Button) findViewById(R.id.button_2_reset);
        button_reset.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        hypoten = (EditText) findViewById(R.id.hypoten);
                        cathet = (EditText) findViewById(R.id.cathen);
                        res = (TextView) findViewById(R.id.res);

                        hypoten.setText(String.valueOf(""));
                        cathet.setText(String.valueOf(""));
                        res.setText(String.valueOf("катет = 0"));
                    }
                }
        );

    }
    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, Menu_geometric.class);
        startActivity(i);
        finish();
    }
}