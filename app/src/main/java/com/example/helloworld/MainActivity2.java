package com.example.helloworld;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.lblHello);
        Button boton = findViewById(R.id.btnCambio);
        boton.setOnClickListener(new CListenerHelloWorld(textView));

        CStringDto dto = new CStringDto();
        dto.setCadena("test 2");
        textView.setText(dto.getCadena());

    }

}