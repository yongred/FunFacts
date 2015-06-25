package com.yongding.funfacts;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;


public class FunFactsActivity extends Activity {

    private FactsStorage facts = new FactsStorage();;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our View variables and assign the Views from the layout file
        final RelativeLayout RLayout = (RelativeLayout) findViewById(R.id.RLayout);
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button)findViewById(R.id.showFactButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                // update the fact label with a new fact
                String fact = "";
                //Randomly select a fact
                fact = facts.getRandomFacts();
                //new background color
                int bckColor = Color.argb(255, rand.nextInt(256),  rand.nextInt(256),  rand.nextInt(256));
                RLayout.setBackgroundColor(bckColor);
                //update the label with our dynamic fact
                factLabel.setText(fact);
            } // end onclick
        }; // end OnClickListener
        showFactButton.setOnClickListener(listener);
    }   //end onCreate

}
