package tests;

import com.calculator.Value;
import com.calculator.standard.StandardCalculator;
import com.calculator.standard.Sum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class StandardCalculatorTest {

    @Test
    public void sum(){
        Value num1 = new Value(new BigDecimal("2"));
        Value num2 = new Value(new BigDecimal("2"));

        StandardCalculator calc = new StandardCalculator();
        BigDecimal result = calc.calcular(num1, num2, new Sum());

        Assertions.assertEquals(new BigDecimal("4"), result);
    }
}
