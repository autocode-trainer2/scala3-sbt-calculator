package com.epam

import org.scalatest.funsuite.AnyFunSuite

class CalculatorTest extends AnyFunSuite {
  test("Calculator.add positive") {
    assert(Calculator.add(2, 2) == 4)
  }

  test("Calculator.add negative") {
    assert(Calculator.add(2, -2) == 0)
  }

  test("Calculator.subtract") {
    assert(Calculator.subtract(5, 3) == 2)
  }

  test("Calculator.multiply") {
    assert(Calculator.multiply(2, 2) == 4)
  }

  test("Calculator.divide") {
    assert(Calculator.divide(2, 0) == 0)
    assert(Calculator.divide(9, 3) == 3)
  }
}
