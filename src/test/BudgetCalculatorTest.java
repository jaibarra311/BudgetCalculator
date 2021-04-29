package test;

import controller.BudgetCalculator;
import model.Budget;
import model.ResidualBudget;
import org.junit.jupiter.api.Test;

import static model.Constant.negativeValueMessage;
import static org.junit.jupiter.api.Assertions.*;


public class BudgetCalculatorTest {


    @Test
    void Calculate_ValidBudgetInput_ReturnsResidualBudget() {
        Budget budget = new Budget(10000, 1000, 1000, 1000, 1000, 1000);
        ResidualBudget expected = new ResidualBudget(5000, 0.5);

        ResidualBudget actual = BudgetCalculator.calculate(budget);

        assertTrue(expected.equals(actual));


    }

    @Test
    void Calculate_InvalidBudgetInput_ThrowsException() {

        Exception exception = assertThrows(IllegalArgumentException.class, ()-> new Budget(-10000, 1000, 1000, 1000, 1000, 1000));
        assertEquals(negativeValueMessage, exception.getMessage());


    }

    @Test
    void fakeTest() {
        assertTrue(true);
    }

}