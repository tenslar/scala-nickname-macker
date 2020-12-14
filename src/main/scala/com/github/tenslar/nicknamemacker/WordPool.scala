package com.github.tenslar.nicknamemacker

class WordPool(var pool: Array[String]) {
    val num: Int = pool.length
    def storedNum(): Int = {
      num
    }

    def word(index: Int): String = {
      if (num <= index) {
        return ""
      }
      pool(index)
    }
  }
