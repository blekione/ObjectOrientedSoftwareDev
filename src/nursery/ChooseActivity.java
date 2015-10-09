package nursery;

import java.util.ArrayList;
import java.util.List;

public class ChooseActivity {
	
	private List<Activity> activities;
	Child child;
	
	public ChooseActivity(List<Activity> activities, Child child) {		
		this.activities = (ArrayList)activities;
		this.child = child;
	}
	
	public  void listActivities() {
		try{
			if (!child.checkStatus()) 
				throw new WrongChildStatus("Child status is wrong");
			System.out.println("Available activities:");
			int i = 1;
			for (Activity activity : activities) {
				System.out.println("---------------------------");
				System.out.println(i + " " + activity.getName());
				System.out.println(activity.getDescription());
				i++;
			}
		} catch (WrongChildStatus e) {
			System.out.println(e);
		}		
	}
	
	public Activity chooseActivity(int index) {
		System.out.println();
		System.out.println("You have chosen:");
		System.out.println(activities.get(index -1).getName());
		System.out.println(activities.get(index -1).getDescription());
		System.out.println("Please confirm");
		return activities.get(index -1);
	}

	public String submitRequest(Activity activity) {
		String confirmation = "child is added to activity";
		activity.addChild(child);
		return confirmation;
	}
	
}
