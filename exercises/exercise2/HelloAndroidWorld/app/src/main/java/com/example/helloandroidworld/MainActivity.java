package com.example.helloandroidworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textview);
        updateWelcomeMessage();

        Button button = (Button) findViewById(R.id.hello_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello " + getUsername() + "!", Toast.LENGTH_SHORT).show();
            }
        });

        // TODO: create a Button starting another Activity to change the username
    }

    private String getUsername() {
        // TODO: somehow store changes to the username
        return getResources().getString(R.string.default_user_name);
    }

    private void updateWelcomeMessage() {
        textView.setText(getUsername() + " says hello to the Android World!");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO: react on result from the activity where we changed the user name

        // example usage of Logger
        Log.d(TAG, "onActivityResult not implemented yet!");
    }
}
