public class TelephoneNumber {
    private String officeAreaCode;
    private String officeNumber;

    public TelephoneNumber() {
    }

    public String getOfficeAreaCode() {
        return officeAreaCode;
    }

    public TelephoneNumber setOfficeAreaCode(String officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
        return this;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public TelephoneNumber setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
        return this;
    }
}