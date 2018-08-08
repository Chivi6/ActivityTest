package com.example.administrator.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final String str=getIntent().getStringExtra("fdata");
        findViewById(R.id.button_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(secondActivity.this,str,Toast.LENGTH_SHORT).show();
                Intent in = new Intent();
                in.putExtra("sdata","你返回了第一个activity");
                setResult(RESULT_OK,in);
            }
        });
    }
}
