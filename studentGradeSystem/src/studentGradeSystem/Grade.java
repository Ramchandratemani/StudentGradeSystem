package studentGradeSystem;

public class Grade {
	
	private int mathgrade, sciencegrade, englishgrade;

	public Grade(int mathgrade, int sciencegrade, int englishgrade) {
		this.englishgrade = englishgrade;
		this.mathgrade = mathgrade;
		this.sciencegrade = sciencegrade;
	}
	
	public int getMathgrade() {
		return mathgrade;
	}

	public void setMathgrade(int mathgrade) {
		this.mathgrade = mathgrade;
	}

	public int getSciencegrade() {
		return sciencegrade;
	}

	public void setSciencegrade(int sciencegrade) {
		this.sciencegrade = sciencegrade;
	}

	public int getEnglishgrade() {
		return englishgrade;
	}

	public void setEnglishgrade(int englishgrade) {
		this.englishgrade = englishgrade;
	}
	
	@Override
	public String toString() {
		return "Maths Grade: " + mathgrade + ", Science Grade:  " + sciencegrade + ", English Grade: " + englishgrade;
	}
	
}
