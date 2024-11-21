const makeServerRequest = new Promise((resolve, reject) => {
  let response = true;

  if (response) {
    resolve("Server responded successfully!");
  } else {
    reject("Server failed!");
  }
});
