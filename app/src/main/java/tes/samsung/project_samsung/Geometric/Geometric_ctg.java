package tes.samsung.project_samsung.Geometric;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import tes.samsung.project_samsung.R;

public class Geometric_ctg extends AppCompatActivity {

    private Button button_back;
    private Button button_reset;
    private Button button_work;
    private TextView res;
    Dialog dialog_ctg;
    private EditText hypoten;
    private EditText cathet;
    private ImageView dia_ctg;
    private Button dialog_ctg_button_1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometric_ctg);

        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );

        dialog_ctg = new Dialog(Geometric_ctg.this);
        dialog_ctg.requestWindowFeature(window.FEATURE_NO_TITLE);
        dialog_ctg.setContentView(R.layout.gialog_ctg   );
        dialog_ctg.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));//прозрачный фон окна
        dialog_ctg.setCancelable(false);


        onClickBack();
        onClickWork();
        onClickReset();
        onClickDialogCTg();
        onDismissDialogCTG();

    }
    private void onClickBack(){
        button_back = (Button) findViewById(R.id.button_back);
        button_back.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Geometric_ctg.this, Menu_geometric.class);
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
                        hypoten = (EditText) findViewById(R.id.hypoten);
                        cathet = (EditText) findViewById(R.id.cathet);
                        res = (TextView) findViewById(R.id.res);

                        if(hypoten.length() == 0 || cathet.length() == 0){
                            Toast.makeText(Geometric_ctg.this, "Введите знаения!", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        try {
                            float h = Float.parseFloat(hypoten.getText().toString());
                           float  c = Float.parseFloat(cathet.getText().toString());
                        }catch (Exception e){
                            Toast.makeText(Geometric_ctg.this, "Некорректное значение!", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        float h = Float.parseFloat(hypoten.getText().toString());
                        float c = Float.parseFloat(cathet.getText().toString());

                        float r = h / c;
                        res.setText(String.valueOf("tg = " + r));
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
                        hypoten = (EditText) findViewById(R.id.hypoten);
                        cathet = (EditText) findViewById(R.id.cathet);
                        res = (TextView) findViewById(R.id.res);

                        hypoten.setText(String.valueOf(""));
                        cathet.setText(String.valueOf(""));
                        res.setText(String.valueOf("ctg = 0"));
                    }
                }
        );

    }
    private void onClickDialogCTg() {
        dia_ctg = (ImageView) findViewById(R.id.dia_ctg);
        dia_ctg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog_ctg.show();
                    }
                }
        );
    }
    private void onDismissDialogCTG(){
        dialog_ctg_button_1 = (Button) dialog_ctg.findViewById(R.id.dialog_ctg_button);
        dialog_ctg_button_1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog_ctg.dismiss();
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