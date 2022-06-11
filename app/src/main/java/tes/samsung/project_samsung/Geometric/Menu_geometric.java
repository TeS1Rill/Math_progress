package tes.samsung.project_samsung.Geometric;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import tes.samsung.project_samsung.Math.Math_combinator;
import tes.samsung.project_samsung.Math.Menu_math;
import tes.samsung.project_samsung.R;

public class Menu_geometric extends AppCompatActivity {

    private Button button_back_geometric_menu;
    private Button hypoten;
    private Button cathet;
    private Button sin;
    private Button cos;
    private Button tg;
    private Button ctg;
    private Button button_combinator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_geometric);
        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );

        ////////
        onClickListenerBackGeometricMenu();
        onClickHypoten();
        onClickCathet();
        onClickSin();
        onClickTG();
        onClickCTG();
        onClickCos();
        ////////
    }
    public void onClickListenerBackGeometricMenu(){
        button_back_geometric_menu = (Button) findViewById(R.id.button_back_geometric_menu);
        button_back_geometric_menu.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Menu_geometric.this, Menu_math.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickHypoten(){
        hypoten = (Button) findViewById(R.id.button_hypoten);
        hypoten.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Menu_geometric.this, Geometric_hypoten.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickCathet(){
        cathet = (Button) findViewById(R.id.cathet);
        cathet.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Menu_geometric.this, Geometric_cathet.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickSin() {
        sin = (Button) findViewById(R.id.sin);
        sin.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Menu_geometric.this, Geometric_sin.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickCos() {
        cos = (Button) findViewById(R.id.cos);
        cos.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Menu_geometric.this, Geometric_cos.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickTG() {
        tg = (Button) findViewById(R.id.tg);
        tg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Menu_geometric.this, Geometric_tg.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickCTG() {
        ctg = (Button) findViewById(R.id.ctg);
        ctg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Menu_geometric.this, Geometric_ctg.class);
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