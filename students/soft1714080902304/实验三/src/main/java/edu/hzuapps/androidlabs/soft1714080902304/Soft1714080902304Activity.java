package edu.hzuapps.androidlabs.soft1714080902304;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Soft1714080902304Activity extends AppCompatActivity {


    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soft_1714080902304_activity);

        button = (Button) findViewById(R.id.jihuabiao);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Soft1714080902304Activity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}