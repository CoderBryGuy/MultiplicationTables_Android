package com.example.multiplicationtables_android;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    int[] toTen = new int[10];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SeekBar mySeekBar = (SeekBar)findViewById(R.id.mySeekBar);
        final ListView myListView = (ListView)findViewById(R.id.myListView);

        mySeekBar.setMax(10);
        mySeekBar.setMin(1);
        mySeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                List<Integer> myIntList = new ArrayList<>(i);
                for (int j = 0; j < i; j++) {

                    myIntList.add( i * (j+1));
                }

                ArrayAdapter<Integer> myArrayAdapter = new ArrayAdapter<Integer>(getApplicationContext(), android.R.layout.simple_list_item_1, myIntList);
                myListView.setAdapter(myArrayAdapter);

            }


            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}