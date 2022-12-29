package org.example.reflection.controller;

import org.example.reflection.annotation.Controller;
import org.example.reflection.annotation.RequestMapping;
import org.example.reflection.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HealthCheckerController {

    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public String home(HttpServletRequest request, HttpServletResponse response) {
        return "ok";
    }
}
