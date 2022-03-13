package com.epam

object Calculator {
  def add(x: Int, y: Int): Int = x + y

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
