package de.telran.application;

import de.telran.data.Camera;

public class CameraApplication {
    public static void main(String[] args) {
        Camera cannonD600 = new Camera();
        cannonD600.setBrand("cannon");
        cannonD600.setYearOfAssembling(2000);
        cannonD600.setFullFrame(false);
        cannonD600.setModel("cannon d600");

        System.out.println(cannonD600);
    }
}
