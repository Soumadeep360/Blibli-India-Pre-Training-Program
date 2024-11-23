Array.prototype.myMap = function (callback) {
  const newArray = [];
  for (let i = 0; i < this.length; i++) {
    if (this.hasOwnProperty(i)) {
      newArray.push(callback(this[i], i, this));
    }
  }
  return newArray;
};
