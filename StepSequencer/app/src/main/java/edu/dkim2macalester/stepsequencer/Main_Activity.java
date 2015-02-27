package edu.dkim2macalester.stepsequencer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

public class Main_Activity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_layout);

        int gridWidth = 16;
        int gridHeight = 16;

        //Object gridModel[][] = new gridSquare[gridWidth][gridHeight];
        final gridSquare gridModel[] = new gridSquare[gridWidth*gridHeight];
        //only do stuff with the items in grid model after they are altered - all start out being
        //unpressed - all need to do is initialise

        for(int i = 0; i < gridWidth*gridHeight; i++) {
            gridSquare square = new gridSquare();
            gridModel[i] = square;
        }

        //Set up the gridview
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));
        //Set up the gridview logic
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                //change images from not_selected.png to selected0.png (lighter to darker grid cell)
                ((ImageView) v).setImageResource(R.drawable.selected0);
                 gridModel[position].pressed();
            }

            //play/pause button dynamics
            public void play(View v) {
                int i = 0;
                for (final gridSquare square : gridModel) {
                    if (square.getSelected()){ //if true then it has been pressed
                        ArrayList<Integer> values = new ArrayList<Integer>();
                        values.add(i); //gets list of all the coordinates
                        //call here function to compile sounds, passing in list with coords
                    }
                    i++;
                }
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_grid__layout, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
