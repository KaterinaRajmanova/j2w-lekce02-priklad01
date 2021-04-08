package cz.czechitas.java2webapps.lekce2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Controller
public class MainController {

    @GetMapping("/")
    public ModelAndView hodKostkou (){

        Random generatorCisla = new Random();
        int hozeneCislo = generatorCisla.nextInt(6) + 1;

        ModelAndView result = new ModelAndView("kostka");
        result.addObject("hozeneCislo", hozeneCislo);
        result.addObject("obrazek", String.format("/images/kostka-%d.svg", hozeneCislo));

        return result;

    }
}
