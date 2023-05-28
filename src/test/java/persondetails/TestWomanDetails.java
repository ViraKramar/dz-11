package persondetails;

import com.rb_dr.person.Man;
import com.rb_dr.person.Person;
import com.rb_dr.person.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestWomanDetails {

    private Woman someWoman;
    private Man someMan;
    private final List < Person > women = new ArrayList < > ();

    @BeforeMethod(groups = {
            "Smoke"
    })
    public void createWoman() {
        someWoman = new Woman("Hanna", "Fox", "Fox", 61, "Walking",
                someMan);
        someWoman.addWoman(someWoman);
    }
    @BeforeMethod(groups = {
            "Smoke"
    })
    public void createMan() {
        someMan = new Man("Nick", "Hunter", "Hunter", 45, "Running",
                someWoman);
    }
    @Test
    public void testIfContain() {
        Assert.assertEquals(someWoman.isContain(someWoman), true,
                "Problems with adding to Array List function for Woman");
    }
    @Test
    public void testIfWomanRetired() {

        Assert.assertEquals(someWoman.isRetired(), true, " Is Retired function works wrong for Woman");
    }

    @Test
    public void testIfRegisterPartnership() {
        Assert.assertEquals(someWoman.registerPartnership(), "Hunter",
                "Register Partnership function works wrong for Woman");
    }
    @Test
    public void testIfHasBadge() {
        Assert.assertEquals(someWoman.getBadgeActive(), "Hanna has not Active Badge yet",
                "If Has Badge function works wrong for Woman");
    }

    @Test
    public void testIfDeregisterPartnership() {
        Assert.assertEquals(someWoman.deregisterPartnership(true), "Fox",
                "If Deregister Partnership function works wrong for Woman");
    }
    @Test(groups = {
            "Smoke"
    })
    public void testFirstNameGet() {
        Assert.assertEquals(someWoman.getFirstName(), "Hanna",
                "The First name Getting function works wrong for Woman");
    }

    @Test(groups = {
            "Smoke"
    })
    public void testFirstNameSet() {
        Assert.assertEquals(someWoman.setFirstName("Tess"), "Tess",
                "The First name Setting function works wrong for Woman");
    }

    @Test(groups = {
            "Smoke"
    })
    public void testLastNameGet() {
        Assert.assertEquals(someWoman.getLastName(), "Fox",
                "The Last name Getting function works wrong for Woman");
    }

    @Test(groups = {
            "Smoke"
    })
    public void testLastNameSet() {
        Assert.assertEquals(someWoman.setLastName("Fix"), "Fix",
                "The Last name Setting function works wrong for Woman");
    }

    @Test(groups = {
            "Smoke"
    })
    public void testAgeGet() {
        Assert.assertEquals(someWoman.getAge(), 61,
                "The Age Getting function works wrong for Woman");
    }

    @Test(groups = {
            "Smoke"
    })
    public void testAgeSet() {
        Assert.assertEquals(someWoman.setAge(45), 45,
                "The Age Setting function works wrong for Woman");
    }
    @Test(groups = {
            "Smoke"
    })
    public void testHobbyGet() {
        Assert.assertEquals(someWoman.getHobby(), "Walking",
                "The Hobby Getting function works wrong for Woman");
    }

    @Test(groups = {
            "Smoke"
    })
    public void testHobbySet() {
        Assert.assertEquals(someWoman.setHobby("Gardening"), "Gardening",
                "The Hobby Setting function works wrong for Woman");
    }
    @Test(groups = {
            "Smoke"
    })
    public void testPartnerGet() {
        Assert.assertEquals(someWoman.getPartner(), someMan,
                "The Partner Getting function works wrong for Woman");
    }

    @Test(groups = {
            "Smoke"
    })
    public void testPartnerSet() {
        Assert.assertEquals(someWoman.setPartner(null), null,
                "The Partner Setting function works wrong for Woman");
    }
}