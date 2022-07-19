package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView simpleListView;

    String courseList[]={"Science","Maths","History","English","Geography"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleListView=findViewById(R.id.simpleListView);

        ArrayAdapter <String> arrayAdapter=new ArrayAdapter<String>(MainActivity.this, R.layout.itemlist,R.id.itemTextView,courseList);
        simpleListView.setAdapter(arrayAdapter);
    }
}