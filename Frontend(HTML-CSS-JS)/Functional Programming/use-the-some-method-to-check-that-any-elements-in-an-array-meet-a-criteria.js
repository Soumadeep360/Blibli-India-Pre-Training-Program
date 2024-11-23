function checkPositive(arr) {
  return arr.some((item) => {
    return item > 0;
  });
}

checkPositive([1, 2, 3, -4, 5]);
