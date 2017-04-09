package com.example.ayaan.booklisting;

import android.app.LoaderManager;
import android.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;

import org.w3c.dom.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BookActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<Book>> {
    //private String enteredtext;
    private EditText enteredtext;
    private Button search;
    private String text;
    public String book_url;
    public BookAdapter booklist;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enteredtext = (EditText)findViewById(R.id.enteredtext);
        search = (Button)findViewById(R.id.search);
        text = enteredtext.getText().toString();
        progressBar = (ProgressBar)findViewById(R.id.progress);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if(text.isEmpty()){
//                    enteredtext.setError("Empty");
//                }
//                else {
                progressBar.setVisibility(View.VISIBLE);
                String urltosearch =enteredtext.getText().toString().trim();
                    book_url = "https://www.googleapis.com/books/v1/volumes?q="+urltosearch;
                    LoaderManager loaderManager = getLoaderManager();
                //Log.e("")
                    loaderManager.initLoader(1,null,BookActivity.this);
                    //loaderManager.restartLoader(0,null,BookActivity.this);
                    Log.e("Netwok","Connected");

            }
        });
        ListView books = (ListView)findViewById(R.id.list);
        booklist = new BookAdapter(this,new ArrayList<Book>());
        books.setAdapter(booklist);
    }



    @Override
    public Loader<List<Book>> onCreateLoader(int id, Bundle args) {
        return new BookLoader(this,book_url);
    }

    @Override
    public void onLoadFinished(Loader<List<Book>> loader, List<Book> data) {
        progressBar.setVisibility(View.GONE);
        booklist.clear();
        booklist.addAll(data);
    }

    @Override
    public void onLoaderReset(Loader<List<Book>> loader) {
        booklist.clear();
    }
}
