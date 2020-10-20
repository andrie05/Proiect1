package ro.mta.facc.selab;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args)
    {
      /*  for (int i=0;i<args.length;i++)
            System.out.println(args[i]);
        Carte carte=new Carte("1984","George Orwel",1964,243);

        Biblioteca biblioteca=new Biblioteca();
        biblioteca.add(carte);
        biblioteca.add(new Carte("Zece negri mititei","Agatha Cristie",1994,200));
        biblioteca.add(new Carte("C Programing Language","Denis Ritchie, Brian Kernighan",1972,1000));
        biblioteca.sort();
        System.out.println(biblioteca);*/
        Thread[]threads=new Thread[10];
        threads[0]=new MyThread();
        threads[1]=new MyThread();
        threads[2]=new MyThread();
        threads[0].start();
        threads[1].start();
        threads[2].start();


        try {
            threads[0].join();
            threads[1].join();
            threads[2].join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
