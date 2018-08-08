package com.example.administrator.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class firstActivity extends AppCompatActivity {
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylayout);

        Button but1 = findViewById(R.id.button_1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(firstActivity.this,str,Toast.LENGTH_SHORT
                ).show();
            }
        });
        findViewById(R.id.button_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(firstActivity.this,secondActivity.class);
                startActivity(in);
            }
        });
        findViewById(R.id.button_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent("com.example.administrator.activitytest.ACTION_START");
                in.addCategory("com.example.administrator.activitytest.MY_CATEGORY");
                in.putExtra("fdata","打开了secondactivity");
                startActivityForResult(in,1);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode==1&resultCode==RESULT_OK){
            str=data.getStringExtra("sdata");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add:
                Toast.makeText(this,"你为什么要点这个按钮",Toast.LENGTH_SHORT).show();
                        break;
            case R.id.remove:
                Toast.makeText(this,"按下去很好玩么",Toast.LENGTH_SHORT).show();
                        break;
                        default:
        }
        return true;
    }
}
