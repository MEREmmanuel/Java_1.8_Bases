
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

public class EggJUnitTest {

    private DiscountCalculator dCalculator;
    private TemperatureConverter tConverter;
    private PasswordValidator pValidator;
    private TaskManager tManager;
    private DateValidator dValidator;

    @Before
    public void setUp() {
        dCalculator = new DiscountCalculator();
        tConverter = new TemperatureConverter();
        pValidator = new PasswordValidator();
        tManager = new TaskManager();
        dValidator = new DateValidator();
    }
    
    @After
    public void setDown(){
        dCalculator = null;
        tConverter = null;
        pValidator = null;
        tManager = null;
        dValidator = null;
    }

    @Test
    public void testDiscount() {
        //10%
        assertEquals(450, dCalculator.calculateDiscount(500, 10), 0);

        //100%
        assertEquals(0, dCalculator.calculateDiscount(500, 100), 0);

        //non discount
        assertEquals(500, dCalculator.calculateDiscount(500, 0), 0);
    }

    @Test
    public void testTConverter() {
        //c to f
        assertEquals(33.8, tConverter.celsiusToFahrenheit(1), 0);

        //f to c
        assertEquals(-17, tConverter.fahrenheitToCelsius(1), 0.23);

        //c to k
        assertEquals(274, tConverter.celsiusToKelvin(1), 0.15);

        //k to c
        assertEquals(-272, tConverter.kelvinToCelsius(1), 0.15);

        //f to k
        assertEquals(255, tConverter.fahrenheitToKelvin(1), 0.98);

        //k to f
        assertEquals(-457, tConverter.kelvinToFahrenheit(1), 0.9);
    }

    @Test
    public void testPassword() {
        //rigth pass
        boolean isValid = pValidator.isValidPassword("Password1!");
        assertTrue(isValid);

        //incorrect length
        boolean isFalseLength = pValidator.isValidPassword("Pwd1!");
        assertFalse(isFalseLength);

        //not contains minuscles
        boolean isFalseMinuscles = pValidator.isValidPassword("PASSWORD1!");
        assertFalse(isFalseMinuscles);

        //not contains mayuscles
        boolean isFalseMayuscles = pValidator.isValidPassword("password1!");
        assertFalse(isFalseMayuscles);

        //not containts numbers
        boolean isFalseNumbers = pValidator.isValidPassword("Password!");
        assertFalse(isFalseNumbers);

        //not contains other characters
        boolean isFalseCharacters = pValidator.isValidPassword("Password1");
        assertFalse(isFalseCharacters);
    }

    @Test
    public void testTask() {
        List<String> tasks = tManager.listTasks();
        //add task
        tManager.addTask("Task 1");
        assertEquals(1, tasks.size());
        assertEquals("Task 1", tasks.get(0));

        //remove task
        tManager.removeTask("Task 1");
        assertEquals(0, tasks.size());

        //tasklist
        tManager.addTask("Task 1");
        tManager.addTask("Task 2");
        tManager.addTask("Task 3");
        assertEquals(3, tasks.size());
        assertEquals("Task 3", tasks.get(2));
    }

    @Test
    public void testDate() {
        //Right Date
        boolean isValid = dValidator.isValidDate(2023, 7, 17);
        assertTrue(isValid);

        //incorrect year
        boolean isFalseYear = dValidator.isValidDate(0, 7, 17);
        assertFalse(isFalseYear);

        //incorrect month
        boolean isFalseMonth = dValidator.isValidDate(2023, 13, 17);
        assertFalse(isFalseMonth);

        //incorrect day
        boolean isFalseDay = dValidator.isValidDate(2023, 2, 30);
        assertFalse(isFalseDay);
    }
    
}
