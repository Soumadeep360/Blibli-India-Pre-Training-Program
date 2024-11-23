// The global variable
const bookList = [
  "The Hound of the Baskervilles",
  "On The Electrodynamics of Moving Bodies",
  "Philosophiæ Naturalis Principia Mathematica",
  "Disquisitiones Arithmeticae",
];

// Change code below this line
function add(bookList, bookName) {
  let result = bookList.slice(0);
  result.push(bookName);
  return result;

  // Change code above this line
}

// Change code below this line
function remove(bookList, bookName) {
  const book_index = bookList.indexOf(bookName);
  if (book_index >= 0) {
    let result = bookList.slice(0);
    result.splice(book_index, 1);
    return result;

    // Change code above this line
  }
}
