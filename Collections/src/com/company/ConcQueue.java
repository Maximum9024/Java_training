package com.company;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcQueue {
    public static void main(String[] args) {

        ConcurrentLinkedDeque<Integer> Lotto= new ConcurrentLinkedDeque<>();

        Lotto.add(12);
        Lotto.add(40);
        Lotto.add(23);
        Lotto.add(15);
        Lotto.add(27);
        Lotto.add(39);
        Lotto.add(43);
        Lotto.add(23);
        Lotto.add(35);
        Lotto.add(10);
        Lotto.add(8);
        Lotto.add(8);
        Lotto.add(17);
        System.out.println(Lotto);
    }
}
