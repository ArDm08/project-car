package ua.com.foxminded.carservise;

import java.util.Objects;

final class Car {
	private final String name;
	private final int yearOfProduktion;
	private final int waight;
	private final String color;
	private final String engineTipe;
	private final double volumeEngine;
	private boolean isReadyToDrive;
	private int distance = 0;

	public Car(String name, int yearOfProduktion, int waight, String color, String engineTipe, double volumeEngine,
			boolean isReadyToDrive) {
		this.name = name;
		this.yearOfProduktion = yearOfProduktion;
		this.waight = waight;
		this.color = color;
		this.engineTipe = engineTipe;
		this.volumeEngine = volumeEngine;
		this.isReadyToDrive = isReadyToDrive;

	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", yearOfProduktion=" + yearOfProduktion + ", waight=" + waight + ", color="
				+ color + ", engineTipe=" + engineTipe + ", volumeEngine=" + volumeEngine + ", isReadyToDrive="
				+ isReadyToDrive + ", distance=" + distance + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, distance, engineTipe, isReadyToDrive, name, volumeEngine, waight, yearOfProduktion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(color, other.color) && distance == other.distance
				&& Objects.equals(engineTipe, other.engineTipe) && isReadyToDrive == other.isReadyToDrive
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(volumeEngine) == Double.doubleToLongBits(other.volumeEngine)
				&& waight == other.waight && yearOfProduktion == other.yearOfProduktion;
	}

	public void addDistance(int addinionalDidnance) {
		distance += addinionalDidnance;

	}

	public void isNeedToService() {
		if (distance >= 150000) {

		}
		System.out.println("Car needs to service");
	}

	public boolean destroyEngine() {
		if (distance >= 200000) {

		}
		return isReadyToDrive = false;
	}

	public boolean repairEngine() {

		return isReadyToDrive = true;

	}

	public final String getName() {
		return name;
	}

	public final int getYearOfProduktion() {
		return yearOfProduktion;
	}

	public final int getWaight() {
		return waight;
	}

	public final String getColor() {
		return color;
	}

	public final String getEngineTipe() {
		return engineTipe;
	}

	public final double getVolumeEngine() {
		return volumeEngine;
	}

	public final int getDistance() {
		return distance;
	}

	public final boolean isReadyToDrive() {
		return isReadyToDrive;
	}

}
