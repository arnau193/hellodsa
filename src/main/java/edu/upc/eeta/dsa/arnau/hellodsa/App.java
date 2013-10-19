package edu.upc.eeta.dsa.arnau.hellodsa;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
  	public class App {
    		static Logger logger = Logger.getLogger(App.class);
    		public static void main(String[] args) {
    			System.out.println("Hello World!");
    			
    			logger.error("This is an error message.");
    			logger.warn("This is a warning message.");
    			logger.info("This is an informational message.");
    			logger.debug("This is a error message.");
    		}
    }
