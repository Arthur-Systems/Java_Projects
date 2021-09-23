
//Demo: class Grade will assign a letter grade based on the score using switch-case

public class GradeWithSwitch {
	int score;
	char grade;
	int gradeACount = 0,
		gradeBCount = 0,
		gradeCCount = 0,
		gradeDCount = 0,
		gradeFCount = 0;

	public void setScore(int s){
		score = s;
	}
	public int getScore(){
		return score;
	}
	public void setGrade(char g){
		grade = g;
	}
	public char getGrade(){
		return grade;
	}
	public int getACount() {
		return gradeACount;
	}
	public int getBCount() {
		return gradeBCount;
	}
	public int getCCount() {
		return gradeCCount;
	}
	public int getDCount() {
		return gradeDCount;
	}
	public int getFCount() {
		return gradeFCount;
	}
	public void assginGrade(){
		int scoreRange = score / 10;
		switch (scoreRange) {
			case 10:
			case 9:	grade = 'A';
					gradeACount++;
					break;
			case 8: grade = 'B';
					gradeBCount++;
					break;
			case 7: grade = 'C';
					gradeCCount++;
					break;
			case 6: grade = 'D';
					gradeDCount++;
					break;
			default:grade ='F';
					gradeFCount++;
		}	//end of switch
	}		//end of method assignGrade()
}			//end of class Grade
