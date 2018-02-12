package cn.linxdcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * cn.linxdcn.DiscoveryApplication
 *
 * @author dansan.lxd@alibaba-inc.com
 * @date 11/02/2018 3:16 PM
 */

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplication {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryApplication.class, args);
    }
}
