package cz.educanet.Manager;


import cz.educanet.Resources.Polozka;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;


@ApplicationScoped

public class PolozkaManager {
    ArrayList<Polozka> dock = new ArrayList<Polozka>();

    public void putPolozka(Polozka Polozka) {
        Polozka.setId(dock.size() + 1);
        dock.add(Polozka);
    }

    public ArrayList<Polozka> getPolozkas() {
        return dock;
    }

    public Polozka getSpecificPolozka(int id) {

        return(dock.get(id));
    }

    public void Scrap(int removeid) {
        dock.remove(removeid - 1);
    }
}
