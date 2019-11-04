package behavioralpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Edmond Kacaj
 * @date 11/4/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class UserFollowing implements Follower {

    private List<Follow> follows;
    private String name;
    private String lastName;
    private String feed;

    public UserFollowing(String name, String lastName,String feed) {
        super();
        this.follows = new ArrayList<>();
        this.name = name;
        this.lastName = lastName;
        this.feed=feed;
    }



    @Override
    public void followMe(Follow follow) {
        this.follows.add(follow);
    }

    @Override public void unFollow(Follow follow) {
        System.out.println("Un follow -------------------------");
        this.follows.remove(follow);
    }

    @Override public void notifyMe() {
        System.out.println("Notifying to all followers when we have some news  ");
        for (Follow follow : this.follows) {
            follow.newFeedFromFollowing(this.name + "  " + this.lastName, this.feed);
        }
    }

    public List<Follow> getFollows() {
        return follows;
    }

    public void setFollows(List<Follow> follows) {
        this.follows = follows;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFeed() {
        return feed;
    }

    public void setFeed(String feed) {
        this.feed = feed;
    }
}
