public class Person {
    private final TelephoneNumber telephoneNumber = new TelephoneNumber();
    private String name;

    public String getName() {
        return name;
    }

    public Person(String name, String officeAreaCode, String officeNumber) {
        this.name = name;
        this.telephoneNumber.setOfficeAreaCode(officeAreaCode);
        this.telephoneNumber.setOfficeNumber(officeNumber);
    }

    public String getTelephoneNumber() {
        return ("(" + telephoneNumber.getOfficeAreaCode() + ") " + telephoneNumber.getOfficeNumber());
    }

    String getOfficeAreaCode() {
        return telephoneNumber.getOfficeAreaCode();
    }

    void setOfficeAreaCode(String arg) {
        telephoneNumber.setOfficeAreaCode(arg);
    }

    String getOfficeNumber() {
        return telephoneNumber.getOfficeNumber();
    }

    void setOfficeNumber(String arg) {
        telephoneNumber.setOfficeNumber(arg);
    }
}
