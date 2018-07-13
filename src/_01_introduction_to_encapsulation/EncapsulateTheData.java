package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj; //can be any object type except String. Strings get turned into objects.
	
	public static void main(String[] args) {
		
	}

	private int getItemsReceived() {
		return itemsReceived;
	}

	private void setItemsReceived(int itemsReceived) {
		if(itemsReceived>=0) {
		this.itemsReceived = itemsReceived;
		}
		else {
			this.itemsReceived=0;
		}
	}

	private float getDegreesTurned() {
		return degreesTurned;
	}

	private void setDegreesTurned(float degreesTurned) {
		for (int i = 0; i < 1; i++) {
		if(degreesTurned>360) {
			degreesTurned-=360;
			i--;
		}
		else if(degreesTurned<0) {
			degreesTurned+=360;
			i--;
		}
		else {
		this.degreesTurned = degreesTurned;
		}
	}
	}

	private String getNomenclature() {
		return nomenclature;
	}

	private void setNomenclature(String nomenclature) {
		if(nomenclature.equals("")) {
			this.nomenclature=" ";
		}
		else {
		this.nomenclature = nomenclature;
		}
	}

	private Object getMemberObj() {
		return memberObj;
	}

	private void setMemberObj(Object memberObj) {
		
		this.memberObj = memberObj;
	}
	
	
}
