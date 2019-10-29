package behavioralpattern.mediatorpattern;

import behavioralpattern.mediatorpattern.taxi.*;

/**
 * @author Edmond Kacaj
 * @date 10/28/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 *
 * A Radio Taxi is an example of the Mediator pattern.
 * The taxi drivers communicate with the Mediator (Radio Taxi Call Center), rather than with each other.
 * Let imagine we need to create a system to make possible to use all companies like : UBER,DEUTSCH,INTERNATIONAL
 * and we need to make a system to connect all those other system to communicate together
 *
 * When a customer needs a taxi, he calls the Radio Taxi Call Center.
 * All taxis have GPS units, which tell the Radio Taxi Call Center the taxis' current locations.
 * there is also a central information system, which tells which taxi is currently available to serve the customer.
 * The call center will contact the available taxi nearest to customer’s location and send it to serve the customer.
 *
 *
 */
public class ClientMainClass {


    public static void main(String[] args) {

        Dispatcher dispatcher=new ConcreteDispatcher();
        // add taxi
        TaxiInfo taxiUBER=new TaxiInfo("TAXI UBER ","is not free",false);
        TaxiInfo taxiDEUTSCH=new TaxiInfo("TAXI DEUTSCH ","is not free",false);
        TaxiInfo taxiINTERNATIONAL=new TaxiInfo("TAXI INTERNATIONAL ","is  free",true);

        BaseDis client=new ClientMessage(taxiUBER,dispatcher);

        BaseDis taxUber=new TaxiUber(taxiUBER,dispatcher);
        BaseDis taxDeutsch=new TaxiDeutsch(taxiDEUTSCH,dispatcher);
        BaseDis taxInternacional=new TaxiInternational(taxiINTERNATIONAL,dispatcher);

       dispatcher.registerTaxi(client);
       dispatcher.registerTaxi(taxUber);
       dispatcher.registerTaxi(taxDeutsch);
       dispatcher.registerTaxi(taxInternacional);

        System.out.println("------ CLIENT SEND MESSAGE-----------");
       client.sendMessage();
        System.out.println("-------------------------------------");

        System.out.println("------ UBER DISPATCHER SEND MESSAGE-----------");
        taxUber.sendMessage();
        System.out.println("-------------------------------------");

        System.out.println("------ DEUTSCH DISPATCHER SEND MESSAGE-----------");
        taxDeutsch.sendMessage();
        System.out.println("-------------------------------------");

        System.out.println("------ INTERNATIONAL DISPATCHER SEND MESSAGE-----------");
        taxInternacional.sendMessage();
        System.out.println("-------------------------------------");

    }

}
