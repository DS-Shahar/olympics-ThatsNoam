public class Main2 {
    public static void main(String[] args) {
        // יצירת קבוצה
        Group group = new Group("Gymnastics Team", 5);

        // יצירת אתלטים
        Athlete athlete1 = new Athlete("Alice", 10);
        Athlete athlete2 = new Athlete("Bob", 10);

        // הוספת אתלטים לקבוצה
        group.addAthlete(athlete1);
        group.addAthlete(athlete2);

        // הוספת ציונים לאתלטים
        group.addGrade("Alice", "Floor", 10);
        group.addGrade("Alice", "Bea	m", 9.4);
        group.addGrade("Bob", "Floor", 9.4);
        group.addGrade("Bob", "Beam", 9.8);

        // מציג את האתלט הטוב ביותר בקבוצה
        String bestAthlete = group.getBestAthleteName();
        System.out.println("Best athlete in the group is: " + bestAthlete);

        // מוחק אתלט ומציג את השם שוב
        group.deleteAthlete("Alice");
        bestAthlete = group.getBestAthleteName();
        System.out.println("After deletion, best athlete in the group is: " + bestAthlete);
    }
}
