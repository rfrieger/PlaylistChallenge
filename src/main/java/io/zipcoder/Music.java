package io.zipcoder;

import javax.swing.text.MutableAttributeSet;
import java.util.Arrays;

public class Music {

    private String[] playList;
    int result;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {

        int selectionIndex = 0;

        for (int i = 0; i < playList.length; i++)
            if (playList[i] == selection) {
                selectionIndex = i;
            }

         int up = Math.abs(selectionIndex - startIndex);
         int wrap = playList.length - up;

         if(up > wrap) {
             return wrap;
         } else {
            return up;
         }

    }//end of method
}



//   1 2 3 4 5 6
//     i       s