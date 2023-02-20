package flight.reservation.plane;




enum PlaneType {
    PlaneA380, PlaneA350, EMBRAER_190
}
 
// Library Class
abstract class PlaneModel {
	String model;
	int passengerCapacity;
	int crewCapacity;
	boolean air_hostess_required;
	
 
    //abstract public void createPlane();
   
    // Factory method to create objects of different types.
    // Change is required only in this function to create a new object type
     static PlaneModel Create(PlaneType type){
         if (PlaneType.PlaneA380.compareTo(type) == 0){
             return new PlaneA380();
         } else if (PlaneType.PlaneA350.compareTo(type) == 0) {
             return new PlaneA350();
         } else if (PlaneType.EMBRAER_190.compareTo(type) == 0) {
             return new EMBRAER_190();
         }
         else
        	 throw new IllegalArgumentException(String.format("Model type %s is not recognised", type));
     }
}



class PlaneA380 extends PlaneModel {
   public PlaneA380() {
	   this.model="A380";
		this.passengerCapacity=500;
		this.crewCapacity=42;
		this.air_hostess_required=true;
		
   }
}

class PlaneA350 extends PlaneModel {
   public PlaneA350() {
	   this.model="A350";
		this.passengerCapacity=320;
		this.crewCapacity=40;
		this.air_hostess_required=false;
   }
}

class EMBRAER_190 extends PlaneModel {
   public EMBRAER_190() {
	   this.model="A350";
		this.passengerCapacity=25;
		this.crewCapacity=5;
		this.air_hostess_required=false;
   }
}

