package com.gareth;

import java.util.ArrayList;

/**
 * Created by gareth on 03/04/2017.
 */
public class Questions {

    public static boolean hasOnlyUniqueCharactersArrayList(String s) {
        ArrayList<Character> seenChars = new ArrayList<Character>(s.length());

        for (int i = 0; i < s.length(); i++) {
            if (seenChars.contains(new Character(s.charAt(i)))) {
                return false;
            } else {
                seenChars.add(s.charAt(i));
            }

        }
        return true;
    }


}
