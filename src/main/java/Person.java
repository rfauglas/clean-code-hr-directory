public class Person {
    private String name;
    private String officeAreaCode;
    private String officeNumber;

    public String getName() {
        return name;
    }

    public Person(String name, String officeAreaCode, String officeNumber) {
        this.name = name;
        this.officeAreaCode = officeAreaCode;
        this.officeNumber = officeNumber;
    }

    public String getTelephoneNumber() {
        return ("(" + officeAreaCode + ") " + officeNumber);
    }

    String getOfficeAreaCode() {
        return officeAreaCode;
    }

    void setOfficeAreaCode(String arg) {
        officeAreaCode = arg;
    }

    String getOfficeNumber() {
        return officeNumber;
    }

    void setOfficeNumber(String arg) {
        officeNumber = arg;
    }
}
