package cucumber_example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import static org.junit.Assert.assertEquals;

public class Steps {
    private LocalDate birthDate;
    private long calculatedAgeInDays;

    @Given("the user provides a birthdate as {string}")
    public void theUserProvidesABirthdateAs(String birthdate) {
        String[] dateSegments = birthdate.split("/");
        int day = Integer.parseInt(dateSegments[0]);
        int month = Integer.parseInt(dateSegments[1]);
        int year = Integer.parseInt(dateSegments[2]);
        birthDate = LocalDate.of(year, month, day);
    }

    @When("the user calculates the age")
    public void theUserCalculatesTheAge() {
        LocalDate currentDate = LocalDate.now();
        calculatedAgeInDays = ChronoUnit.DAYS.between(birthDate, currentDate);
    }

    @Then("the calculated age in days should be {long}")
    public void theCalculatedAgeInDaysShouldBe(long expectedAgeInDays) {
        assertEquals(expectedAgeInDays, calculatedAgeInDays);
    }
}
