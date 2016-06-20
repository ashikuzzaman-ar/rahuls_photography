/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studevs.dao;

import com.studevs.models.BookingInfo;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;

/**
 *
 * @author Sajid
 */
public class BookingInfoDao extends Parent_Dao {

    public void insert(BookingInfo bookingInfo) {
        String sql = "Insert into booking_info(name,email,event_venue,contact_number,package_id,"
                + "booking_bkash_account,bkash_transaction_id,date)"
                + "values(:name,:email,:event_venue,:contact_number,:package_id,"
                + ":booking_bkash_account,:bkash_transaction_id,:date)";
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(bookingInfo);
        template.update(sql, param);
    }
}
