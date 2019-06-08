package com.example.dola.lometourguideapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    public static ArrayList<PlaceOrEvent> createListOfRestaurants(){
        ArrayList<PlaceOrEvent> listPlaces = new ArrayList<>();
        listPlaces.add(new PlaceOrEvent("EL PASSIO", "Zanguera",
                new Date(1998, 02, 12), R.drawable.ucao));
        listPlaces.add(new PlaceOrEvent("CHEZ CONSTANT", "Novissi",
                new Date(1998, 02, 12), R.drawable.defithec));
        listPlaces.add(new PlaceOrEvent("ESIBA", "Carefour Bodjona",
                new Date(1998, 02, 12), R.drawable.esiba));
        listPlaces.add(new PlaceOrEvent("ESGIS", "Kodjoviakope",
                new Date(1998, 02, 12), R.drawable.esgis));
        listPlaces.add(new PlaceOrEvent("IPNETS EXPERTS", "Totsi Cacaveli",
                new Date(1998, 02, 12), R.drawable.ipnetexperts));
        listPlaces.add(new PlaceOrEvent("ESA", "Agoe et Nukafu",
                new Date(1998, 02, 12), R.drawable.esa));
        listPlaces.add(new PlaceOrEvent("LBS", "Nukafu",
                new Date(1998, 02, 12), R.drawable.lbs));
        return listPlaces;
    }

    public static ArrayList<PlaceOrEvent> createListOfPublicPlaces(){
        ArrayList<PlaceOrEvent> listPlaces = new ArrayList<>();
        listPlaces.add(new PlaceOrEvent("PLACE DE L'INDEPENDANCE", "Zanguera",
                new Date(1998, 02, 12), R.drawable.ucao));
        listPlaces.add(new PlaceOrEvent("DEFITECH", "Novissi",
                new Date(1998, 02, 12), R.drawable.defithec));
        listPlaces.add(new PlaceOrEvent("ESIBA", "Carefour Bodjona",
                new Date(1998, 02, 12), R.drawable.esiba));
        listPlaces.add(new PlaceOrEvent("ESGIS", "Kodjoviakope",
                new Date(1998, 02, 12), R.drawable.esgis));
        listPlaces.add(new PlaceOrEvent("IPNETS EXPERTS", "Totsi Cacaveli",
                new Date(1998, 02, 12), R.drawable.ipnetexperts));
        listPlaces.add(new PlaceOrEvent("ESA", "Agoe et Nukafu",
                new Date(1998, 02, 12), R.drawable.esa));
        listPlaces.add(new PlaceOrEvent("LBS", "Nukafu",
                new Date(1998, 02, 12), R.drawable.lbs));
        return listPlaces;
    }

    public static ArrayList<PlaceOrEvent> createListOfCenterOfAttraction(){
        ArrayList<PlaceOrEvent> listPlaces = new ArrayList<>();
        listPlaces.add(new PlaceOrEvent("EDEN GARDEN", "Zanguera",
                new Date(1998, 02, 12), R.drawable.ucao));
        listPlaces.add(new PlaceOrEvent("FIL O PARC", "Novissi",
                new Date(1998, 02, 12), R.drawable.defithec));
        listPlaces.add(new PlaceOrEvent("ESIBA", "Carefour Bodjona",
                new Date(1998, 02, 12), R.drawable.esiba));
        listPlaces.add(new PlaceOrEvent("ESGIS", "Kodjoviakope",
                new Date(1998, 02, 12), R.drawable.esgis));
        listPlaces.add(new PlaceOrEvent("IPNETS EXPERTS", "Totsi Cacaveli",
                new Date(1998, 02, 12), R.drawable.ipnetexperts));
        listPlaces.add(new PlaceOrEvent("ESA", "Agoe et Nukafu",
                new Date(1998, 02, 12), R.drawable.esa));
        listPlaces.add(new PlaceOrEvent("LBS", "Nukafu",
                new Date(1998, 02, 12), R.drawable.lbs));
        return listPlaces;
    }

    public static ArrayList<PlaceOrEvent> createListOfNightClub(){
        ArrayList<PlaceOrEvent> listPlaces = new ArrayList<>();
        listPlaces.add(new PlaceOrEvent("MIAMI 228", "Zanguera",
                new Date(1998, 02, 12), R.drawable.ucao));
        listPlaces.add(new PlaceOrEvent("LA VILLA", "Novissi",
                new Date(1998, 02, 12), R.drawable.defithec));
        listPlaces.add(new PlaceOrEvent("PRIVILEGE", "Carefour Bodjona",
                new Date(1998, 02, 12), R.drawable.esiba));
        listPlaces.add(new PlaceOrEvent("SEVEN CLASH", "Kodjoviakope",
                new Date(1998, 02, 12), R.drawable.esgis));
        listPlaces.add(new PlaceOrEvent("901", "Totsi Cacaveli",
                new Date(1998, 02, 12), R.drawable.ipnetexperts));
        listPlaces.add(new PlaceOrEvent("ESA", "Agoe et Nukafu",
                new Date(1998, 02, 12), R.drawable.esa));
        listPlaces.add(new PlaceOrEvent("LBS", "Nukafu",
                new Date(1998, 02, 12), R.drawable.lbs));
        return listPlaces;
    }

    public static ArrayList<PlaceOrEvent> createListOfUniversities(){
        ArrayList<PlaceOrEvent> listPlaces = new ArrayList<>();
        listPlaces.add(new PlaceOrEvent("UCAO UUT", "Zanguera",
                new Date(1998, 02, 12), R.drawable.ucao));
        listPlaces.add(new PlaceOrEvent("DEFITECH", "Novissi",
                new Date(1998, 02, 12), R.drawable.defithec));
        listPlaces.add(new PlaceOrEvent("ESIBA", "Carefour Bodjona",
                new Date(1998, 02, 12), R.drawable.esiba));
        listPlaces.add(new PlaceOrEvent("ESGIS", "Kodjoviakope",
                new Date(1998, 02, 12), R.drawable.esgis));
        listPlaces.add(new PlaceOrEvent("IPNETS EXPERTS", "Totsi Cacaveli",
                new Date(1998, 02, 12), R.drawable.ipnetexperts));
        listPlaces.add(new PlaceOrEvent("ESA", "Agoe et Nukafu",
                new Date(1998, 02, 12), R.drawable.esa));
        listPlaces.add(new PlaceOrEvent("LBS", "Nukafu",
                new Date(1998, 02, 12), R.drawable.lbs));
        return listPlaces;
    }
}
