package com.algorithm.bj.a0000;

/**
 * @author HunSeol
 * @created_date 2017. 11. 8.
 * @IDE IntelliJ IDEA
 */

import java.util.ArrayList;
import java.util.List;

class IsSortedAlgorithm {
    public static void main(String[] args) {
        List<NumberType> numberTypes = new ArrayList<>();

        numberTypes.add(new NumberType(new int[]{1, 2, 3}));
        numberTypes.add(new NumberType(new int[]{2, 1}));
        numberTypes.add(new NumberType(new int[]{1,4,2,5,3}));
        numberTypes.add(new NumberType(new int[]{2,4,5,5,6}));
        numberTypes.add(new NumberType(new int[]{1,1,1,2,3}));
        numberTypes.add(new NumberType(new int[]{4,4,4,4,3,3,3}));
        numberTypes.add(new NumberType(new int[]{3,1}));
        numberTypes.add(new NumberType(new int[]{0,5}));
        numberTypes.add(new NumberType(new int[]{0,0,0,0,1}));
        numberTypes.add(new NumberType(new int[]{0,0,0,3,0,5,0,6,4,0,1}));
        numberTypes.add(new NumberType(new int[]{9,9,9,9,9,9,9,9,9,9,9,9,9,0}));
        numberTypes.add(new NumberType(new int[]{1,2,3,4,3,2,1}));

        int index = 1;
        for (NumberType n: numberTypes) {
            n.getOrderFromData(0);
            n.printResult(index);
            index++;
        }

    }
}