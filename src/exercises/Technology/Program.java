package exercises.Technology;

import org.junit.Test;

import static org.junit.Assert.*;

public class Program {

    @Test
    public void laptopInheritsComputerClass() {

        Laptop pavilion = new Laptop(500, 4, true, "Windows");

    }

    @Test
    public void smartPhoneInheritsComputerClass() {
        SmartPhone iPhone = new SmartPhone(64, 4, false, 40);

    }
}
