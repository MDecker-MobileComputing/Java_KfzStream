package de.eldecker.kfzstream;


/**
 * Record-Klasse für Kraftfahrzeuge.
 * 
 * @param kennzeichen KFZ-Kennzeichen, z.B. "KA-X 1234"
 * 
 * @param ps Leistung des Motors in Pferdestärken (1PS entspricht ca. 735,5 Watt)
 */
public record Kfz( String kennzeichen, 
		           int    ps ) {}
