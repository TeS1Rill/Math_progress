package tes.samsung.project_samsung;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Level_3 extends AppCompatActivity {

    private TextView text_button;
    private Button button_dialog;
    private Button buttub_back;
    private TextView text_info;
    public int num_1;
    public int num_2;
    private Dialog dialog;
    private Array array = new Array();
    private Random random = new Random();
    private Button button_dialog_level_3;
    private TextView dialog_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);

        final ImageView imageView_1 = (ImageView) findViewById(R.id.imageView_1);
        final ImageView imageView_2 = (ImageView) findViewById(R.id.imageView_2);
        //скругляем углы
        imageView_1.setClipToOutline(true);
        imageView_2.setClipToOutline(true);

        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );


        //dialog
        dialog = new Dialog(this);
        dialog.requestWindowFeature(window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_level_3);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));//прозрачный фон окна
        dialog.setCancelable(false);
        dialog.show();
        ////////


        onClickBackMenuButton();
        onInfoLevels();
        onBackDialogLevel_3();
        onContinDialog_level_3();
        ///////

        final Animation anim = AnimationUtils.loadAnimation(Level_3.this, R.anim.alpha);

        num_1 = random.nextInt(12);
        imageView_1.setImageResource(array.array_level_3[num_1]);
        num_2 = random.nextInt(12);
        while (num_1 == num_2){
            num_2 = random.nextInt(12);
        }
        imageView_2.setImageResource(array.array_level_3[num_2]);

        /////////////////////////
        imageView_1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    imageView_2.setEnabled(false);
                    if(num_1 > num_2){
                        imageView_1.setImageResource(R.drawable.status_true);
                    }else
                        imageView_1.setImageResource(R.drawable.status_false);
                }else if(motionEvent.getAction() == MotionEvent.ACTION_UP){
                    num_1 = random.nextInt(12);
                    imageView_1.setImageResource(array.array_level_3[num_1]);
                    imageView_1.startAnimation(anim);
                    num_2 = random.nextInt(12);

                    while (num_1 == num_2){
                        num_2 = random.nextInt(12);
                    }
                    imageView_2.setImageResource(array.array_level_3[num_2]);
                    imageView_2.startAnimation(anim);
                    imageView_2.setEnabled(true);
                }
                return true;
            }
        });
        ///////////////
        /////////////////////////
        imageView_2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    imageView_1.setEnabled(false);
                    if(num_2 > num_1){
                        imageView_2.setImageResource(R.drawable.status_true);
                    }else
                        imageView_2.setImageResource(R.drawable.status_false);
                }else if(motionEvent.getAction() == MotionEvent.ACTION_UP){
                    num_1 = random.nextInt(12);
                    imageView_1.setImageResource(array.array_level_3[num_1]);
                    imageView_1.startAnimation(anim);
                    num_2 = random.nextInt(12);

                    while (num_1 == num_2){
                        num_2 = random.nextInt(12);
                    }
                    imageView_2.setImageResource(array.array_level_3[num_2]);
                    imageView_2.startAnimation(anim);
                    imageView_1.setEnabled(true);
                }
                return true;
            }
        });
        ///////////////

    }

    private void onClickBackMenuButton(){
        buttub_back = (Button)findViewById(R.id.button_back);
        buttub_back.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Level_3.this, Levels.class);
                        startActivity(i);
                        finish();
                    }
                }
        );

    }
    @Override
    public void onBackPressed(){
        Intent i = new Intent(Level_3.this, Levels.class);
        startActivity(i);
        finish();
    }
    private void onInfoLevels(){
        text_info = (TextView) findViewById(R.id.level_info);
        text_info.setText(R.string.level_3);

    }
    private void onContinDialog_level_3(){
        button_dialog_level_3 = (Button) dialog.findViewById(R.id.button_dialog);
        button_dialog_level_3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                }
        );
    }
    private void onBackDialogLevel_3(){
        dialog_textview = (TextView) dialog.findViewById(R.id.text_button);
        dialog_textview.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Level_3.this, Levels.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }

}