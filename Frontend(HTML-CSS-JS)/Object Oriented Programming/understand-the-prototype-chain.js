function Dog(name) {
  this.name = name;
}

let beagle = new Dog("Snoopy");
Dog.prototype.isPrototypeOf(beagle);

// Fix the code below so that it evaluates to true
Object.prototype.isPrototypeOf(Dog.prototype);
