// Only change code below this line
class Thermostat {
  constructor(Farenheit) {
    this._temperature = Farenheit;
  }
  get temperature() {
    return (5 / 9) * (this._temperature - 32);
  }
  set temperature(Celcius) {
    this._temperature = (Celcius * 9.0) / 5 + 32;
  }
}
// Only change code above this line

const thermos = new Thermostat(76);
let temp = thermos.temperature;
thermos.temperature = 26;
temp = thermos.temperature;
