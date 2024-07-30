import scala.io.StdIn.readLine

object StudentRecords extends App {

  // Function to validate user input
  def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
    if (name.isEmpty) {
      (false, Some("Name cannot be empty."))
    } else if (marks < 0) {
      (false, Some("Marks should be a positive integer."))
    } else if (totalMarks <= 0) {
      (false, Some("Total possible marks should be a positive integer."))
    } else if (marks > totalMarks) {
      (false, Some("Marks cannot exceed total possible marks."))
    } else {
      (true, None)
    }
  }

  // Function to get student information
  def getStudentInfo(): (String, Int, Int, Double, Char) = {
    var name = ""
    var marks = -1
    var totalMarks = -1

    // Read and validate student name
    while (name.isEmpty) {
      print("Enter student name: ")
      name = readLine().trim
      if (name.isEmpty) {
        println("Name cannot be empty. Please enter a valid name.")
      }
    }

    // Read and validate marks
    while (marks < 0) {
      print("Enter marks obtained: ")
      marks = readLine().toIntOption.getOrElse(-1)
      if (marks < 0) {
        println("Marks should be a positive integer.")
      }
    }

    // Read and validate total possible marks
    while (totalMarks <= 0 || marks > totalMarks) {
      print("Enter total possible marks: ")
      totalMarks = readLine().toIntOption.getOrElse(-1)
      if (totalMarks <= 0 || marks > totalMarks) {
        println("Total possible marks should be a positive integer greater than or equal to marks obtained.")
      }
    }

    // Calculate percentage
    val percentage = (marks.toDouble / totalMarks) * 100

    // Assign grade
    val grade = percentage match {
      case p if p >= 90 => 'A'
      case p if p >= 75 => 'B'
      case p if p >= 50 => 'C'
      case _ => 'D'
    }

    (name, marks, totalMarks, percentage, grade)
  }

  // Function to print student record
  def printStudentRecord(student: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = student
    println(s"Name: $name")
    println(s"Marks: $marks")
    println(s"Total Marks: $totalMarks")
    println(f"Percentage: $percentage%.2f%%")
    println(s"Grade: $grade")
  }

  // Function to get student info with retry
  def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
    var isValid = false
    var student: (String, Int, Int, Double, Char) = ("", 0, 0, 0.0, ' ')

    while (!isValid) {
      println("Enter student details:")
      val name = readLine("Name: ").trim
      val marks = readLine("Marks: ").toIntOption.getOrElse(-1)
      val totalMarks = readLine("Total Marks: ").toIntOption.getOrElse(-1)

      val (valid, errorMessage) = validateInput(name, marks, totalMarks)

      if (valid) {
        val percentage = (marks.toDouble / totalMarks) * 100
        val grade = percentage match {
          case p if p >= 90 => 'A'
          case p if p >= 75 => 'B'
          case p if p >= 50 => 'C'
          case _ => 'D'
        }
        student = (name, marks, totalMarks, percentage, grade)
        isValid = true
      } else {
        println(s"Invalid input: ${errorMessage.getOrElse("Unknown error")}")
      }
    }

    student
  }

  // Example usage of getStudentInfoWithRetry and printStudentRecord
  val studentInfo = getStudentInfoWithRetry()
  printStudentRecord(studentInfo)
}
