package cn.linxdcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

/**
 * cn.linxdcn.Application
 *
 * @author dansan.lxd@alibaba-inc.com
 * @date 12/02/2018 1:54 PM
 */
@SpringBootApplication
@EnableSidecar
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
