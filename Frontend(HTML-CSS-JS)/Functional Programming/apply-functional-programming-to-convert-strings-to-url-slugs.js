function urlSlug(title) {
  return title.trim().toLowerCase().split(/\s+/).join("-");
}

console.log(urlSlug("   Stop Using Reduce   "));
console.log(urlSlug("A Practical Guide to Functional Programming"));
