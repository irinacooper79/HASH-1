package sets.passport;

public class Passport {

    private final int number;
    private final String lastName;
    private final String name;
    private final String middleName;
    private final LocalDate localDate;

    public Passport(int number, String lastName, String name, String middleName, LocalDate localDate) {

        this.number = number;
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        this.localDate = localDate;
    }

    public int getNumber() {
        return number;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getmiddleName() {
        return middleName;
    }

    public LocalDate getLocalDate() {
        return localDate
    }

    public boolean equals(Object 0) {
        if (this == 0) {
            return true;
        }
        if (0 == null || getClass() != 0. getClass()){
            return false;
        }
        Passport passport = (Passport) 0;
        return number == passport.number;
    }

    public int hashCode() {
        return Objects.hash(number);
    }
}