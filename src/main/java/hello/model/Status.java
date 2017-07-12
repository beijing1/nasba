package hello.model;

public enum Status {

	Waiting(0), Intransit(1), Off(2);

	private int value;

	Status(int val) {
		value = val;
	}

	public int getValue() {
		return value;
	}
}
