package hello;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.model.Elevator;
import hello.model.Status;
import hello.model.User;
import hello.service.ElevatorService;

@RestController
public class ElevatorController {

	@Autowired
	private ElevatorService elevatorService;

    @RequestMapping("/checkStatus/{name}")
    public Status findStatus(@PathVariable() String name) {
    		
    		return Status.values()[RandomUtils.nextInt(0, 3) % 3];
    }
    
    @RequestMapping("/createRequest/{name}")
    public User createRequest(
    		@PathVariable(required=true) String name,
    		@RequestParam(value="from") int from, 
    		@RequestParam(value="to") int to) {
    		
    		User user = new User();
    		
    		user.setName(name);
    		user.setStart(RandomUtils.nextInt(1, 9));
    		user.setStop(RandomUtils.nextInt(1, 9));
    		user.setStatus(Status.values()[RandomUtils.nextInt(0, 3) % 3]);
    		
    		Elevator elevator = elevatorService.findAvailableElevator(user.getStart(), user.getStop());
    		user.setElevatorId(elevator.getId());
    		return user;
    }
}
