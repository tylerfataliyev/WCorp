package Waters;

import java.util.Arrays;
import java.util.Collections;

public class testNew {

    public static void main(String[] args) {
        String str = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";

        System.out.println(FrequencyOfChars(str));
        System.out.println(frequency(str));

    }

    public static String FrequencyOfChars(String str) {

        String nonDup = "";

        for(int i=0; i < str.length(); i++)

            if(!nonDup.contains(""+str.charAt(i)))

                nonDup+= ""+str.charAt(i);



        String expectedResult = "";

        for( int j=0;j < nonDup.length(); j++) {

            int count = 0;

            for(int i=0; i < str.length(); i++) {

                if(str.charAt(i) == nonDup.charAt(j))

                    count++;

            }

            expectedResult +=nonDup.charAt(j)+"" + count;

        }

        return expectedResult;

    }

    public static String frequency(String str) {

        String nonDup="", result="";

        for(int i=0; i < str.length(); i++)

            if(! nonDup.contains(""+str.charAt(i)))

                nonDup += ""+str.charAt(i);



        for(int i=0; i < nonDup.length(); i++) {

            int num = Collections.frequency( Arrays.asList(str.split("") ) ,    ""+nonDup.charAt( i ) );

            result += ""+nonDup.charAt(i) + num;

        }



        return result;

    }
}
