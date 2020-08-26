package com.hrio.dubbo_spi;

import com.hrio.dubbo_spi.api.Driver;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;
import java.util.Map;

public class DriverDemoStarter {
    public static void main(String[] args) {
        ExtensionLoader<Driver> extensionLoader = ExtensionLoader.getExtensionLoader(Driver.class);
        Driver driver = extensionLoader.getExtension("trucker");

        URL url = new URL("", "", 0).addParameter("carType", "black");
        driver.driverCar(url);
    }
}
