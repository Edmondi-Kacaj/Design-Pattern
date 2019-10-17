package behavioralpattern.chainresponsibilitypattern;

import behavioralpattern.chainresponsibilitypattern.Offices.BerlinPostOffice;
import behavioralpattern.chainresponsibilitypattern.Offices.HannoverPostOffice;
import behavioralpattern.chainresponsibilitypattern.Offices.TiranePostOffice;

/**
 * @author Edmond Kacaj
 * @date 10/17/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 * <p>
 * Let's take a example we want a program for a post company,
 * this company want to create a program to send the package in different city,
 * in base of city name in package
 */
class ClientMainClassChain {

    public static void main(String[] args) {

        // so lets create some packages
        Package berlin = new Package("Play Station", " BerlinaStrasse 4 , Berlin");
        Package hannover = new Package(" TV  samsung  ", " LuisenStresse 4 , Hannover");
        Package tirane =
            new Package(" TV  samsung Smart  ", " TiraneRruga e Dibres 45, Tirane  Albania ");

        // now lets create the Object
        PostI berlinOffice = new BerlinPostOffice();
        PostI hannoverOffice = new HannoverPostOffice();
        PostI tiraneOffice = new TiranePostOffice();

        berlinOffice.setNext(hannoverOffice);
        hannoverOffice.setNext(tiraneOffice);

        // lets send package now
        berlinOffice.process(berlin);
        berlinOffice.process(hannover);
        berlinOffice.process(hannover);
        berlinOffice.process(berlin);
        berlinOffice.process(tirane);



    }
}
