package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.lblHello);
        Button boton = findViewById(R.id.btnCambio);
        boton.setOnClickListener(new CListenerHelloWorld(textView));

        CStringDto dto = new CStringDto();
        dto.setCadena("test");
        textView.setText(dto.getCadena());

    }

}