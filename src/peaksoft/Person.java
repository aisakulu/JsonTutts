package peaksoft;

public class Person {
    private String firstName;
    private String lastName;
    private String alias;
    private int age;
    private boolean isMale;
    private Adress adress;

    public Person(String firstName, String lastName, String alias, int age, boolean isMale, Adress adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.alias = alias;
        this.age = age;
        this.isMale = isMale;
        this.adress = adress;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", alias='" + alias + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                ", adress=" + adress +
                '}';
    }
}
