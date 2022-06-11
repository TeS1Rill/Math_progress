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

import tes.samsung.project_samsung.R;

public class Geometric_hypoten extends AppCompatActivity {

    private Button button_back_hypoten;
    private TextView res_1;
    private EditText num_1;
    private EditText num_2;
    private Button button_work;
    private Button button_reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometric_hypoten);


        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );

        //////////
       onClickBackHypoten();
        onClickWork();
        onClickReset();
        /////////
    }
    private void onClickBackHypoten(){
        button_back_hypoten = (Button)findViewById(R.id.button_back);
        button_back_hypoten.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Geometric_hypoten.this, Menu_geometric.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickWork(){
        button_work = (Button)findViewById(R.id.button_1_work);
        button_work.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        num_1 = (EditText) findViewById(R.id.num_1);
                        num_2 = (EditText) findViewById(R.id.num_2);
                        res_1 = (TextView) findViewById(R.id.res);

                        if(num_1.length() == 0 || num_2.length() == 0){
                            Toast.makeText(Geometric_hypoten.this, "Некоректнное значение!", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        try {
                           float  a = Float.parseFloat(num_1.getText().toString());
                            float b = Float.parseFloat(num_2.getText().toString());
                        }catch (Exception e){
                            Toast.makeText(Geometric_hypoten.this, "Некорректное значение!", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        float a = Float.parseFloat(num_1.getText().toString());
                        float b = Float.parseFloat(num_2.getText().toString());

                        float c = (a * a) + (b * b);
                        float res_2 = (float) Math.sqrt(c);

                        res_1.setText(String.valueOf("гипотенуза = " + res_2));
                    }
                }
        );

    }
    private void onClickReset(){
        button_reset = (Button)findViewById(R.id.button_2_reset);
        button_reset.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        num_1 = (EditText) findViewById(R.id.num_1);
                        num_2 = (EditText) findViewById(R.id.num_2);
                        res_1 = (TextView) findViewById(R.id.res);

                        num_1.setText(String.valueOf(""));
                        num_2.setText(String.valueOf(""));
                        res_1.setText(String.valueOf("гипотенуза = 0"));
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