function squareList(arr) {
  return arr
    .filter((num) => num > 0 && Number.isInteger(num))
    .map((num) => num ** 2);
}
