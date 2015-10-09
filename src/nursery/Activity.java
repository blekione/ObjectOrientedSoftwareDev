package nursery;

import java.util.LinkedHashMap;
import java.util.Map;
// TODO redesign it to include ActivityDetails
public class Activity {
	private Integer LIST_OF_CHILDREN_INDEX = 1;
	private String name;
	private String description;
	Map <Integer, Child> signedChildren = new LinkedHashMap<Integer, Child>();

	public Activity(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return this.description;
	}
	
	public void addChild(Child child) {
		signedChildren.put(LIST_OF_CHILDREN_INDEX++, child);
	}

}
