package cn.linxdcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by linxiaodong on 20/02/2018.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class TSIApplication {
    public static void main(String[] args) {
        SpringApplication.run(TSIApplication.class, args);
    }
}
