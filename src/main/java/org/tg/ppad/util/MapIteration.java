package org.tg.ppad.util;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {

    public static void main(String args[]){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("One",2);
        map.put("Three",3);
        map.put("Five",4);
        map.put("Seven",5);
        MapIteration mapIteration = new MapIteration();
        mapIteration.mapIter(map);
    }

    public void mapIter(Map<String,Object> map){
        if(null==map){
            return;
        }
        for(String key : map.keySet()){
            System.out.println("key:"+key+" & Value:"+map.get(key));
        }
    }
}
