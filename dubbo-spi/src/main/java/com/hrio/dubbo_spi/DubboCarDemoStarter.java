package com.hrio.dubbo_spi;

import com.hrio.dubbo_spi.api.Car;
import org.apache.dubbo.common.extension.ExtensionLoader;

public class DubboCarDemoStarter {
    public static void main(String[] args) {
        // 每个接口对应一个ExtensionLoader扩展加载器
        ExtensionLoader<Car> extensionLoader = ExtensionLoader.getExtensionLoader(Car.class);
        Car redCar = extensionLoader.getExtension("red"); //name如果传true的话，则使用默认的实现类
        // 从扩展点加载器中获取实现类的流程
        // 名字--文件--实现类--对象--依赖注入--AOP--得到一个完整的对象
        // 文件：读文件--所有实现类--classLoader加载--实现类的Class、name->名字对应的实现类
        redCar.getColor(null);
    }
}
