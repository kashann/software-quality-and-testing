package cts.exam.s1.pattern2;

public class HotelRoom {
	private boolean breakfast;
	private int noPersons;
	private EBedType bedType;
	private boolean seasideView;
	private int floor;
	private boolean smokingRoom;
	
	public HotelRoom() {
		super();
	}

	public HotelRoom(boolean breakfast, int noPersons, EBedType bedType, boolean seasideView, int floor,
			boolean smokingRoom) {
		super();
		this.breakfast = breakfast;
		this.noPersons = noPersons;
		this.bedType = bedType;
		this.seasideView = seasideView;
		this.floor = floor;
		this.smokingRoom = smokingRoom;
	}

	public void setBreakfast(boolean breakfast) {
		this.breakfast = breakfast;
	}

	public void setNoPersons(int noPersons) {
		this.noPersons = noPersons;
	}

	public void setBedType(EBedType bedType) {
		this.bedType = bedType;
	}

	public void setSeasideView(boolean seasideView) {
		this.seasideView = seasideView;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public void setSmokingRoom(boolean smokingRoom) {
		this.smokingRoom = smokingRoom;
	}

	@Override
	public String toString() {
		return "HotelRoom [breakfast=" + breakfast + ", noPersons=" + noPersons + ", bedType=" + bedType
				+ ", seasideView=" + seasideView + ", floor=" + floor + ", smokingRoom=" + smokingRoom + "]";
	}
	
	
}
