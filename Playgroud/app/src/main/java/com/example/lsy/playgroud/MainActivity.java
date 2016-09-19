package com.example.lsy.playgroud;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    //TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set the user interface layout for this Activity
        //The layout file is defined in the project res/layout/activity_main.xml file
        setContentView(R.layout.activity_main);

        // Initialize member TextView so we can manipulate it later
        //mTextView =(TextView) findViewById(R.id.edit_message);

        //make sure we're running on Honeycomb or higher to use ActionBar APIs
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB)
        {
            //for the main activity, make sure the app icon in the action bar
            //does not behave as button
            //ActionBar actionBar = getActionBar();
            //actionBar.setHomeButtonEnabled(false);
        }
    }

    //Called when click the Send button
    public void sendMessage(View view)
    {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);


    }
}
