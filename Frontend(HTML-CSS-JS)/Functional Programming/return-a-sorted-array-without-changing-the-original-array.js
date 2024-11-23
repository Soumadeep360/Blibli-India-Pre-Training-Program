const globalArray = [5, 6, 3, 2, 9];

function nonMutatingSort(arr) {
  // Only change code below this line
  let result = arr.slice(0);
  return result.sort((a, b) => {
    return a - b;
  });

  // Only change code above this line
}

nonMutatingSort(globalArray);
