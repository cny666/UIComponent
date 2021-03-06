package com.example.uicomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.Gravity;

import android.view.View;
import android.widget.AdapterView;

import android.widget.ListView;
import android.widget.SimpleAdapter;

import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {


    private String[] Animal=new String[]{"Lion", "Tiger", "Monkey", "Dog","Cat"};
    private int[] images=new int[]{R.drawable.lion,R.drawable.tiger,R.drawable.monkey,R.drawable.dog,R.drawable.cat};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout);
        List<Map<String,Object>> items=new ArrayList<>();

        for(int i=0;i<images.length;i++)
        {
            Map<String, Object> listItem = new HashMap<>();
            listItem.put("Animal",Animal[i]);
            listItem.put("Image",images[i]);
            items.add(listItem);
        }

        SimpleAdapter simpleAdapter=new SimpleAdapter(this,items,R.layout.
                listitem_layout,new String[]{"Animal","Image"},new int[]{R.id.TextView,R.id.ImageView});
        ListView listView=findViewById(R.id.ListView);
        listView.setAdapter(simpleAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id)
            {
                Toast toast=Toast.makeText(MainActivity.this,Animal[position],Toast.LENGTH_SHORT    );
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });

    }
}
