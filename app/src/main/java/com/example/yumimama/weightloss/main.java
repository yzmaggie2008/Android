package com.example.yumimama.weightloss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by yumimama on 1/16/18.
 */

public class main extends Activity{
    private static final String[] items = new String[] {
        "User Information", "History", "Record", "Setting"
    };

    private  ListView lv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        //set the ListView
        ListAdapter theAdapter = new ArrayAdapter<String>(this, R.layout.simple_item, items);

        ListView  lv = (ListView) findViewById(R.id.lv);
        lv.setAdapter(theAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(main.this, user_information.class));
                        break;
//                    case 1:
//                        startActivity(new Intent(main.this, history.class));
//                        break;

                }
            }
        });

    }

}
