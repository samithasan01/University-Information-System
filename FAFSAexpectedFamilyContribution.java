
public class FAFSAexpectedFamilyContribution {
	
	/*created by Samit Hasan on 8/22/2022
	 * This program will help estimate how much a student's parents should expect to pay out of pocket to finance a university education
	 * lists attributes: name, expected family contribution(estimated by the US federal government based on parents' tax information
	 * 
	 */
	private String name;
	private double EFC;
	
	public FAFSAexpectedFamilyContribution(String name, double EFC) {
		this.name = name;
		this.EFC = EFC;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void addName(String N) {
		this.name = N;
	}
	
	public double getEFC() {
		return EFC;
	}
	
	public void addEFC(double efc) {
		this.EFC = efc;
	}

}
