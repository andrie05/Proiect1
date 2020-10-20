package ro.mta.facc.selab;

public class Carte implements Comparable<Carte>{
    private String Titlu;
    private  String Autor;
    private  int An_aparitie;
    private  int Nr_pagini;


    @Override
    public int compareTo(Carte o) {
        if(this.Nr_pagini<o.Nr_pagini) {
            return -1;
        }
        if(this.Nr_pagini>o.Nr_pagini) {
            return 1;
        }

        return 0;
    }

    public Carte(String titlu, String autor, int an_aparitie, int nr_pagini) {
        Titlu = titlu;
        Autor = autor;
        An_aparitie = an_aparitie;
        Nr_pagini = nr_pagini;
    }
@Override
    public String toString()
    {
        return  this.Titlu+" scrisa de "+this.Autor+" , aparuta in anul"+this.An_aparitie;
    }
}



