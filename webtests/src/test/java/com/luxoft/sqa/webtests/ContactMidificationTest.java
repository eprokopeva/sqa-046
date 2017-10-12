package com.luxoft.sqa.webtests;

import com.luxoft.sqa.model.ContactParameters;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactMidificationTest extends TestBase {

    @Test
    public void testContactMidification () {
        login("admin", "secret");
        selectCheckBox();
        pressEdit();
        fillContact(new ContactParameters("Vasy", "Ivanov", "Novosibirsk", "chrome"));
        pressUpDate();
    }

}
