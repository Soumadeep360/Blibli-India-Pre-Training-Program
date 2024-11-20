function multiplyAll(arr) {
  let ans = 1;
  for (let i = 0; i < arr.length; i++) {
    for (let j = 0; j < arr[i].length; j++) {
      ans *= arr[i][j];
    }
  }
  return ans;
}

multiplyAll([
  [1, 2],
  [3, 4],
  [5, 6, 7],
]);
