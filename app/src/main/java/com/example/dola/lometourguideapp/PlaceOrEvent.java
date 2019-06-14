package com.example.dola.lometourguideapp;

import android.content.Context;

import java.util.ArrayList;
import java.util.Date;

import com.example.dola.lometourguideapp.R;

public class PlaceOrEvent {
    private String name;
    private String address;
    private String[] openDays;
    private String openHours;
    private Date creationDate;
    private int placeImageResourceId;
    private String managerName;
    private String viceManagerName;

    public PlaceOrEvent() {
    }

    public PlaceOrEvent(String name, String address, Date creationDate, int placeImageResourceId) {
        this.name = name;
        this.address = address;
        this.creationDate = creationDate;
        this.placeImageResourceId = placeImageResourceId;
    }

    public PlaceOrEvent(String name, String address, String[] openDays, String openHours, Date creationDate, int placeImageResourceId,
                        String managerName, String viceManagerName) {
        this.name = name;
        this.address = address;
        this.openDays = openDays;
        this.openHours = openHours;
        this.creationDate = creationDate;
        this.placeImageResourceId = placeImageResourceId;
        this.managerName = managerName;
        this.viceManagerName = viceManagerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getOpenDays() {
        return openDays;
    }

    public void setOpenDays(String[] openDays) {
        this.openDays = openDays;
    }

    public String getOpenHours() {
        return openHours;
    }

    public void setOpenHours(String openHours) {
        this.openHours = openHours;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public int getPlaceImageResourceId() {
        return placeImageResourceId;
    }

    public void setPlaceImageResourceId(int placeImageResourceId) {
        this.placeImageResourceId = placeImageResourceId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getViceManagerName() {
        return viceManagerName;
    }

    public void setViceManagerName(String viceManagerName) {
        this.viceManagerName = viceManagerName;
    }
}
