package com.example.kick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton img,mus,ebook,text,compr;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        img = (RadioButton)findViewById(R.id.one);
        mus = (RadioButton)findViewById(R.id.two);
        ebook = (RadioButton) findViewById(R.id.three);
        String ebook = " String text =\"-inurl:(htm|html|php) intitle:\"index of\" +\"last modified\" +\"parent directory\" +description +size +(.pdf,.rtf,.txt,.chm,.pps,.rar,.doc) \";\n";
        text = (RadioButton)findViewById(R.id.four);
        compr = (RadioButton)findViewById(R.id.five);
        textView = findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);

        Button buttonApply = findViewById(R.id.button);
        buttonApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = radioGroup.getCheckedRadioButtonId();
                img =findViewById(radioId);
                Uri uri = Uri.parse("https://www.google.com/search?q="    + editText.getText() .toString() +  img.getHint());

                Intent gSearchIntent = new Intent(Intent.ACTION_VIEW,uri);
                img = findViewById(radioId);
                textView.setText("select text: "  + editText.getText() .toString() + img.getHint());

                startActivity(gSearchIntent);


            }
        });

    }

}
