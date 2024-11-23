function factorialize(num) {
  if (num == 0 || num == 1) {
    return 1;
  }

  return factorialize(num - 1) * num;
}

factorialize(5);
