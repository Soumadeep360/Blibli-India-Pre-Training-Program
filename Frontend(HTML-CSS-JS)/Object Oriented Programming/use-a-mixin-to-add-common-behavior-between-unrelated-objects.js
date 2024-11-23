let glideMixin = function (obj) {
  obj.glide = function () {
    console.log("Gliding smoothly!");
  };
};

let bird = {
  name: "Donald",
  numLegs: 2,
};

let boat = {
  model: "Yacht",
  capacity: 8,
};

glideMixin(bird);
glideMixin(boat);

bird.glide();
boat.glide();
