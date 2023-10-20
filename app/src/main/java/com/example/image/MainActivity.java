package com.example.image;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AlertDialog(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle(title)
                .setMessage(message)
                .setCancelable(false)
                .setNegativeButton("OK",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which){
                            dialog.cancel();
                        }
                    });
        AlertDialog alert = builder.create();
        alert.show();
    }

    EditText fio, phone, adress;
    final String title = "Уведомление";
    public void OnArrange(View view) {
        fio = findViewById(R.id.fio);
        phone = findViewById(R.id.phone);
        adress = findViewById(R.id.adress);

        if (fio.getText().length() == 0)
            AlertDialog(title, "Пожалуйста укажите ФИО.");
        else if (phone.getText().length() == 0)
            AlertDialog(title, "Пожалуйста укажите номер телефона.");
        else if (adress.getText().length() == 0)
            AlertDialog(title, "Пожалуйста укажите адрес доставки.");
        else {
            AlertDialog(title, "Заказ оформлен.");
        }
    }

}