package tes.samsung.project_samsung.Math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import tes.samsung.project_samsung.Geometric.Menu_geometric;
import tes.samsung.project_samsung.MainActivity;
import tes.samsung.project_samsung.R;

public class Menu_math extends AppCompatActivity {

    private Button button_back_menu_math;
    private Button button_back_menu_geometric;
    private Button button_kv;
    private Button probability;
    private Button button_procent;
    private Button button_combinator;
    private Button bikv;
    private Button arith;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_math);
        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ///////
        onClickListenerBackMenuGeometric();
        onClickListenerBackMenuMath();
        onClickListenerIntentMenuKv();
        onClickProcent();
        onClickListenerIntentProbability();
        onClickCombinator();
        onClickBIKV();
        onClickArithmetics();
        ///////
    }

   public void onClickListenerBackMenuMath() {
        button_back_menu_math = (Button) findViewById(R.id.button_back_math_menu);
        button_back_menu_math.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Menu_math.this, MainActivity.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }

    public void onClickListenerBackMenuGeometric() {
        button_back_menu_geometric = (Button) findViewById(R.id.button_back_geometric);
        button_back_menu_geometric.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Menu_math.this, Menu_geometric.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }

    public void onClickListenerIntentMenuKv(){
        button_kv = (Button) findViewById(R.id.math_menu_kv_yrav);
        button_kv.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Intent i = new Intent(Menu_math.this, Math_kv_yrav.class);
                            startActivity(i);
                            finish();
                        } catch (Exception e) {
                            return;
                        }
                    }
                });
    }
    public void onClickListenerIntentProbability(){
        probability = (Button) findViewById(R.id.button_probability);
        probability.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Intent i = new Intent(Menu_math.this, Math_brobality.class);
                            startActivity(i);
                            finish();
                        } catch (Exception e) {
                            return;
                        }
                    }
                });
    }
    public void onClickProcent(){
        button_procent = (Button) findViewById(R.id.button_procent);
        button_procent.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Intent i = new Intent(Menu_math.this, Math_procent.class);
                            startActivity(i);
                            finish();
                        } catch (Exception e) {
                            return;
                        }
                    }
                });
    }
    private void onClickCombinator() {
        button_combinator = (Button) findViewById(R.id.button_combinator);
        button_combinator.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Menu_math.this, Math_combinator.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickBIKV() {
        bikv = (Button) findViewById(R.id.bikv);
        bikv.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Menu_math.this, Math_BI_kv_yrav.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickArithmetics() {
        arith = (Button) findViewById(R.id.arithmetics);
        arith.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Menu_math.this, Math_Arithmetics_progress.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }
}