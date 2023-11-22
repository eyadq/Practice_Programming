package day32_tasks;

import day31_tasks.Offer;

import java.util.ArrayList;

public class OfferList {
    public static void main(String[] args) {

        Offer amazon = new Offer("Amazon", "Seattle", 100_000, true, 28);
        Offer google = new Offer("Google", "Some mountain", 101_000, true, 23);
        Offer walmart = new Offer("Walmart", "Ozark", 25_000, false, 12);
        Offer swagelok = new Offer("Swagelok", "Solon", 65_000, true, 17);
        Offer homeDepot = new Offer("Home Depot", "USA", 12_000, false, 3);
        Offer samsung = new Offer("Samsung", "Seoul", 120_000, true, 3);
        Offer facebook = new Offer("Facebook", "Somewhere", 112_000, true, 19);

        ArrayList<Offer> offers = new ArrayList<>();
        offers.add(amazon);
        offers.add(google);
        offers.add(walmart);
        offers.add(swagelok);
        offers.add(homeDepot);
        offers.add(samsung);
        offers.add(facebook);

        ArrayList<Offer> localOffers = new ArrayList<>(offers);


    }
}
