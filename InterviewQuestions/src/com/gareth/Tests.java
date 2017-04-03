package com.gareth;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by gareth on 03/04/2017.
 */
public class Tests {


    @Test
    public void testUnique() {
        assertTrue(Questions.hasOnlyUniqueCharactersArrayList("fol"));
    }

    @Test
    public void testNonUnique() {
        assertFalse(Questions.hasOnlyUniqueCharactersArrayList("fff"));
    }
}
