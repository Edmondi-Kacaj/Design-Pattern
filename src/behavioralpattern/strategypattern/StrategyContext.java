package behavioralpattern.strategypattern;

import behavioralpattern.strategypattern.operators.BubbleSort;

import java.util.List;

/**
 * @author Edmond Kacaj
 * @date 11/5/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class StrategyContext {

    private Strategy strategy;

    public StrategyContext() {
        this.strategy = new BubbleSort();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }


    public void execute(List<Integer> list) {
        this.strategy.doOperator(list);
    }

}
