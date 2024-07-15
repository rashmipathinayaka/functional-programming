case class Book(title: String, author: String, isbn: String)

object LibraryManagementSystem {

  // Initial set containing at least three different books
  var library: Set[Book] = Set(
    Book("1984", "George Orwell", "1234567890"),
    Book("To Kill a Mockingbird", "Harper Lee", "1234567891"),
    Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567892")
  )

  // Function to add a new book to the library
     def addBook(book: Book): Unit = {
    if (library.exists(_.isbn == book.isbn)) {
        println(s"Book with ISBN ${book.isbn} already exists in the library.")
      } else {
      library += book
            println(s"Book '${book.title}' added to the library.")
  }
  }

  // Function to remove a book from the library by its ISBN
  def removeBookByISBN(isbn: String): Unit = {
    library.find(_.isbn == isbn) match {
      case Some(book) =>
        library -= book
        println(s"Book '${book.title}' removed from the library.")
      case None =>
        println(s"No book found with ISBN $isbn.")
    }
  }

  // Function to check if a book is already in the library by its ISBN
  def isBookInLibrary(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }

  // Function to display the current library collection
  def displayLibrary(): Unit = {
    println("\nCurrent Library Collection:")
    library.foreach { book =>
      println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
    }
  }

  // Function to search for a book by its title
  def searchBookByTitle(title: String): Unit = {
    library.find(_.title.equalsIgnoreCase(title)) match {
      case Some(book) =>
        println(s"Book found: Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      case None =>
        println(s"No book found with title '$title'.")
    }
  }

  // Function to display all books by a specific author
  def displayBooksByAuthor(author: String): Unit = {
    val booksByAuthor = library.filter(_.author.equalsIgnoreCase(author))
    if (booksByAuthor.nonEmpty) {
      println(s"\nBooks by $author:")
      booksByAuthor.foreach { book =>
        println(s"Title: ${book.title}, ISBN: ${book.isbn}")
      }
    } else {
      println(s"No books found by author '$author'.")
    }
  }

  // Main method to test the functionalities
  def main(args: Array[String]): Unit = {
    displayLibrary()

    val newBook = Book("Brave New World", "Aldous Huxley", "1234567893")
    addBook(newBook)

    displayLibrary()

    removeBookByISBN("1234567890")
    displayLibrary()

    println(s"Is book with ISBN 1234567891 in library? ${isBookInLibrary("1234567891")}")

    searchBookByTitle("The Great Gatsby")
    searchBookByTitle("Nonexistent Book")

    displayBooksByAuthor("George Orwell")
    displayBooksByAuthor("Harper Lee")
  }
}
