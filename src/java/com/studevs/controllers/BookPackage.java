/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studevs.controllers;

import com.studevs.dao.BookingInfoDao;
import com.studevs.dao.Date_SlotDao;
import com.studevs.models.BookingInfo;
import com.studevs.utils.GetBeans;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Sajid
 */
@Controller
public class BookPackage {

    @RequestMapping(value = "book_it.htt", method = RequestMethod.POST)
    public String doPOST1(@Valid @ModelAttribute("booking") BookingInfo booking, BindingResult result, Model model) {

        if (result.hasErrors()) {
            GetBeans<Date_SlotDao> getBeans1 = new GetBeans<>();
            getBeans1.setFileName("dbBean.xml");
            Date_SlotDao slotDao = getBeans1.getBean("dataSlotDao");
            model.addAttribute("slots", slotDao.getDateByPackageId(booking.getPackage_id()));
            return "book_package";
        }

        GetBeans<BookingInfoDao> getBeans2 = new GetBeans<>();
        getBeans2.setFileName("dbBean.xml");
        BookingInfoDao dao = getBeans2.getBean("bookingInfoDao");

        dao.insert(booking);
        return "success";
    }
}
