package warPackage;

public class Card {

	private int value;
	private String name;
	
	public Card(String name, int value) {
		this.name = name;
		this.value = value;
	}
	//Adding setters and getters
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	//describe class, details of card
	public String describe() {
		return getName();
	}
}
