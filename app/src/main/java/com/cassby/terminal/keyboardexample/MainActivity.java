package com.cassby.terminal.keyboardexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.cassby.terminal.keyboard2.QwertyKeyboard;
import com.cassby.terminal.keyboard2.QwertyKeyboardOutput;

public class MainActivity extends AppCompatActivity implements QwertyKeyboardOutput {

    private QwertyKeyboard keyboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        keyboard = findViewById(R.id.keyboard);
        keyboard.setOutput(this);
    }

    @Override
    public void didEnterSymbol(String s) {
        Log.d("TAG", s);
    }

    @Override
    public void didPressErase() {
        Log.d("TAG", "ERASE_PRESSED");
    }
}
