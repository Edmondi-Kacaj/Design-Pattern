package behavioralpattern.chainresponsibilitypattern;

/**
 * @author Edmond Kacaj
 * @date 10/18/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public interface PostI {
    void setNext(PostI nextInChain);

    void process(Package request);
}
