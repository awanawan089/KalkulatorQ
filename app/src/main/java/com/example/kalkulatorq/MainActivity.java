package com.example.kalkulatorq;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.text.TextUtils;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText nilai1, nilai2;
    TextView tvHasil;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nilai1 = findViewById(R.id.nilai1);
        nilai2 = findViewById(R.id.nilai2);
        tvHasil = findViewById(R.id.tvHasil);

        // Set inputType untuk memastikan keyboard hanya menampilkan angka
        nilai1.setInputType(android.text.InputType.TYPE_CLASS_NUMBER);
        nilai2.setInputType(android.text.InputType.TYPE_CLASS_NUMBER);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    public void Tambah(View view){
        String input1 = nilai1.getText().toString();
        String input2 = nilai2.getText().toString();

        // Periksa apakah kedua input hanya terdiri dari digit
        if(TextUtils.isDigitsOnly(input1) && TextUtils.isDigitsOnly(input2)){
            Integer a = Integer.parseInt(input1);
            Integer b = Integer.parseInt(input2);
            Integer c = a + b;
            tvHasil.setText("Hasil" + "= " + c);
        } else {
            // Jika salah satu input bukan angka, tampilkan pesan kesalahan
            tvHasil.setText("Masukkan hanya angka!");
        }
    }

    public void Kurang(View view){
        String input1 = nilai1.getText().toString();
        String input2 = nilai2.getText().toString();

        // Periksa apakah kedua input hanya terdiri dari digit
        if(TextUtils.isDigitsOnly(input1) && TextUtils.isDigitsOnly(input2)){
            Integer a = Integer.parseInt(input1);
            Integer b = Integer.parseInt(input2);
            Integer c = a - b;
            tvHasil.setText("Hasil" + "= " + c);
        } else {
            // Jika salah satu input bukan angka, tampilkan pesan kesalahan
            tvHasil.setText("Masukkan hanya angka!");
        }
    }

    public void Kali(View view){
        String input1 = nilai1.getText().toString();
        String input2 = nilai2.getText().toString();

        // Periksa apakah kedua input hanya terdiri dari digit
        if(TextUtils.isDigitsOnly(input1) && TextUtils.isDigitsOnly(input2)){
            Integer a = Integer.parseInt(input1);
            Integer b = Integer.parseInt(input2);
            Integer c = a * b;
            tvHasil.setText("Hasil" + "= " + c);
        } else {
            // Jika salah satu input bukan angka, tampilkan pesan kesalahan
            tvHasil.setText("Masukkan hanya angka!");
        }
    }

    public void Bagi(View view){
        String input1 = nilai1.getText().toString();
        String input2 = nilai2.getText().toString();

        // Periksa apakah kedua input hanya terdiri dari digit
        if(TextUtils.isDigitsOnly(input1) && TextUtils.isDigitsOnly(input2)){
            Integer a = Integer.parseInt(input1);
            Integer b = Integer.parseInt(input2);

            // Periksa apakah pembagi tidak sama dengan nol
            if (b != 0) {
                Integer c = a / b;
                tvHasil.setText("Hasil" + "= " + c);
            } else {
                tvHasil.setText("Tidak dapat dibagi dengan nol!");
            }
        } else {
            // Jika salah satu input bukan angka, tampilkan pesan kesalahan
            tvHasil.setText("Masukkan hanya angka!");
        }
    }
}
