let scriptsForLoad = 0;
const rerun = document.getElementById("run");
rerun.onclick = executeSolution;
const selector = document.getElementById("solutions");
selector.onchange = executeSolution;
const solutionNames = [
  ["solution", ""],
  ["1-01-three-messages", "Solution101"],
  ["1-02-five-messages", "Solution102"],
  ["1-03-pattern", "Solution103"],
  ["1-04-table", "Solution104"],
  ["1-05-computator", "Solution105"],
  ["1-06-summation-series", "Solution106"],
  ["1-07-approximate-pi", "Solution107"],
  ["1-08-circle-measure", "Solution108"],
  ["1-09-rectangle-measure", "Solution109"],
  ["1-10-average-speed", "Solution110"],
  ["1-11-projection", "Solution111"],
  ["1-12-speed-calc", "Solution112"],
  ["1-13-algebra", "Solution113"],
];
const allSolutions = [];

window.onload = function () {
  scriptsForLoad = solutionNames.length;
  solutionNames.forEach((name) => {
    const newScript = document.createElement("script");
    newScript.src = "scripts/" + name[0] + ".js";
    newScript.async = true;
    newScript.onload = onLoadedScript;
    document.head.appendChild(newScript);
  });
};

function onLoadedScript() {
  scriptsForLoad--;
  if (scriptsForLoad == 0) {
    solutionNames.slice(1).forEach((name) => {
      allSolutions.push(eval("new " + name[1]));
    });
    allSolutions.sort((a, b) => a.orderNumber - b.orderNumber);
    allSolutions.forEach((solution) => {
      const newOption = document.createElement("option");
      newOption.value = solution.id;
      newOption.innerText = solution.label;
      selector.append(newOption);
    });
  }
}

function executeSolution() {
  if (selector.value != "") {
    const out = document.getElementById("out");
    out.querySelectorAll("p").forEach((p) => out.removeChild(p));

    const solution = allSolutions.filter(
      (item) => item.id == selector.value
    )[0];
    const title = document.getElementById("title");
    title.innerText = solution.label;

    const answer = solution.answer();
    if (!solution.isPattern) {
      answer.forEach((output) => {
        const paragraph0 = document.createElement("p");
        out.append(paragraph0);
        paragraph0.innerText = output;
      });
    } else {
      const paragraph = document.createElement("p");
      out.append(paragraph);
      const preformated = document.createElement("pre");
      paragraph.append(preformated);
      preformated.innerHTML = answer.join("<br>");
    }
  }
}
