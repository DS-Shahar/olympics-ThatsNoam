public class Athlete {
    private String name;
    private Grade[] grades;
    private int count;

    // פעולה בונה
    public Athlete(String name, int maxGrades) {
        this.name = name;
        this.grades = new Grade[maxGrades];
        this.count = 0;
    }

    // פעולה בונה מעתיקה
    public Athlete(Athlete other) {
        this.name = other.name;
        this.count = other.count;
        this.grades = new Grade[other.grades.length];
        for (int i = 0; i < this.count; i++) {
            this.grades[i] = new Grade(other.grades[i].getApparatus(), other.grades[i].getScore());
        }
    }

    // פעולה להוספת ציון
    public boolean addGrade(String apparatus, double score) {
        if (count < grades.length) {
            grades[count] = new Grade(apparatus, score);
            count++;
            return true;
        }
        return false;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Grade[] getGrades() {
		return grades;
	}

	public void setGrades(Grade[] grades) {
		this.grades = grades;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	// פעולה למחיקת ציון
    public boolean deleteGrade(String apparatus) {
        for (int i = 0; i < count; i++) {
            if (grades[i].getApparatus().equals(apparatus)) {
                grades[i] = null; 
                count--;   
                return true;
            }
        }
        return false;
    }
    //פעולה לחישוב ממוצע
    public double average() {
        if (count == 0) {
            return -1;
        }
        double sum = 0;
        int actualCount = 0; // סופר כמה ציונים שאינם null יש
        for (int i = 0; i < count; i++) {
            if (grades[i] != null) {
                sum += grades[i].getScore();
                actualCount++;
            }
        }
        if (actualCount == 0) {
            return -1; // מחזיר -1 אם אין ציונים תקפים
        }
        return sum / actualCount;
    }


    // פעולה שבודקת האם כל הציונים מעל מספר מסוים
    public boolean allGradesAbove(double number) {
        for (int i = 0; i < count; i++) {
            if (grades[i].getScore() <= number) {
                return false;
            }
        }
        return true;
    }

    // פעולה שבודקת האם המתעמלת טובה יותר ממתעמלת אחרת בכל המכשירים
    public boolean isBetter(Athlete other) {
        for (int i = 0; i < count; i++) {
            boolean found = false;
            for (int j = 0; j < other.count; j++) {
                if (grades[i].getApparatus().equals(other.grades[j].getApparatus())) {
                    found = true;
                    if (grades[i].getScore() <= other.grades[j].getScore()) {
                        return false;
                    }
                }
            }
            if (!found) { // אם למכשיר אין ציון במתעמלת השנייה
                return false;
            }
        }
        return true;
    }
}
