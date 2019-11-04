package behavioralpattern.observerpattern.followers;

import behavioralpattern.observerpattern.Follow;

/**
 * @author Edmond Kacaj
 * @date 11/4/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class PersonFollow implements Follow {

    private String personName;

    public PersonFollow(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Override public void newFeedFromFollowing(String person, String feed) {
        System.out.println(String
            .format("Hello  %1$s,  %2$s  you follow had new feed ::  %3$s   ", this.personName,
                person, feed));
    }
}
