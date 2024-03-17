public class Group {
    private String name;
    private Athlete[] athletes;
    private int count; // משתנה לספירת מספר האתלטים בקבוצה

    // פעולה בונה
    public Group(String name, int size) {
        this.name = name;
        this.athletes = new Athlete[size];
        this.count = 0;
    }

    // הוספת אתלט
    public boolean addAthlete(Athlete athlete) {
        if (count < athletes.length) {
            athletes[count++] = athlete;
            return true;
        }
        return false;
    }

 // מחיקת אתלט
    public boolean deleteAthlete(String name) {
        for (int i = 0; i < count; i++) {
            if (athletes[i].getName().equals(name)) {
                athletes[i] = null; 
                return true;
            }
        }
        return false;
    }

    // מחזירה את שם האתלט עם הממוצע הגבוה ביותר
    public String getBestAthleteName() {
        double highestAverage = 0;
        String bestAthleteName = null;
        for (int i = 0; i < athletes.length; i++) {
            if (athletes[i] != null) {
                double average = athletes[i].average();
                if (average > highestAverage) {
                    highestAverage = average;
                    bestAthleteName = athletes[i].getName();
                }
            }
        }
        return bestAthleteName;
    }

    // הוספת ציון לאתלט
    public boolean addGrade(String athleteName, String apparatus, double score) {
        for (int i = 0; i < count; i++) {
            if (athletes[i].getName().equals(athleteName)) {
                return athletes[i].addGrade(apparatus, score);
            }
        }
        return false;
    }
}
