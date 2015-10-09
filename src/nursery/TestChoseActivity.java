package nursery;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class TestChoseActivity {

	public static void main(String[] args) {

		List<Activity> activities = new ArrayList<Activity>();
		
		activities.add(new Activity("dancing", "dancing classes for children under 5"));
		activities.add(new Activity("painting", "creative class where you use paint to express yourself"));
		activities.add(new Activity("swimming", "splash, swim and have fun in water"));
		
		Address testAddress = new Address(21, "Lavender Avenue", "Mitcham", "cr4 3rs");
		
		Child adam = new Child("Adam", LocalDate.of(2013, Month.APRIL, 21), testAddress, false);
		Child wiki = new Child("Wiktoria", LocalDate.of(2005, Month.MAY, 2), testAddress, true);
		
		ChooseActivity chooseActivity = new ChooseActivity(activities, adam);
		
		chooseActivity.listActivities();
		
		chooseActivity = new ChooseActivity(activities, wiki);
		chooseActivity.listActivities();
		Activity chosenActivity = chooseActivity.chooseActivity(1);
		chooseActivity.submitRequest(chosenActivity);
	}

}
