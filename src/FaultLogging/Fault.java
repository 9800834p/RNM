package FaultLogging;

public class Fault
{

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String toString(){
		return "Fault id: " + this.id;
	}
	
	
	
	
}

public class FaultLogger
{
	private ArrayList<Fault> FaultList = new ArrayList<Fault>();
	private Fault;
	
	public FaultList getFaultList(){
		return FaultList;
	}
	
	public FaultList nearbyFaults(Period){
		return Fault;
	} 
	
	public void setFaultList(FaultList){
		this.FaultList;
	}
	
	public Fault faultCreator(){
		Fault = new Fault();
	}
	
	
	
	
}
