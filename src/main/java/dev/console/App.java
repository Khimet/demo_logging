package dev.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.service.AppService;

/** Classe éxécutable qui permet de tester les messages de logs
 * @author Khalil HIMET
 *
 */
public class App {
	
	/** Constante qui créer le Logger propre à cette classe 
	 * et qui va permettre à slf4j de récuperer et traiter les logs
	 * de cette classe */
	private static final Logger LOG = LoggerFactory.getLogger(App.class);

	/**
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {
		
		
		LOG.info("Bonjour Slf4J !");
		LOG.info("Implémentation Logback");
		
		// Instanciation d'un objet AppService
		AppService appService = new AppService();
		
		// Génération d'un message log à partir du Logger de la classe AppService
		appService.executer("Hello Test");
		
		

	}

}
