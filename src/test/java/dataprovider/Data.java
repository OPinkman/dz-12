package dataprovider;

import org.testng.annotations.DataProvider;


import java.io.IOException;


public class Data {
    @DataProvider(name = "man")
    public static Object[][] man(){
        return new Object[][]{
                {"Oleksandr", "Petrov", "man", 66, null}
        };
    }

    @DataProvider(name = "manWoman")
    public static Object[][] manWoman() {
        return new Object[][]{
                {"Oleksandr", "Petrov", "man", 66, null, "Vicrotia", "Pravoberegna", "woman", 65, null}
        };
    }
}

