package com.antariksh.googlesearchapp;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);    // Layout Passing

        editText = (EditText) findViewById(R.id.searchBox);
    }

    public void onButtonClick(View v){

        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);  // perfom web search
        String keywords = editText.getText().toString();       // get keyword from search box
        intent.putExtra(SearchManager.QUERY, keywords);        // using intent object for query
        startActivity(intent);
    }
}
