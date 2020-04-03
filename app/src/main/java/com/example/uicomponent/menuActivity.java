package com.example.uicomponent;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


public class menuActivity extends MainActivity
{
    TextView textView;
    @Override
    protected  void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);
        textView=findViewById(R.id.testContent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        this.getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {
        switch (menuItem.getItemId())
        {
            case R.id.small:
                textView.setTextSize(10*2);
                break;

            case R.id.middle:
                textView.setTextSize(16*2);
                break;

            case R.id.large:
                textView.setTextSize(20*2);
                break;
            case R.id.common:
                Toast.makeText(menuActivity.this, "这是普通菜单项", Toast.LENGTH_SHORT).show();
                break;
            case R.id.red:
                textView.setTextColor(Color.RED);
                break;
            case R.id.black:
                textView.setTextColor(Color.BLACK);
                break;
        }
        return true;
    }
}
