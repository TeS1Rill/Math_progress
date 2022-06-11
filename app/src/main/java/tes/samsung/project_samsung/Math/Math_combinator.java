package tes.samsung.project_samsung.Math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import tes.samsung.project_samsung.R;

public class Math_combinator extends AppCompatActivity {

    private Button perestanovka;
    private Button sochetanie;
    private Button button_back;
    private Button button_razmechenie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_combinator);

        onClickLIstenerPerestanovka();
        onBackListenerPerestanovka();
        onClickListenerSochetanie();
        onClickListenerRazmechenie();



        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );


    }
    private void onClickLIstenerPerestanovka(){
        perestanovka = (Button) findViewById(R.id.perestanovka);
        perestanovka.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Math_combinator.this, Math_combinator_perestanovka.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onBackListenerPerestanovka(){
        button_back = (Button)findViewById(R.id.btn_back_onMenu_math);
        button_back.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Math_combinator.this, Menu_math.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickListenerSochetanie(){
        sochetanie = (Button)findViewById(R.id.sochetanie);
        sochetanie.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Math_combinator.this, Math_combinator_sochetanie.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickListenerRazmechenie(){
        button_razmechenie = (Button)findViewById(R.id.razmechenie);
        button_razmechenie.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Math_combinator.this, Math_combinator_razmechenie.class);
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