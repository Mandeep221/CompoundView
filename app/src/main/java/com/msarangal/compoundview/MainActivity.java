package com.msarangal.compoundview;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    HelloCompoundView helloCompoundViewOne, helloCompoundViewTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helloCompoundViewOne = (HelloCompoundView) findViewById(R.id.view1);
        helloCompoundViewTwo = (HelloCompoundView) findViewById(R.id.view2);
        helloCompoundViewOne.setValueColor(ContextCompat.getColor(this, R.color.colorPrimary));
        helloCompoundViewTwo.setValueColor(ContextCompat.getColor(this, R.color.colorAccent));
        helloCompoundViewOne.setImageVisible(true);
        helloCompoundViewOne.setImageResource(R.drawable.gift_blue);
        helloCompoundViewTwo.setImageVisible(true);
        helloCompoundViewTwo.setImageResource(R.drawable.gift);
    }

    public void onClicked(View view) {
        String text = view.getId() == R.id.view1 ? "Background" : "Foreground";
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
