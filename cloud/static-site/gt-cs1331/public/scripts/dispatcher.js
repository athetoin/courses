var scriptsForLoad = 0;
document.getElementById("run").onclick = executeSolution;
var selector = document.getElementById("solutions");

window.onload = function () {
  var solutionNames = [
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
    "1-12-speed-calc"
  ];
  scriptsForLoad = solutionNames.length;
  solutionNames.forEach((name) => {
    var newScript = document.createElement("script");
    newScript.src = "scripts/" + name + ".js";
    newScript.async = true;
    newScript.onload = onLoadedScript;
    document.head.appendChild(newScript);
  });
};

function onLoadedScript() {
  scriptsForLoad--;
  if (scriptsForLoad == 0) {
    allSolutions.sort((a, b) => a.orderNumber - b.orderNumber);
    allSolutions.forEach((solution) => {
      var newOption = document.createElement("option");
      newOption.value = solution.id;
      newOption.innerText = solution.label;
      selector.append(newOption);
    });
  }
}

function executeSolution() {
  if (selector.value != "") {
    var out = document.getElementById("out");
    out.querySelectorAll("p").forEach((p) => out.removeChild(p));

    var solution = allSolutions.filter((item) => item.id == selector.value)[0];
    var title = document.getElementById("title");
    title.innerText = solution.label;

    var answer = solution.answer();
    if (!solution.isPattern) {
      answer.forEach((output) => {
        var paragraph = document.createElement("p");
        out.append(paragraph);
        paragraph.innerText = output;
      });
    } else {
      var paragraph = document.createElement("p");
      out.append(paragraph);
      var preformated = document.createElement("pre");
      paragraph.append(preformated);
      preformated.innerHTML = answer.join("<br>");
    }
  }
}
