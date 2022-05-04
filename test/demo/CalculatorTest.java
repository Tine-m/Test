package demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  Calculator calculator = new Calculator();

  @BeforeEach
  public void setUp() {
    //Arrange
    calculator = new Calculator();
  }

  @Test
  void sumIntegers() {
    //Act
    int actual = calculator.sum(5,10);
    //Assert
    assertEquals(15, actual);
  }

  @Test
  void sumLargeIntegers() {
    //Act
    long actual = calculator.sum(Integer.MAX_VALUE,Integer.MAX_VALUE);
    //Assert
    assertEquals(-2, actual);
  }

  @Test
  void sumNearlyTooLargeIntegers() {
    //Act
    int actual = calculator.sum(1000,1000);
     //Assert
    assertEquals(2000, actual);
  }


  @ParameterizedTest
  @CsvSource(value = {"1000:1000:2000", "999:999:1998", "1:1000:1001", "-1:1:0"}, delimiter = ':')
  void sumDataDriven(int input1, int input2, int expected) {
     //Act
    int actual = calculator.sum(input1,input2);
    //Assert
    assertEquals(expected, actual);
  }

  @Disabled
  @Test
  void sumTooLargeIntegers2() {
    //Act + Assert
    assertThrows(IllegalArgumentException.class,() -> {
      calculator.sum(Integer.MAX_VALUE, Integer.MAX_VALUE);
    });
  }

  @Test
  void sumDecimals() {
     //Act
    double actual = calculator.sum(5.559,10.333);
    //Assert
    assertEquals(15.892, actual);
  }
}