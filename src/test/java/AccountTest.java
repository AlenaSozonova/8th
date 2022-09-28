import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class AccountTest {

    private final String name;
    private final Boolean expectedResult;

    @Parameterized.Parameters
    public static Collection name() {
        return Arrays.asList(new Object[][]{
                {"F", false},
                {"D D", true},
                {"jjjjjjjj jjjjjjjjjj", true},
                {"jjjjjjjj jjjjjjjjjjp", false},
                {" jkl 22", false},
                {"hjk jk ", false}
        });
    }

    public AccountTest(String name, Boolean expectedResult) {
        this.name = name;
        this.expectedResult = expectedResult;
    }

    @Test
    public void checkNameToEmbossTest() {
        //  System.out.println("Parameterized Number is : " + inputNumber);
        Account account = new Account(name);

        assertEquals(expectedResult, account.checkNameToEmboss());
    }
}