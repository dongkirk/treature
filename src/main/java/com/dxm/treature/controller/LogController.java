package com.dxm.treature.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/log")
public class LogController {
    private final static Logger logger = LoggerFactory.getLogger(LogController.class);

    @RequestMapping(path = "/info")
    public String infoLog(){
        logger.info("logger level : 打印info");
        return "logPrint";
    }

    @RequestMapping(path = "/error")
    public String errorLog(){
        logger.error("logger level : 打印error");
        return "logPrint";
    }

    @RequestMapping(path = "/debug")
    public String debugLog(){
        logger.debug("logger level : 打印debug");
        return "logPrint";
    }

    @RequestMapping(path = "/warn")
    public String warnLog(){
        logger.warn("logger level : 打印warn");
        return "logPrint";
    }
}
