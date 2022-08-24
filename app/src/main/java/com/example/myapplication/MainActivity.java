package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView wv;
    String [] URLs={"https://www.washingtonpost.com","https://www.nytimes.com","https://www.reddit.com"};
    int url_number = 0; //start with frst string
    private void load_next_page() {
        wv.loadUrl(URLs[url_number]);
        url_number=(url_number+1)%URLs.length;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get a handle to the widget in the UI
        wv=(WebView)findViewById(R.id.wv1);

        //go to the first page
        load_next_page();
    }

    public void doClick(View view) {
        load_next_page();
    }
}