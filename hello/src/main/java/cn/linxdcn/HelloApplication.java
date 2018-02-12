package cn.linxdcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * PACKAGE_NAME.cn.linxdcn.HelloApplication
 *
 * @author dansan.lxd@alibaba-inc.com
 * @date 12/02/2018 3:34 PM
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class HelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }
}
