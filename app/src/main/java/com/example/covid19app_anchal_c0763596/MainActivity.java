package com.example.covid19app_anchal_c0763596;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener


{
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner)findViewById(R.id.spinner);

        ArrayList<String> continent = new ArrayList<>();

        continent.add("North America");
        continent.add("South America");
        continent.add("Europe");
        continent.add("Asia");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,continent);

        spinner.setAdapter(adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
      if (parent.getItemAtPosition(position).equals("Choose Continent"))
      {

      }
      else
      {
          String item = parent.getItemAtPosition(position).toString();

          Toast.makeText(parent.getContext(),"Selected: " +item,Toast.LENGTH_SHORT).show();

          if(parent.getItemAtPosition(position).equals("North America"))
          {
              Intent intent = new Intent(MainActivity.this,item_select.class);
              startActivity(intent);
          }
      }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
