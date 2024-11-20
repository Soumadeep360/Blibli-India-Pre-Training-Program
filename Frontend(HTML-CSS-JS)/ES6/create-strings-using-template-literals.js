const result = {
  success: ["max-length", "no-amd", "prefer-arrow-functions"],
  failure: ["no-var", "var-on-top", "linebreak"],
  skipped: ["no-extra-semi", "no-dup-keys"],
};
function makeList(a) {
  // Only change code below this line
  const ans = [];

  for (let i = 0; i < a.length; i++) {
    ans.push(`<li class="text-warning">${a[i]}</li>`);
  }
  // Only change code above this line

  return ans;
}

const failuresList = makeList(result.failure);

console.log(failuresList);
