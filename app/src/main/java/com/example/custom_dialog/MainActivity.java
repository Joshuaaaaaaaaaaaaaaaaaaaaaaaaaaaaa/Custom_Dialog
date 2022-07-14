package com.example.custom_dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnShow;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShow = findViewById(R.id.btn);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showDialog();

            }
        });
    }

    private void showDialog(){

        Dialog dialog = new Dialog(this, R.style.DialogStyle);
        dialog.setContentView(R.layout.layout_custom_dialog);
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.bg_window);
        dialog.show();

    }
    public void showTNC() {
        Intent tv= new Intent(MainActivity.this, terms_condition.class);
        startActivity(tv);
    }
}