package hello.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Floor {

	/*
	 * Floor id and floor number
	 */
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private int number;

	public static final int ALLOWED_CAPACITY = 100;

	/*
	 * This is the capacity left
	 */
	private int capacityLeft;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getCapacityLeft() {
		return capacityLeft;
	}

	public void setCapacityLeft(int capacity) {
		this.capacityLeft = capacity;
	}

}
