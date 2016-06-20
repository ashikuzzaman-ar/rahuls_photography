/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studevs.models;

import com.studevs.validations.ValidEmail;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author Sajid
 */
public class BookingInfo {

    private int id;
    @NotBlank(message = "This field cannot be blank")
    private String name;
    @ValidEmail(message = "This does not seem to be a valid email address")
    private String email;
    @NotBlank(message = "This field cannot be blank")
    private String event_venue;
    @NotBlank(message = "This field cannot be blank")
    private String contact_number;
    private int package_id;
    @NotBlank(message = "This field cannot be blank")
    private String booking_bkash_account;
    @NotBlank(message = "This field cannot be blank")
    private String bkash_transaction_id;
    private boolean confirmed;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

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
