package behavioralpattern.strategypattern.operators;

import behavioralpattern.strategypattern.Strategy;

import java.util.Collections;
import java.util.List;

/**
 * @author Edmond Kacaj
 * @date 11/5/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class BubbleSort implements Strategy {

    @Override public void doOperator(List<Integer> list) {
        Collections.sort(list);
        System.out.println("--- Bubble Sort ------");
        list.forEach(System.out::print);
        System.out.println();

    }
}
