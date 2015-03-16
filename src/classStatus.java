
public enum classStatus {
	FRESHMAN(1),
	SOPHOMORE(2),
	JUNIOR(3),
	SENIOR(4);
	
	classStatus(int status) {
		this.status = status;
	}
	private int status;
	
	public int getStatus() {
		return status;
	}
}
