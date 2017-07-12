package hello.model;

import java.util.concurrent.atomic.AtomicInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;;

@Entity
public class Elevator{

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	public final static int CAPACITY = 12;
	
	private int capacityLeft;
	
	public int getCapacityLeft() {
		return capacityLeft;
	}

	public void setCapacityLeft(int capacityLeft) {
		this.capacityLeft = capacityLeft;
	}

	/**
	 * start to stop floor level
	 */
	private int start, stop;
	
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

	public Elevator() {
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	public void move(int target) {
		//simulate time running
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
		}
		stop = target;
	}
}
