function largestOfFour(arr) {
  let largestNumbersArray = [];

  for (let i = 0; i < arr.length; i++) {
    let largest = Math.max(...arr[i]);
    largestNumbersArray.push(largest);
  }

  return largestNumbersArray;
}

largestOfFour([
  [4, 5, 1, 3],
  [13, 27, 18, 26],
  [32, 35, 37, 39],
  [1000, 1001, 857, 1],
]);
