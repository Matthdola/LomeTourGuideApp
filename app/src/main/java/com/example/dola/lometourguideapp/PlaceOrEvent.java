package com.example.dola.lometourguideapp;

import java.util.ArrayList;
import java.util.Date;

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
        listPlaces.add(new PlaceOrEvent("EL PASSIO", "Caisse",
                new Date(1998, 02, 12), R.drawable.el_patio));

        listPlaces.add(new PlaceOrEvent("CHEZ CONSTANT", "Novissi",
                new Date(1998, 02, 12), R.drawable.chez_constant));

        listPlaces.add(new PlaceOrEvent("COTE SUD", "Carefour Bodjona",
                new Date(1998, 02, 12), R.drawable.resto_cote_sud));

        listPlaces.add(new PlaceOrEvent("Coté Jardin", "Kodjoviakope",
                new Date(1998, 02, 12), R.drawable.resto_cote_sud));

        listPlaces.add(new PlaceOrEvent("La part Du Boucher", "Totsi Cacaveli",
                new Date(1998, 02, 12), R.drawable.ipnetexperts));

        listPlaces.add(new PlaceOrEvent("Beluga", "Agoe et Nukafu",
                new Date(1998, 02, 12), R.drawable.esa));

        listPlaces.add(new PlaceOrEvent("Chez Brovi", "Nukafu",
                new Date(1998, 02, 12), R.drawable.cheb_brovi));

        listPlaces.add(new PlaceOrEvent("La Cascade ", "Nukafu",
                new Date(1998, 02, 12), R.drawable.lacascade));

        listPlaces.add(new PlaceOrEvent("Green Field ", "Tokoin",
                new Date(1998, 02, 12), R.drawable.greenfield));
        return listPlaces;
    }

    public static ArrayList<PlaceOrEvent> createListOfPublicPlaces(){
        ArrayList<PlaceOrEvent> listPlaces = new ArrayList<>();
        listPlaces.add(new PlaceOrEvent("PLACE DE L'INDEPENDANCE", "Zanguera",
                new Date(1998, 02, 12), R.drawable.place_indep));
        listPlaces.add(new PlaceOrEvent("Cours d'appel", "Agoè Anome",
                new Date(1998, 02, 12), R.drawable.cours_appel));
        listPlaces.add(new PlaceOrEvent("Assemblée Nationale", "Carefour Bodjona",
                new Date(1998, 02, 12), R.drawable.assemble_nationale));
        listPlaces.add(new PlaceOrEvent("Plase Anani Santos", "Kodjoviakope",
                new Date(1998, 02, 12), R.drawable.anani_santos));
        listPlaces.add(new PlaceOrEvent("Place de la libération", "Totsi Cacaveli",
                new Date(1998, 02, 12), R.drawable.colombe_de_la_paix));
        listPlaces.add(new PlaceOrEvent("Agoè 2 LION", "Agoe et Nukafu",
                new Date(1998, 02, 12), R.drawable.agoe_deux_lions));
        listPlaces.add(new PlaceOrEvent("GTA", "Nukafu",
                new Date(1998, 02, 12), R.drawable.gta));
        return listPlaces;
    }

    public static ArrayList<PlaceOrEvent> createListOfCenterOfAttraction(){
        ArrayList<PlaceOrEvent> listPlaces = new ArrayList<>();
        listPlaces.add(new PlaceOrEvent("EDEN GARDEN", "Zanguera",
                new Date(1998, 02, 12), R.drawable.eden_garden));
        listPlaces.add(new PlaceOrEvent("FIL O PARC", "Novissi",
                new Date(1998, 02, 12), R.drawable.fil_o_parc));
        listPlaces.add(new PlaceOrEvent("Tata Parc", "Carefour Bodjona",
                new Date(1998, 02, 12), R.drawable.tata_parc));
        listPlaces.add(new PlaceOrEvent("Togo 2000", "Kodjoviakope",
                new Date(1998, 02, 12), R.drawable.togo_2000));
        listPlaces.add(new PlaceOrEvent("Marcelo beach", "Baguida",
                new Date(1998, 02, 12), R.drawable.marcelo_beach));
        listPlaces.add(new PlaceOrEvent("Pure plage", "Baguida",
                new Date(1998, 02, 12), R.drawable.pure_plage));
        listPlaces.add(new PlaceOrEvent(" Olodge", "Avepozo",
                new Date(1998, 02, 12), R.drawable.ologde));
        return listPlaces;
    }

    public static ArrayList<PlaceOrEvent> createListOfNightClub(){
        ArrayList<PlaceOrEvent> listPlaces = new ArrayList<>();
        listPlaces.add(new PlaceOrEvent("MIAMI 228", "Zanguera",
                new Date(1998, 02, 12), R.drawable.miami_228));
        listPlaces.add(new PlaceOrEvent("LA VILLA", "Novissi",
                new Date(1998, 02, 12), R.drawable.montecristo));
        listPlaces.add(new PlaceOrEvent("PRIVILEGE", "Carefour Bodjona",
                new Date(1998, 02, 12), R.drawable.privilege));
        listPlaces.add(new PlaceOrEvent("SEVEN CLASH", "Kodjoviakope",
                new Date(1998, 02, 12), R.drawable.seven_clash));
        listPlaces.add(new PlaceOrEvent("901", "Totsi Cacaveli",
                new Date(1998, 02, 12), R.drawable.club_901));
        listPlaces.add(new PlaceOrEvent("Montecristo", "Agoe et Nukafu",
                new Date(1998, 02, 12), R.drawable.montecristo));
        listPlaces.add(new PlaceOrEvent("Le refuge", "Nukafu",
                new Date(1998, 02, 12), R.drawable.le_refuge));
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
