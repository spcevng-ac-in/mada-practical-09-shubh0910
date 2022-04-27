package com.example.practical_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        item.getItemId();
        TextView tv=findViewById(R.id.tv);
        //noinspection SimplifiableIfStatement
        switch(item.getItemId()){
            case R.id.copy:

                tv.setText("copy");
                return true;
            case R.id.paste:
                tv.setText("paste");
                return true;
            case R.id.move:
                tv.setText("move");
                return true;

            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }

}