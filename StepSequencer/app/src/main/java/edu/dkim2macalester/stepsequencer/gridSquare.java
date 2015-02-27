package edu.dkim2macalester.stepsequencer;


/**
 * Created by mju on 2/20/2015.
 *
 * Squares in the grid are of this class. Remembers where the square is in the grid and whether
 * or not it's selected.
 *
 * based on code from http://stackoverflow.com/questions/10254748/how-to-extend-an-android-button-and-use-an-xml-layout-file
 * and http://stackoverflow.com/questions/25563802/android-extends-button-accessing-members-from-java-to-xml
 * the latter is especially helpful. see answer by chjarder.
 */
public class gridSquare extends Object{

    long id;
    private boolean selected = false;  //whether or not it's been pressed
    //private int timestamp; //x coordinate - what time it plays at
    //private int yCoord;    //y coordinate - what pitch it has/what sound it is


    public void pressed() {
        this.selected = !this.selected; //swaps state when clicked
    }

    /*public void setID(long id){
        this.id = id;
    } //dunno if we'll need this but keeping it in just in case

    public void setTimestamp(int timestamp){
        this.timestamp = timestamp;
    }

    public void setyCoord(int yCoord){
        this.yCoord = yCoord;
    }*/

    public boolean getSelected(){
        return this.selected;
    }

}
