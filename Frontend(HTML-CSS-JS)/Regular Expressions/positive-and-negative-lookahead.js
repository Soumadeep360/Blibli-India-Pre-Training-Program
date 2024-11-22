let sampleWord = "astronaut";
let pwRegex = /^(?=.*\d{2})(?=\w{6,})/;
let result = pwRegex.test(sampleWord);
