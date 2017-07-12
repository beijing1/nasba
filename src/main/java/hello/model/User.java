package hello.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	/**
	 * Initial and target floor
	 */
	private int start, stop;
	/**
	 * user name
	 */
	private String name;
	
	/**
	 * User status
	 */
	private Status status;
	
	/**
	 * Elevator assigned to user
	 */
	private int elevatorId;
	
	public int getElevatorId() {
		return elevatorId;
	}
	public void setElevatorId(int elevator) {
		this.elevatorId = elevator;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getStop() {
		return stop;
	}
	public void setStop(int stop) {
		this.stop = stop;
	}
	
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
