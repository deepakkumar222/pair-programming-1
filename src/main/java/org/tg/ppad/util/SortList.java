package org.tg.ppad.util;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.tg.ppad.bean.SortListBean;

import java.util.*;

public class SortList {

    public static void main(String args[]){
        Set<SortListBean> set = new HashSet<SortListBean>();
        set.add(SortListBean.builder().name("Two").seq(2).build());
        set.add(SortListBean.builder().name("Three").seq(3).build());
        set.add(SortListBean.builder().name("One").seq(1).build());
        set.add(SortListBean.builder().name("Four").seq(4).build());
        set.add(SortListBean.builder().name("Zero").seq(0).build());
        set.add(SortListBean.builder().name("Eleven").seq(11).build());

        System.out.println("provided set:"+set);
        System.out.println("*****************************");

        set.stream().sorted((e1,e2) -> Integer.compare(e1.getSeq(),e2.getSeq()));
        System.out.println("Seq sorted set:"+set);

        System.out.println("______________________________");



    }

}
