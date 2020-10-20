package ro.mta.facc.selab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Biblioteca {
    ArrayList<Carte>carti;
    public void sort()
    {
        Collections.sort(carti);
    }
    public Biblioteca() {
        carti=new ArrayList<Carte>();
    }
    public void add(Carte carte)
    {
        carti.add(carte);
    }
    public Biblioteca(ArrayList<Carte>list)
    {
        carti=new ArrayList<Carte>();
        for(Carte c: list)
        {
            carti.add(c);
        }
    }
    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        for (Carte c:carti)
        {
            builder.append(c);
            builder.append("\n");
        }
        return builder.toString();

    }
}
