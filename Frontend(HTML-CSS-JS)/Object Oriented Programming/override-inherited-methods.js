function Animal() {}
Animal.prototype.eat = function () {
  return "nom nom nom";
};

function Bird() {}
Bird.prototype = Object.create(Animal.prototype);
Bird.prototype.fly = function () {
  return "I am flying!";
};

function Penguin() {}
Penguin.prototype = Object.create(Bird.prototype);
Penguin.prototype.fly = function () {
  return "Alas, this is a flightless bird.";
};

let penguin = new Penguin();
console.log(penguin.eat());
console.log(penguin.fly());
