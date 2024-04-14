package lesson1;

public class Lesson1_2 {
    public static void main(String[] args) {
        String name, surname, residence, englishLevel, phone, exp;
        int age;
        name = "Ihor";
        surname = "Shliakhovyi";
        residence = "Ukraine";
        englishLevel = "hopefuly Upper-intermediate";
        exp = "2 years";
        age = 32;
        phone = "+38(096)815xxxx";
        System.out.println("I am "+surname + " " +  name + " and I'm " + age + " years old"
                + "\n" + "I'm living in " + residence + " at the moment." +"\n"+ "My english level " + englishLevel
                + "\n" + "I've been working as a QA for the last "+ exp + "\n" + "You can contact me using a "+ phone+" number. See ya:)");
    }
}
