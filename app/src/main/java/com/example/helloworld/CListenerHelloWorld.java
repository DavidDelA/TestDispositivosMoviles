package com.example.helloworld;

import android.view.View;
import android.widget.TextView;

public class CListenerHelloWorld implements View.OnClickListener {

    private TextView textView;
    private final String textoIngles = "Hello World!";
    private final String textoEspanol = "Hola Mundo!!!";
    private final String textoJapones = "こんにちわせかい";

    public CListenerHelloWorld(TextView view) {

        this.textView = view;
    }
    @Override
    public void onClick(View view) {

        if(textView.getText().equals(textoIngles)) {
            textView.setText(textoJapones);
        } else {
            textView.setText(textoIngles);
        }

    }
}
