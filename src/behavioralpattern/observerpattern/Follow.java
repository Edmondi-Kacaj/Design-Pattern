package behavioralpattern.observerpattern;

/**
 * @author Edmond Kacaj
 * @date 11/4/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public interface Follow {
    /**
     * This method is a method when all user can see the new feed from , person they are following
     *
     * @param feed new feed from following Person
     */
    void newFeedFromFollowing(String person, String feed);
}
