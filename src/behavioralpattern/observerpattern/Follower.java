package behavioralpattern.observerpattern;

/**
 * @author Edmond Kacaj
 * @date 11/4/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public interface Follower {
    /**
     * method to follow a person or user
     *
     * @param follow
     */
    void followMe(Follow follow);

    /**
     * method to unFollow a person or user
     *
     * @param follow
     */
    void unFollow(Follow follow);

    /**
     * this method will add to all users which follow this person
     */
    void notifyMe();

}
