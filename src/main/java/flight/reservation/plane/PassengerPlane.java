package flight.reservation.plane;

public class PassengerPlane {

	private PlaneModel plane;

    public PlaneModel createPlane(String model) {
        
    	PlaneType type = PlaneType.PlaneA380;
    	 
        plane= PlaneModel.Create(type);
        
        return plane;
    }
    public String getModel() {
    	return plane.model;
    }
    public int getCrewCapacity() {
    	return plane.crewCapacity;
    }
    public int getPassengerCapacity() {
    	return plane.passengerCapacity;
    }

}
