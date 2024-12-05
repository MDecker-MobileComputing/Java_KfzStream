package de.eldecker.kfzstream;


/**
 * Record-Klasse für Kraftfahrzeuge.
 * 
 * @param kennzeichen KFZ-Kennzeichen, z.B. "KA-X 1234"
 * 
 * @param ps Pferdestärken des Autos (1PS ca. 735,5 Watt)
 */
public record Kfz( String kennzeichen, 
		           int ps ) {}
