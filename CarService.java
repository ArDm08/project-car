package ua.com.foxminded.carservise;

import java.util.Objects;

final class CarService {
	final private int year;
	final private int month;
	final private int day;

	public CarService(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public String toString() {
		return "CarServise [year=" + year + ", month=" + month + ", day=" + day + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarService other = (CarService) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	public final int getYear() {
		return year;
	}

	public final int getMonth() {
		return month;
	}

	public final int getDay() {
		return day;
	}
}
