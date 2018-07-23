package microservice_domenowy.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import microservice_domenowy.service.LogikaDomenowaService;

@RestController
public class SerwisDomentowyController {

	
	@Autowired
	private LogikaDomenowaService logikaDomenowaService;
	
	@RequestMapping(value="/logic", method=RequestMethod.GET)
	public String getBussinessLogic(){
		return logikaDomenowaService.zrobLogikeBiznesowa();
	}
}
