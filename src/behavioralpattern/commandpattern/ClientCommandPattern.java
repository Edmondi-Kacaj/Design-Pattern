package behavioralpattern.commandpattern;

import behavioralpattern.commandpattern.devices.TurnOnTVCommand;
import behavioralpattern.commandpattern.devices.TvClass;
import behavioralpattern.commandpattern.lights.Light;
import behavioralpattern.commandpattern.lights.bedroom.LightOffBedRoom;
import behavioralpattern.commandpattern.lights.bedroom.LightOnBedRoom;

/**
 * @author Edmond Kacaj
 * @date 10/21/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 *
 * Let's get a example , we want to make a home automation , and we want to create a remote application
 * to turn on/off light ,play cd in cd player
 * etc.
 *
 *
 */
public class ClientCommandPattern {

    public static void main(String[] args) {
        // init Remote control
        RemoteControl remoteControl= new RemoteControl();

        // add add Light to bed room
        Light lightBed=new Light("Bed Room");
        LightOnBedRoom lightOnBedRoomBed=new LightOnBedRoom(lightBed);
        LightOffBedRoom lightOffBedRoomBed=new LightOffBedRoom(lightBed);


        // add add Light to bed room
        Light lightLiving=new Light("Living Room");
        LightOnBedRoom lightOnLiving=new LightOnBedRoom(lightLiving);
        LightOffBedRoom lightOffLiving=new LightOffBedRoom(lightLiving);

        // turn on tv
        TvClass tvClass=new TvClass();
        TurnOnTVCommand turnOnTVCommand=new TurnOnTVCommand(tvClass);
        TurnOnTVCommand turnOffTVCommand=new TurnOnTVCommand(tvClass);


        /// remote control press


        System.out.println("========================= Bed Room ========================");

        remoteControl.setDevice(lightOnBedRoomBed);
        remoteControl.pressPowerButton();
        remoteControl.setDevice(lightOffBedRoomBed);
        remoteControl.pressPowerButton();
        System.out.println("===========================================================");

        System.out.println("========================= Living Room ========================");

        remoteControl.setDevice(lightOnLiving);
        remoteControl.pressPowerButton();
        remoteControl.setDevice(lightOnLiving);
        remoteControl.pressPowerButton();
        System.out.println("===========================================================");


        System.out.println("========================= Turn on of TV ========================");

        remoteControl.setDevice(turnOnTVCommand);
        remoteControl.pressPowerButton();
        remoteControl.setDevice(turnOffTVCommand);
        remoteControl.pressUpButton();
        System.out.println("===========================================================");




    }

}
