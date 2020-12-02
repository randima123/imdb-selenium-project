package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest{

//    @Test
//    public void testSearchMovie() {
//
//        Assert.assertEquals(basePage.getTitle(),"IMDb: Ratings, Reviews, and Where to Watch the Best Movies & TV Shows",
//                "Home page title matches");
//
//        homePage.enterMovie("The Good Dinosaur");
//        homePage.clickOnSearchButton();
//
//        Assert.assertEquals(basePage.getTitle(),"Find - IMDb", "Search page title not matched");
//    }

    @Test
    public void testSearchUpcomingRelease() {
        Assert.assertEquals(basePage.getTitle(),"IMDb: Ratings, Reviews, and Where to Watch the Best Movies & TV Shows");

        homePage.clickOnNavDrawer();
        homePage.clickReleaseCalender();

        Assert.assertTrue(basePage.getTitle().contains("Upcoming Releases"));
    }

}
