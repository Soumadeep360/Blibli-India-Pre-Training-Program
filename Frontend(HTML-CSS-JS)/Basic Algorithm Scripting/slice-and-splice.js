function frankenSplice(arr1, arr2, n) {
  let result = [].concat(arr2.slice(0, n)).concat(arr1).concat(arr2.slice(n));
  return result;
}

console.log(frankenSplice([1, 2, 3], [4, 5, 6], 1));
