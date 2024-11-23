function mutation(arr) {
  let firstWord = arr[0].toLowerCase();
  let secondWord = arr[1].toLowerCase();

  return secondWord
    .split("")
    .every((character) => firstWord.includes(character));
}

mutation(["hello", "hey"]);
