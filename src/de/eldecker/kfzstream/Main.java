package de.eldecker.kfzstream;

import java.util.function.Consumer;
import java.util.stream.Stream;


public class Main {

	/** Implementierung für Terminal-Operation von {@link Kfz}-Stream. */
	private static final Consumer<Kfz> KFZ_VERBRAUCHER = kfz -> { System.out.println( kfz ); };
	
	
	/**
	 * Methode erzeugt Stream mit Kfz-Objekten. 
	 * 
	 * @return Stream mit {@link Kfz}-Objekten mit 
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
				
		final Stream<Kfz> kfzStream = getKfzStream();
		
		kfzStream.filter( 
					k -> k.kennzeichen().startsWith( "KA" )
					&&
					k.ps() >= 200 )
				//.sorted( )
				.forEach( KFZ_VERBRAUCHER );		
	}
	
}
