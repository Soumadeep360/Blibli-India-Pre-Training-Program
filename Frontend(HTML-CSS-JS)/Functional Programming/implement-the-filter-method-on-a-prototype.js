Array.prototype.myFilter = function (callback) {
  let result = [];
  for (let i = 0; i < this.length; i++) {
    if (this.hasOwnProperty(i) && callback(this[i], i, this)) {
      result.push(this[i]);
    }
  }
  return result;
};
