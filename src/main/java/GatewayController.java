import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.config.GatewayConfiguration;

@RestController
@RequestMapping("/gateway")
public class GatewayController {
	
	@Autowired
	GatewayConfiguration config;
	
	@GetMapping(value = "/environment")
	public ResponseEntity<String> getEnvironmentName(){
		return new ResponseEntity<>(config.getValue(), HttpStatus.OK);
	}

}
