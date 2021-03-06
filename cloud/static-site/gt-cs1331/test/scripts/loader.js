var scriptsForLoad = 0;
var expect = chai.expect;

var sources = [
  "solution",
  "1-01-three-messages",
  "1-02-five-messages",
  "1-03-pattern",
  "1-04-table",
  "1-05-computator",
  "1-06-summation-series",
  "1-07-approximate-pi",
  "1-08-circle-measure",
  "1-09-rectangle-measure",
  "1-10-average-speed",
  "1-11-projection",
  "1-12-speed-calc",
  "1-13-algebra"
];

sources.forEach((name) => {
  scriptsForLoad++;
  var newScript = document.createElement("script");
  newScript.src = "../public/scripts/" + name + ".js";
  newScript.async = true;
  newScript.onload = onLoadedSource;
  document.head.appendChild(newScript);
});

function onLoadedSource() {
  scriptsForLoad--;
  if (scriptsForLoad == 0) {
    loadTests();
  }
}

function loadTests() {
  sources.slice(1).forEach((name) => {
    scriptsForLoad++;
    var newScript = document.createElement("script");
    newScript.src = "scripts/" + name + ".spec.js";
    newScript.async = true;
    newScript.onload = onLoadedTest;
    document.head.appendChild(newScript);
  });
}

function onLoadedTest() {
  scriptsForLoad--;
  if (scriptsForLoad == 0) {
    mocha.checkLeaks();
    mocha.run();
  }
}
