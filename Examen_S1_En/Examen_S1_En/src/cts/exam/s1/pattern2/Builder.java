package cts.exam.s1.pattern2;

public class Builder {
	private HotelRoom room;

	public Builder() {
		super();
		this.room = new HotelRoom();
	}
	
	public Builder includedBreakfast(boolean bool) {
		room.setBreakfast(bool);
		return this;
	}
	
	public Builder noPersons(int nr) {
		room.setNoPersons(nr);
		return this;
	}
	
	public Builder bedType(EBedType type) {
		room.setBedType(type);
		return this;
	}
	
	public Builder seasideView(boolean bool) {
		room.setSeasideView(bool);
		return this;
	}
	
	public Builder floor(int nr) {
		room.setFloor(nr);
		return this;
	}
	
	public Builder smokingRoom(boolean bool) {
		room.setSmokingRoom(bool);
		return this;
	}
	
	public HotelRoom build() {
		return room;
	}
	
}
