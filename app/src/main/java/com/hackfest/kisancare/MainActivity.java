package com.hackfest.kisancare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
        EditText name = (EditText) findViewById(R.id.Name);
        EditText number = (EditText) findViewById(R.id.Mobile);
        EditText state = (EditText) findViewById(R.id.state);
        EditText dist = (EditText) findViewById(R.id.district);
        EditText area = (EditText) findViewById(R.id.Name);
        Log.i("name", name.getText().toString());
        Log.i("number", number.getText().toString());
        Toast.makeText(MainActivity.this, "hi there!", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
