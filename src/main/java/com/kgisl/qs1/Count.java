package com.kgisl.qs1;

/**
 * Count
 */
public class Count {

    public static void main(String[] args) {
        
        String a="my name is kavin";
        String sresult;
        int wordcount=a.length;
        sresult=wordcount + " Words";

        for(int i=0;i<a.length;i++)
        {
            String r=sresult[i];
            sresult=sresult +r.length+" Letters";
        }
    }
}