package com.epam

object Calculator {
  println("Hello, World!")

  def add(x: Int, y: Int): Int = {
    var sum: Int = 0
    var summ: Int = 0
    sum = x + y
    return sum
  }

  def subtract(x: Int, y: Int): Int = x - y

  def multiply(x: Int, y: Int): Int = x * y

  def divide(x: Int, y: Int): Int = {
    if (y == 0) {
      0
    } else {
      x / y
    }
  }
}
