package me.yaimsputnik5.utils;

public class SystemSpecs {
    public String getOperatingSystem() {
        // System.out.println("Using System Property: " + os);
        return System.getProperty("os.name");
    }
}
