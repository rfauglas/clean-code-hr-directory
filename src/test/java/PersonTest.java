import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void createPerson() {
        Person person = new Person("test","33","99999999");
        assertEquals("(33) 99999999",person.getTelephoneNumber());
    }
}