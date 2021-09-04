package ch20;

public class User implements Comparable {
	int age;
	String name;
	int score;
	
	public User(String name, int age){
		this.age = age;
		this.name = name;
		score = 0;
	}
	
	public void setScore(int score){
		this.score = score;
	}
	public int getScore(){
		return score;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int compareTo(Object o){
		if (o instanceof User) {
			User otherUser = (User) o; 
			if (otherUser.getScore() > this.getScore())
				return 1;
			else if (otherUser.getScore() < this.getScore())
				return -1;
			else
				return 0;
		}
	return 0;
	}
	public String toString() {
		return score + " - " + name + " - " + age;
	}
}
