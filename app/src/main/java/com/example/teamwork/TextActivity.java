package com.example.teamwork;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class TextActivity extends AppCompatActivity {
    private TextView textname;
    private String name;
    public int posit, bol;
    public int  text1;
    private TextView infoTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);


        textname = findViewById(R.id.textname);
        infoTextView = findViewById(R.id.textbol);
        Bundle bundleIntent = getIntent().getExtras();

        if (bundleIntent != null) {
            posit = bundleIntent.getInt("class");
            bol = bundleIntent.getInt("bol");
            name = bundleIntent.getString("name");

        }
        // posit = user.getNum() ;
        textname.setText("Категория: " + posit + " болезнь " + bol + name);

        infoTextView.setText(getStringFromRawFile(TextActivity.this));

        // public final void setText() {
        //TextView infoTextView = findViewById(R.id.textbol);
        //infoTextView.setText(getStringFromRawFile(TextActivity.this));
        // }

        /* if (posit==0){
             if (bol ==0);
             int text = R.raw.probtex;

    }*/
        text1 = R.raw.probtex;
    }
    int text = text1;

    private String  getStringFromRawFile(Activity activity) {
        Resources r = activity.getResources();

        InputStream is = r.openRawResource(text);
        String myText = null;
        try {
            myText = convertStreamToString(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  myText;
    }

    private String  convertStreamToString(InputStream is) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int i = is.read();
        while( i != -1)
        {
            baos.write(i);
            i = is.read();
        }
        return  baos.toString();
    }

}
