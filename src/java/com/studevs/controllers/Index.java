/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studevs.controllers;

import com.studevs.dao.Packages_Dao;
import com.utils.GetBeans;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ashik
 */
@Controller
public class Index {

//    Remove .htm when testing is done
    @RequestMapping(value = "index.htm", method = RequestMethod.GET)
    protected String doGet1() {

        try {

            return "index";
        } catch (Exception e) {

            return "index";
        }
    }

    @RequestMapping(value = "get_all_package.htt", method = RequestMethod.GET)
    protected String doGET2(Model model) {
        GetBeans<Packages_Dao> getBeans = new GetBeans<>();
        getBeans.setFileName("dbBean.xml");
        Packages_Dao packageDao = getBeans.getBean("packageDao");

        model.addAttribute("packages", packageDao.getAll());
        return "all_packages";
    }

}
