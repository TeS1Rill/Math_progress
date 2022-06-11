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

public class Geometric_cos extends AppCompatActivity {

    private Button button_back;
    private Button button_reset;
    private Button button_work;
    private TextView res;
    private EditText hypoten;
    private Button dialog_cos_button;
    Dialog dialog;
    private EditText cathet;
    private ImageView dialog_cos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometric_cos);

        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        dialog = new Dialog(Geometric_cos.this);
        dialog.requestWindowFeature(window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_math_cos);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));//прозрачный фон окна
        dialog.setCancelable(false);

        onClickBack();
        onClickWork();
        onClickReset();
        onClickDialogCosButton();
        onClickDialogCos();
    }

    private void onClickBack() {
        button_back = (Button) findViewById(R.id.button_back);
        button_back.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Geometric_cos.this, Menu_geometric.class);
                        startActivity(i);
                        finish();
                    }
                }
        );
    }

    private void onClickWork() {
        button_work = (Button) findViewById(R.id.button_1_work);
        button_work.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        hypoten = (EditText) findViewById(R.id.hypoten);
                        cathet = (EditText) findViewById(R.id.cathet);
                        res = (TextView) findViewById(R.id.res);

                        if (hypoten.length() == 0 || cathet.length() == 0) {
                            Toast.makeText(Geometric_cos.this, "Введите знаения!", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        try {
                            float h = Float.parseFloat(hypoten.getText().toString());
                            float c = Float.parseFloat(cathet.getText().toString());
                        } catch (Exception e) {
                            Toast.makeText(Geometric_cos.this, "Некорректное значение!", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        float h = Float.parseFloat(hypoten.getText().toString());
                        float c = Float.parseFloat(cathet.getText().toString());
                        if (c > h) {
                            Toast.makeText(Geometric_cos.this, "Катет не может быть больше либо равен гипотенузе!", Toast.LENGTH_SHORT).show();

                        } else if (c == h) {
                            Toast.makeText(Geometric_cos.this, "Катет не может быть больше либо равен гипотенузе!", Toast.LENGTH_SHORT).show();
                        } else {
                            float r = c / h;
                            res.setText(String.valueOf("cos = " + r));
                        }
                    }
                }
        );

    }

    private void onClickReset() {
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
                        res.setText(String.valueOf("cos = 0"));
                    }
                }
        );

    }

   private void onClickDialogCos() {
        dialog_cos = (ImageView) findViewById(R.id.dialog_cos);
        dialog_cos.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.show();
                    }
                }
        );
    }
    private void onClickDialogCosButton() {
        dialog_cos_button = (Button)dialog.findViewById(R.id.dialog_cos_button);
        dialog_cos_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
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
