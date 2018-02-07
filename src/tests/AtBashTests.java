package tests;

import AtBashCode.*;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AtBashTests {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    AtBash basher; // set up uninitialized basher for testing

    @Test
    public void testAtBashExampleOne(){
        //we will use the examples given from:
        //https://gist.github.com/EdwinRozario/f41ab165969f2afce42d388379b26a03
        //to test our basher

        basher = new AtBash("abcdefghijklmnopqrstuvwxyz","zodvqukgwefbyitmrsplhacxnj");
        assertTrue(basher.decode("dzs").equals("car"));

    }

    @Test
    public void testAtBashExampleTwo(){
        //we will use the examples given from:
        //https://gist.github.com/EdwinRozario/f41ab165969f2afce42d388379b26a03
        //to test our basher

        basher = new AtBash("abcdefghijklmnopqrstuvwxyz","xipmuzfkbrlwotjancqgveshdy");
        assertTrue(basher.decode("skd qj qucbjvq?").equals("why so serious?"));

    }
    

}