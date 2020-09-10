package de.telran.application;

import de.telran.data.Camera;

public class CameraApplication {
    public static void main(String[] args) {
        Camera cannonD600 = new Camera();
        cannonD600.setBrand("cannon");
        cannonD600.setYearOfAssembling(2000);
        cannonD600.setFullFrame(false);
        cannonD600.setModel("cannon d600");

        Camera cannonD6 = new Camera();
        cannonD6.setModel("cannonD6");
        cannonD6.setFullFrame(true);
        cannonD6.setYearOfAssembling(2006);
        cannonD6.setBrand("cannon");

        System.out.println(cannonD6);
        System.out.println(cannonD600);
    }
}
