package com.bulbulhossen.listviewandfragmentwithanimation;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //change code
        // String[] str = getResources().getStringArray(R.array.joshim_kobita_listName);
        //change code


        //  final CustomAdapter adapter = new CustomAdapter(getContext(), android.R.id.text1, str);

        String [] strings= getResources().getStringArray(R.array.name);


       // String[] str = {"মেঘের পরে মেঘ জমেছে", "সোনার তরী", "এসো হে বৈশাখ এসো এসো", "যাবার দিন", "আসমান", "খুকির সম্পত্", "আমার বাড়", "রূপাই", "নক্সী কাঁথার মাঠ", "পাখির ছানা", "এত হাসি কোথায় পেলে", "মেঘের পরে মেঘ জমেছে", "সোনার তরী", "এসো হে বৈশাখ এসো এসো", "যাবার দিন", "আসমান", "খুকির সম্পত্", "আমার বাড়", "রূপাই", "নক্সী কাঁথার মাঠ", "পাখির ছানা", "এত হাসি কোথায় পেলে"};


        final CustomAdapter adapter = new CustomAdapter(getApplicationContext(), android.R.id.text1, strings);

        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        Intent intent = new Intent(MainActivity.this, Aother_activity.class);
                        startActivity(intent);
                        break;

                }


            }
        });


    }


}
