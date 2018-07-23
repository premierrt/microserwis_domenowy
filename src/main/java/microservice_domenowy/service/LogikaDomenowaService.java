package microservice_domenowy.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@Service
public class LogikaDomenowaService {

	private static final Log log = LogFactory.getLog(LogikaDomenowaService.class);
	
	public String zrobLogikeBiznesowa(){
		log.info(LogikaDomenowaService.class.getName() + " zrobLogikeBiznesowa Service " );
		return "wynik logiki biznesowej z serwisu "+LogikaDomenowaService.class.getName();
	}
}
