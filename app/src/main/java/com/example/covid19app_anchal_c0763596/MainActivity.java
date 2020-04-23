package com.example.covid19app_anchal_c0763596;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

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
        //if (parent.getId() == R.id.spinner)
       // {
         //   String valuefromSpinner = parent.getItemAtPosition(position.toString());
        //}
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
