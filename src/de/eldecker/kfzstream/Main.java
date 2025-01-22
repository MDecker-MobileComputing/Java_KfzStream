package de.eldecker.kfzstream;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.stream.Stream;


/**
 * Hauptklasse.
 */
public class Main {

    /** Implementierung für Terminal-Operation von {@link Kfz}-Stream. */
    private static final Consumer<Kfz> KFZ_VERBRAUCHER = kfz -> { System.out.println( kfz ); };

    /** Objekt zum Vergleich von zwei {@link Kfz}-Objekten, wird zum Sortieren benötigt. */
    private static final Comparator<Kfz> KFZ_VERGLEICHER =
            (kfz1,kfz2) -> kfz1.kennzeichen().compareTo( kfz2.kennzeichen() );


    /**
     * Methode erzeugt Stream mit Kfz-Objekten.
     *
     * @return Stream mit {@link Kfz}-Objekten mit Kennzeichen und PS.
     */
    private static Stream<Kfz> getKfzStream() {

        return Stream.of(
                            new Kfz( "KA-Z 988" , 220 ),
                            new Kfz( "KA-AB 901", 80  ),
                            new Kfz( "HD-Y 1234", 140 ),
                            new Kfz( "KA-T 1972", 205 ),
                            new Kfz( "HH-DB 444", 230 ),
                            new Kfz( "KA-B 4321", 330 )
                        );
    }


    /**
     * Einstiegsmethode.
     *
     * @param args Wird nicht ausgewertet.
     */
    public static void main( String[] args ) {

        System.out.println();

        final Stream<Kfz> kfzStream = getKfzStream();

        kfzStream.filter( k -> k.ps() >= 200 
        		               &&
        		               k.kennzeichen().startsWith("KA")
        		        ) 
                 .sorted(  KFZ_VERGLEICHER )
                 .forEach( KFZ_VERBRAUCHER );                 
    }

}
