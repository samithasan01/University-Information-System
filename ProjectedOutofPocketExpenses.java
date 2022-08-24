import java.util.ArrayList;
public class ProjectedOutofPocketExpenses {
	
	public static void main(String[] args) {
		
		FAFSAexpectedFamilyContribution JohnDoe = new FAFSAexpectedFamilyContribution("John Doe", 1500);
		
		FAFSAexpectedFamilyContribution BeckyFowler = new FAFSAexpectedFamilyContribution("Becky Folwer", 127);
		
		FAFSAexpectedFamilyContribution JohnSnow = new FAFSAexpectedFamilyContribution("John Snow", 3500);
		
		ArrayList<FAFSAexpectedFamilyContribution> estOutofPocket = new ArrayList<>();
		estOutofPocket.add(JohnDoe);
		estOutofPocket.add(BeckyFowler);
		estOutofPocket.add(JohnSnow);
		
		System.out.println("The family of "+ JohnDoe.getName()+" is expected to pay "+ JohnDoe.getEFC()+" out of pocket.");
		
		System.out.println("The family of "+ BeckyFowler.getName()+" is expected to pay "+ BeckyFowler.getEFC()+" out of pocket.");
		
		System.out.println("The family of "+ JohnSnow.getName()+" is expected to pay "+ JohnSnow.getEFC()+" out of pocket.");
		
		
		
		
		
	}
		         

}
