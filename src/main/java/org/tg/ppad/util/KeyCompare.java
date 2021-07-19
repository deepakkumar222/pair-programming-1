package org.tg.ppad.util;

import java.util.ArrayList;
import java.util.List;

public class KeyCompare {

    private static KeyCompare keyCompare = null;

    static {
        keyCompare = new KeyCompare();
    }
    private KeyCompare() { }

    public static KeyCompare getInstance() {
        return keyCompare;
    }


    public static void main(String args[]){
        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        boolean keyFalg = KeyCompare.getInstance().keyFlag(list,"one");
        System.out.println("keyFalg:"+keyFalg);

    }

    public boolean keyFlag( List<String> list ,String key){
        if(null!=list){
            return list.contains(key);
        }
        return false;
    }

}
