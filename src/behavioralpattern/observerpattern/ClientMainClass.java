package behavioralpattern.observerpattern;

import behavioralpattern.observerpattern.followers.PersonFollow;

/**
 * @author Edmond Kacaj
 * @date 11/4/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 * <p>
 * Let's try to make a application like instagram.
 * we have a person Vip Call Adriano Celentano
 * and we have some user wich follow Adriano
 * and we now if you follow someone all news from this person are show in our profile
 * so we follow Adriano Celentano and after let's say Adriano publish news feed
 */
public class ClientMainClass {
    public static void main(String[] args) {

        Follow edmond = new PersonFollow("Edmond Kacaj");
        Follow arjan = new PersonFollow("Arjan Kacaj");
        Follow jenny = new PersonFollow("Jenny Jenny");

        UserFollowing vipCelentano = new UserFollowing("Adriano ", "Celentano");

        // edmond,Arjan and Jeny follow Adriano Celentano
        vipCelentano.followMe(edmond);
        vipCelentano.followMe(arjan);
        vipCelentano.followMe(jenny);

        // adriano add new feed
        vipCelentano.setFeed(" Today i have a new concert in Milano");

        vipCelentano.notifyMe();

        // let's say edmond unfollow adriano
        vipCelentano.unFollow(edmond);

        vipCelentano.notifyMe();



    }
}
