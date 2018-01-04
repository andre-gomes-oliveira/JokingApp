package br.com.udacity.jokegenerator;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class JokerTest {

    //Testing the the library is returning a non-empty string
    @Test
    public void getJoke() throws Exception  {
        assertFalse(Joker.getJoke().isEmpty());
    }
}
