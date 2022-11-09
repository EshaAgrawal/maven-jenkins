package com.maven.examples;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void test_junit(){
        String s1 = "I do not match expected";
        String s2 = "This is test case in class";
        assertEquals("This is test case in class", s1);

    }
}
