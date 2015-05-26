package FaultRepair;


import java.util.Date;

public class WorkOrder {
	
	private STATUS status;
	private RepairTeam repairTeam;
	private Date scheduleTime;

	public WorkOrder(){
		this.status = STATUS.NOSTATUS;
	}
	
	public WorkOrder(iFault fault){
		if (fault.verified()){
			this.status =  STATUS.ISSUED;	
		}
	}
	
	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

	public void assignRepairTeam(RepairTeam repairTeam) {
		// TODO Auto-generated method stub
		this.repairTeam = repairTeam;
		this.setStatus(STATUS.ASSIGNED);
	}
	
	public RepairTeam getAssignedRepairTeam(){
		return this.repairTeam;
	}

	public void schedule(Date dateAndTime) {
		this.scheduleTime = dateAndTime;
		this.status = STATUS.SCHEDULED;
	}
}

class iFault{
	private boolean verified;
	
	public iFault(boolean faultState){
		this.verified=faultState;	
	}

	public boolean verified(){
		return this.verified;
	}
}
