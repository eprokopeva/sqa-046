package com.luxoft.sqa.webtests;

import com.luxoft.sqa.model.ContactParameters;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase
{


    @Test
    public void testCreationNewAddressBook (){
        login("admin", "secret");
        pressAddNewBotton();
        fillContact(new ContactParameters("Elena","Prokopeva", "Onsk", "yandex"));
        submitContactCreation();
    }


}
