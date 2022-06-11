package tes.samsung.project_samsung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import tes.samsung.project_samsung.Math.Menu_math;

public class MainActivity extends AppCompatActivity {

    private Button button_click_menu_levels;
    private Button button_click_menu_math;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ///////
        onClick_menu_game();
        onClick_menu_math();
        ///////

        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );
    }
    public void onClick_menu_game(){
        button_click_menu_levels = (Button) findViewById(R.id.button_click_menu_levels);
        button_click_menu_levels.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(MainActivity.this, Levels.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    public void onClick_menu_math(){
        button_click_menu_math= (Button) findViewById(R.id.button_click_menu_math);
        button_click_menu_math.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {

                            Intent i = new Intent(MainActivity.this, Menu_math.class);
                            startActivity(i);
                            finish();
                        }catch (Exception e){
                            return;
                        }
                    }
                }
        );
    }
}