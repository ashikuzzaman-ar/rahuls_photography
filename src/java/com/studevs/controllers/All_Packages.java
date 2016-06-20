/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studevs.controllers;

import com.studevs.dao.Date_SlotDao;
import com.studevs.models.BookingInfo;
import com.studevs.utils.GetBeans;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String doGET1(@RequestParam("id") int packageId, Model model) {

        GetBeans<Date_SlotDao> getBeans = new GetBeans<>();
        getBeans.setFileName("dbBean.xml");
        Date_SlotDao slotDao = getBeans.getBean("dataSlotDao");

        BookingInfo temp = new BookingInfo();
        temp.setPackage_id(packageId);
        model.addAttribute("booking", temp);
        model.addAttribute("slots", slotDao.getDateByPackageId(packageId));
        return "book_package";
    }

}
