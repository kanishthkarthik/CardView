package com.example.kanishth.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardArrayAdapter;
import it.gmariotti.cardslib.library.internal.CardHeader;
import it.gmariotti.cardslib.library.view.CardListView;
import it.gmariotti.cardslib.library.view.CardView;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);



        ArrayList<Card> cards = new ArrayList<Card>();

        //Create a Card
        Card[] card= new Card[10];
        CardHeader header = new CardHeader(this);

        for(int i = 0;i<10;i++)
        {
            card[i]= new Card(this);
            //Add Header to card
            card[i].addCardHeader(header);
            cards.add(card[i]);
        }

        CardArrayAdapter mCardArrayAdapter = new CardArrayAdapter(this,cards);

        CardListView listView = (CardListView) this.findViewById(R.id.myList);
        if (listView!=null)
        listView.setAdapter(mCardArrayAdapter);




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
