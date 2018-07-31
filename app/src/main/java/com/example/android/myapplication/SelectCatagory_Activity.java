package com.example.android.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

public class SelectCatagory_Activity extends AppCompatActivity {

    ListView listView;
    String activities[]={"Automobiles","Electronics","Real Estate","Tourism and Hospitality","Machinery","Information Technology","Vacancy","Education & Scholarships","Foreign Employment","Services"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_catagory_);

//        ListView listView = findViewById(R.id.listView);
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,activities);
//        listView.setAdapter(arrayAdapter);

        listView = findViewById(R.id.listView);
        ShowCatagories showCatagories = new ShowCatagories(this,activities);
        listView.setAdapter(showCatagories);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.select_catagory, menu);
        return true;

//        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.Continue:
                Intent intent = new Intent(SelectCatagory_Activity.this,HomeActivity.class);
                startActivity(intent);

                default:
                    return super.onOptionsItemSelected(item);
        }
    }
}
