function chunkArrayInGroups(arr, size) {
  var result = [];

  for (let i = 0; i < arr.length; i += size) {
    result = result.concat([arr.slice(i, i + size)]);
  }

  return result;
}

chunkArrayInGroups(["a", "b", "c", "d"], 2);
