package org.cloudfoundry.samples.music.web;

import org.cloudfoundry.samples.music.domain.ApplicationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class InfoController {
    private final Environment springEnvironment;

    @Autowired
    public InfoController(Environment springEnvironment) {
        this.springEnvironment = springEnvironment;
    }

    @GetMapping("/appinfo")
    public ApplicationInfo info() {
        return new ApplicationInfo(springEnvironment.getActiveProfiles(), getServiceNames());
    }

    @GetMapping("/service")
    public List<Map<String, Object>> showServiceInfo() {
        // Cloud services information is not available without Spring Cloud Connectors
        return new ArrayList<>();
    }

    private String[] getServiceNames() {
        // Cloud services information is not available without Spring Cloud Connectors
        return new String[]{};
    }
}
