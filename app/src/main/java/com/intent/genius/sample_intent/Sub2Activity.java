package com.intent.genius.sample_intent;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Sub2Activity extends AppCompatActivity {
    public static String KEY_DATA = "data";
    private String receivedData = null;
    private TextView txtData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);

        txtData = (TextView)findViewById(R.id.txtdata);
        receivedData = getIntent().getStringExtra(KEY_DATA);
        txtData.setText(receivedData);
}
}
