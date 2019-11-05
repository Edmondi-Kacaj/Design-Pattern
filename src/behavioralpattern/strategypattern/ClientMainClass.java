package behavioralpattern.strategypattern;

import behavioralpattern.strategypattern.operators.InsertionSort;
import behavioralpattern.strategypattern.operators.SelectionSort;

import java.util.Arrays;
import java.util.List;

/**
 * @author Edmond Kacaj
 * @date 11/5/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 * <p>
 * Let's say we want to make a sorting algorithm app and in base of what input or what the client we need to sort a list with number in :
 * Bucket sort
 * Bubble sort
 * Insertion sort
 * Selection sort
 * Heapsort
 * Mergesort
 */
public class ClientMainClass {

    public static void main(String[] args) {

        // context
        StrategyContext strategyContext = new StrategyContext();

        // create a list
        List<Integer> numbers = Arrays.asList(1, 2, 45, 6, 7, 8, 9, 0, 12, 11, 13);

        strategyContext.execute(numbers);

        // add Insertion Sort
        strategyContext.setStrategy(new InsertionSort());
        strategyContext.execute(numbers);

        // add Selection Sort
        strategyContext.setStrategy(new SelectionSort());
        strategyContext.execute(numbers);


    }
}
