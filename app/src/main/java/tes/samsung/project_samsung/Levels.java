package tes.samsung.project_samsung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Levels extends AppCompatActivity {

    private Button button_back;
    private TextView button_level_1;
    private TextView button_level_2;
    private TextView button_level_3;
    private TextView button_level_4;
    private TextView button_level_5;
    private TextView button_level_6;
    private TextView button_level_7;
    private TextView button_level_8;
    private TextView button_level_9;
    private TextView button_level_10;
    private TextView button_level_11;
    private TextView button_level_12;
    private TextView button_level_13;
    private TextView button_level_14;
    private TextView button_level_15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);
        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );

        ////////
        onClickListenerBackInMainMenu();
        onClickListener_level_1();
        onClickListener_level_2();
        onClickListener_level_3();
        onClickListener_level_4();
        onClickListener_level_5();
        onClickListener_level_6();
        onClickListener_level_7();
        onClickListener_level_8();
        onClickListener_level_9();
        onClickListener_level_10();
        onClickListener_level_11();
        onClickListener_level_12();
        onClickListener_level_13();
        onClickListener_level_14();
        onClickListener_level_15();
        ///////
    }
    private void onClickListenerBackInMainMenu(){
        button_back = (Button) findViewById(R.id.button_back);
        button_back.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Levels.this, MainActivity.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickListener_level_1(){
        button_level_1 = (TextView) findViewById(R.id.level_1);
        button_level_1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Levels.this, Level_1.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickBack(){
        button_back = (Button) findViewById(R.id.button_back);
        button_back.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Levels.this, MainActivity.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickListener_level_2(){
        button_level_2 = (TextView) findViewById(R.id.level_2);
        button_level_2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Levels.this, Level_2.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickListener_level_3(){
        button_level_3 = (TextView) findViewById(R.id.level_3);
        button_level_3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Levels.this, Level_3.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickListener_level_4(){
        button_level_4 = (TextView) findViewById(R.id.level_4);
        button_level_4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Levels.this, Level_4.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickListener_level_5(){
        button_level_5 = (TextView) findViewById(R.id.level_5);
        button_level_5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Levels.this, Level_5.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickListener_level_6(){
        button_level_6 = (TextView) findViewById(R.id.level_6);
        button_level_6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Levels.this, Level_6.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickListener_level_7(){
        button_level_7 = (TextView) findViewById(R.id.level_7);
        button_level_7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Levels.this, Level_7.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickListener_level_8(){
        button_level_8 = (TextView) findViewById(R.id.level_8);
        button_level_8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Levels.this, Level_8.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickListener_level_9(){
        button_level_9 = (TextView) findViewById(R.id.level_9);
        button_level_9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Levels.this, Level_9.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickListener_level_10(){
        button_level_10 = (TextView) findViewById(R.id.level_10);
        button_level_10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Levels.this, Level_10.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickListener_level_11(){
        button_level_11 = (TextView) findViewById(R.id.level_11);
        button_level_11.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Levels.this, Level_11.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickListener_level_12(){
        button_level_12 = (TextView) findViewById(R.id.level_12);
        button_level_12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Levels.this, Level_12.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickListener_level_13(){
        button_level_13 = (TextView) findViewById(R.id.level_13);
        button_level_13.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Levels.this, Level_13.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickListener_level_14(){
        button_level_14 = (TextView) findViewById(R.id.level_14);
        button_level_14.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Levels.this, Level_14.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    private void onClickListener_level_15(){
        button_level_15 = (TextView) findViewById(R.id.level_15x);
        button_level_15.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Levels.this, Level_15x.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }
    @Override
    public void onBackPressed(){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }

}