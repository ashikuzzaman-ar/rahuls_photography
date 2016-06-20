/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studevs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Sajid
 */
@Controller
public class All_Packages {

    @RequestMapping(value = "get_package.htt", method = RequestMethod.GET)
    public String doGET1(@RequestParam("id") int id) {
        return "book_package";
    }

}
