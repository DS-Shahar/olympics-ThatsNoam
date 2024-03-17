
public class Main1 {

		public static void main(String[] args) {
	        // יצירת שני ספורטאיות
	        Athlete athlete1 = new Athlete("Alice", 5);
	        Athlete athlete2 = new Athlete("Bob", 5);

	        // הוספת ציונים לספורטאיות
	        athlete1.addGrade("Floor", 15.0);
	        athlete1.addGrade("Vault", 14.5);
	        athlete1.addGrade("Beam", 16.0);

	        athlete2.addGrade("Floor", 14.0);
	        athlete2.addGrade("Vault", 15.0);
	        athlete2.addGrade("Beam", 15.5);

	        // הצגת ממוצע ציונים
	        System.out.println("Average score of " + athlete1.getName() + ": " + athlete1.average());
	        System.out.println("Average score of " + athlete2.getName() + ": " + athlete2.average());

	        // בדיקה אם כל הציונים מעל ערך מסוים
	        System.out.println(athlete1.getName() + " all grades above 14.0? " + athlete1.allGradesAbove(14.0));
	        System.out.println(athlete2.getName() + " all grades above 15.0? " + athlete2.allGradesAbove(15.0));

	        // בדיקה מי מהספורטאיות טובה יותר
	        System.out.println(athlete1.getName() + " is better than " + athlete2.getName() + "? " + athlete1.isBetter(athlete2));

	        // מחיקת ציון
	        athlete1.deleteGrade("Vault");
	        System.out.println("After deleting Vault, " + athlete1.getName() + "'s average: " + athlete1.average());

	        // הצגת הציונים שנותרו
	        System.out.println(athlete1.getName() + "'s remaining grades:");
	        for (int i = 0; i < athlete1.getCount(); i++) {
	            Grade grade = athlete1.getGrades()[i];
	            if (grade != null) {
	                System.out.println(grade.getApparatus() + ": " + grade.getScore());
	            }
	        }
		
	}

}
