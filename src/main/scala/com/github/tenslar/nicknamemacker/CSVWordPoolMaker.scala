package NicknameMacker

import java.io.File

import scala.io.Source

class CSVWordPoolMaker() {
  def make(csvPath: String): WordPool = {
    val csv = new File(csvPath)

    val reader = Source.fromFile(csv, "utf8")

    val lines = reader.getLines()

    val words = lines.map(line => line.split(",")(0)).toArray
    new WordPool(words)
  }
}
