package com.epam

object Calculator {
  def add(x: Int, y: Int): Int = x + y

  def pow(x: Int): Int = x * pow(x + 1)
}
