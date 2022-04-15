/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.ezeon.springcontactapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pooja
 */
@RestController
public class RestTestController {
     @GetMapping("/t")
    public String test(){                
        return "Pooja Krishna";
    }
}
