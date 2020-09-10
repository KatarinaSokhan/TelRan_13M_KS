package de.telran.data;

public class Camera {
    private boolean isFullFrame;
    private String brand;
    private int yearOfAssembling;
    private String model;

    public boolean isFullFrame() {
        return isFullFrame;
    }

    public void setFullFrame(boolean fullFrame) {
        isFullFrame = fullFrame;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfAssembling() {
        return yearOfAssembling;
    }

    public void setYearOfAssembling(int yearOfAssembling) {
        this.yearOfAssembling = yearOfAssembling;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "isFullFrame=" + isFullFrame +
                ", brand='" + brand + '\'' +
                ", yearOfAssembling=" + yearOfAssembling +
                ", model='" + model + '\'' +
                '}';
    }
}
