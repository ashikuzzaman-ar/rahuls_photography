/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studevs.models;

/**
 *
 * @author Sajid
 */
public class BookingInfo {

    private int id;
    private String name;
    private String email;
    private String event_venue;
    private String contact_number;
    private int package_id;
    private String advance;
    private String booking_bkash_account;
    private String bkash_transaction_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEvent_venue() {
        return event_venue;
    }

    public void setEvent_venue(String event_venue) {
        this.event_venue = event_venue;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public int getPackage_id() {
        return package_id;
    }

    public void setPackage_id(int package_id) {
        this.package_id = package_id;
    }

    public String getAdvance() {
        return advance;
    }

    public void setAdvance(String advance) {
        this.advance = advance;
    }

    public String getBooking_bkash_account() {
        return booking_bkash_account;
    }

    public void setBooking_bkash_account(String booking_bkash_account) {
        this.booking_bkash_account = booking_bkash_account;
    }

    public String getBkash_transaction_id() {
        return bkash_transaction_id;
    }

    public void setBkash_transaction_id(String bkash_transaction_id) {
        this.bkash_transaction_id = bkash_transaction_id;
    }

}
