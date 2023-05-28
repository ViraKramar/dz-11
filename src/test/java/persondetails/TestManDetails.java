package persondetails;

import com.rb_dr.person.Man;
import com.rb_dr.person.Person;
import com.rb_dr.person.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestManDetails {
    private Man someMan;
    private Woman someWoman;
    private final List < Person > men = new ArrayList < > ();
    @BeforeMethod(groups = {
            "Smoke"
    })
    public void createMan() {
        someMan = new Man("Sam", "Wind", "Wind", 45, "Running",
                null);
        someMan.addMan(someMan);
    }

    @BeforeMethod(groups = {
            "Smoke"
    })
    public void createWoman() {
        someWoman = new Woman("Helena", "Purple", "Purple", 61, "Walking",
                null);
    }
    @Test
    public void testIfContain() {
        Assert.assertEquals(someMan.isContain(someMan), true,
                "Problems with adding to Array List function for Man");
    }
    @Test
    public void testIfManRetired() {

        Assert.assertEquals(someMan.isRetired(), false, " Is Retired function works wrong for Man");
    }
    @Test
    public void testIfHasBadge() {
        Assert.assertEquals(someMan.getBadgeActive(), "Sam has not Relax Badge yet",
                "If Has Badge function works wrong for Man");
    }
    @Test(groups = {
            "Smoke"
    })
    public void testFirstNameGet() {
        Assert.assertEquals(someMan.getFirstName(), "Sam", "The First name Getting function works wrong for Man");
    }

    @Test(groups = {
            "Smoke"
    })
    public void testFirstNameSet() {
        Assert.assertEquals(someMan.setFirstName("Dan"), "Dan", "The First name Setting function works wrong for Man");
    }

    @Test(groups = {
            "Smoke"
    })
    public void testLastNameGet() {
        Assert.assertEquals(someMan.getLastName(), "Wind", "The Last name Getting function works wrong for Man");
    }

    @Test(groups = {
            "Smoke"
    })
    public void testLastNameSet() {
        Assert.assertEquals(someMan.setLastName("Windy"), "Windy", "The Last name Setting function works wrong for Man");
    }

    @Test(groups = {
            "Smoke"
    })
    public void testAgeGet() {
        Assert.assertEquals(someMan.getAge(), 45, "The Age Getting function works wrong for Man");
    }

    @Test(groups = {
            "Smoke"
    })
    public void testAgeSet() {
        Assert.assertEquals(someMan.setAge(75), 75, "The Age Setting function works wrong for Man");
    }
    @Test(groups = {
            "Smoke"
    })
    public void testHobbyGet() {
        Assert.assertEquals(someMan.getHobby(), "Running", "The Hobby Getting function works wrong for Man");
    }

    @Test(groups = {
            "Smoke"
    })
    public void testHobbySet() {
        Assert.assertEquals(someMan.setHobby("Gardening"), "Gardening", "The Hobby Setting function works wrong for Man");
    }
    @Test(groups = {
            "Smoke"
    })
    public void testPartnerGet() {
        Assert.assertEquals(someMan.getPartner(), null, "The Partner Getting function works wrong for Man");
    }

    @Test(groups = {
            "Smoke"
    })
    public void testPartnerSet() {
        Assert.assertEquals(someMan.setPartner(someWoman), someWoman, "The Partner Setting function works wrong for Man");
    }
}