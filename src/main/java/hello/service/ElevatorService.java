package hello.service;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import hello.dao.ElevatorRepository;
import hello.model.Elevator;

@Service
public class ElevatorService {

	@Autowired
	ElevatorRepository elevatorDao;
	/**
	 * TO-DO
	 * @param elevatorDao
	 * @param start
	 * @param to
	 * @return
	 */
	@Async
	public Elevator findAvailableElevator(int start, int to) {
		
		Elevator elevator = new Elevator();
		/**
		 * find the right elevator with passed in parameter
		 * if not found, put the user who request on the queue until it is available 
		 */
		//elevator = elevatorDao.findOne(example);
		elevator.setId(RandomUtils.nextInt(1, 100));
		return elevator;
	}
}
