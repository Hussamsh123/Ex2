package com.hussam.ex2postpc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView mainText = findViewById(R.id.MainText);
        final Button CreateButton = findViewById(R.id.CreateButton);
        CreateButton.setText("create");
        final EditText TextEditor = findViewById(R.id.TextEditor);
        mainText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainText.setText("Not so shitty after all");
            }
        });
        CreateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainText.setText(TextEditor.getText());
                TextEditor.setText("");
            }
        });
    }

}
