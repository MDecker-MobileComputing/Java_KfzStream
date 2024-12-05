package de.eldecker.kfzstream;


/**
 * Objekte für Kraftfahrzeuge.
 * 
 * @param kennzeichen KFZ-Kennzeichen, z.B. "KA-X 1234"
 * 
 * @param ps Pferdesträrken des Autos
 */
public record Kfz( String kennzeichen, 
		           int ps ) {}
