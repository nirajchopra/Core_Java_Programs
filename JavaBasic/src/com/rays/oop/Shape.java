package com.rays.oop;

public class Shape {
    private String color = null;
    private int borderWidth = 0; // Corrected variable name
    
    public int getBorderWidth() { // Corrected method name
        return borderWidth;
    }
    
    public void setBorderWidth(int bw) { // Corrected method name and parameter name
        borderWidth = bw;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
}
