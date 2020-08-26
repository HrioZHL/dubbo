package com.hrio.dubbo_spi.api;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;


@SPI// @SPI注解表示这个接口需要被扩展，通过@SPI(value = "black")可以指定默认的实现类
public interface Car {

    @Adaptive(value = "carType")
    void getColor(URL url);

}
