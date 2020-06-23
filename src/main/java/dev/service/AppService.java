package dev.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Génère un message de log
 * @author Khalil HIMET
 *
 */
public class AppService {
	
	/** Création du Logger propre à cette classe*/
	private static final Logger LOG = LoggerFactory.getLogger(AppService.class);
	
	/** Emet via le Logger un message d'ordre DEBUG
	 * @param param (String) message de log
	 */
	public void executer(String param) {
		
		LOG.debug("Traitement 1 : param = {}", param);
	}

}
