package cz.educanet.Manager;


import cz.educanet.Resources.Polozka;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;


@ApplicationScoped

public class PolozkaManager {
    ArrayList<Polozka> Main = new ArrayList<>();


    public void putPolozka(Polozka polozka) {
        if (polozka.isMain()) {
            polozka.setMainid(Main.size() + 1);
            Main.add(polozka);
        } else {
            int kolik = Integer.parseInt(Integer.toString(polozka.getMainid()).substring(0, 1));
            polozka.setSubid(polozka.getMainid() * 100 + kolik);
            Main.add(polozka);
        }
    }


    public ArrayList<Polozka> getPolozkas() {
        return Main;
    }

    public Polozka getSpecificPolozka(int id) {
            return (Main.get(id));

    }

    public void Scrap(int removeid) {
        Main.remove(removeid - 1);
    }
}
