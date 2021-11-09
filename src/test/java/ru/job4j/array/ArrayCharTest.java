package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixTHenTrue(){
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startWith(word, pref);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar.startWith(word, pref);
        Assert.assertFalse(result);
    }
}