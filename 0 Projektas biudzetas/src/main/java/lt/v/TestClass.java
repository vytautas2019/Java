package lt.v;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestClass {
    @Test
    public void testsetCategoriesAmount() {
        Income income = new Income();


        income.setCategoriesAmount(0,200);
        assertEquals(200.0,income.getAmount());

    }

}
