package com.example.ahn.synthsizer;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Ahn on 2016. 11. 20..
 */

public class GuitarActivity extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guitar);
    }

    public void lineClick(View view){
        switch (view.getId()){
            case R.id.line1:
                Toast.makeText(this, view.getId()+"클릭", Toast.LENGTH_SHORT).show();
                break;
            case R.id.line2:
                Toast.makeText(this, view.getId()+"클릭", Toast.LENGTH_SHORT).show();
                break;
            case R.id.line3:
                Toast.makeText(this, view.getId()+"클릭", Toast.LENGTH_SHORT).show();
                break;
            case R.id.line4:
                Toast.makeText(this, view.getId()+"클릭", Toast.LENGTH_SHORT).show();
                break;
            case R.id.line5:
                Toast.makeText(this, view.getId()+"클릭", Toast.LENGTH_SHORT).show();
                break;
            case R.id.line6:
                Toast.makeText(this, view.getId()+"클릭", Toast.LENGTH_SHORT).show();
                break;

        }

    }
}
