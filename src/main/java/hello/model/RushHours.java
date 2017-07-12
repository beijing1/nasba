package hello.model;

import java.time.LocalTime;

public enum RushHours {

	Morning("Morning"), Noon("Noon"), Afternoon("Afternoon");

	private String value;

	RushHours(String v) {
		value = v;
	}

	public String getValue() {
		return value;
	}

	public boolean isBusy(LocalTime now) {

		LocalTime date1 = LocalTime.parse("07:30:00");
		LocalTime date2 = LocalTime.parse("09:30:00");
		LocalTime date3 = LocalTime.parse("11:30:00");
		LocalTime date4 = LocalTime.parse("13:30:00");
		LocalTime date5 = LocalTime.parse("15:30:00");
		LocalTime date6 = LocalTime.parse("17:30:00");

		if (now.isBefore(date2) && now.isAfter(date1)) {
			return true;
		} else if (now.isBefore(date4) && now.isAfter(date3)) {
			return true;
		} else if (now.isBefore(date6) && now.isAfter(date5)) {
			return true;
		} else {
			return false;
		}
	}

}
