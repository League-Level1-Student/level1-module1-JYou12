package _06_duck;

public class Penguin {

	private String favoriteFood;
	private int numberOfFriends;
	private String name;

	Penguin(String favoriteFood, int numberOfFriends, String name){
      	this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
      	this.name = name;
	}
	
	void hunt() {
		System.out.println(name + " hunted some " + favoriteFood + ".");
	}
	
	void swim() {
		System.out.println(name + " went for a swim.");
	}
	
}
