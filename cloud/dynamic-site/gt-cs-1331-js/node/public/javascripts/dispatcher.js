document.getElementById("run").onclick = executeSolution;
const selector = document.getElementById("solutions");
selector.onchange = executeSolution;

let allSolutions = [];

window.onload = function () {
  var xhr = new XMLHttpRequest();
  xhr.onreadystatechange = function () {
    if (xhr.readyState === 4) {
      allSolutions = JSON.parse(xhr.responseText);
      allSolutions.sort((a, b) => a.order - b.order);
      allSolutions.forEach((solution) => {
        const newOption = document.createElement("option");
        newOption.value = solution.id;
        newOption.innerText = solution.label;
        selector.append(newOption);
      });
    }
  };
  xhr.open("GET", "/solutions");
  xhr.send();
};

function executeSolution() {
  if (selector.value != "") {
    const out = document.getElementById("out");
    out.querySelectorAll("p").forEach((p) => out.removeChild(p));

    const solution = allSolutions.filter(
      (item) => item.id == selector.value
    )[0];
    const title = document.getElementById("title");
    title.innerText = solution.label;

    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function () {
      if (xhr.readyState === 4) {
        const answer = JSON.parse(xhr.responseText);
        if (!answer.isPattern) {
          answer.output.forEach((output) => {
            const paragraph0 = document.createElement("p");
            out.append(paragraph0);
            paragraph0.innerText = output;
          });
        } else {
          const paragraph = document.createElement("p");
          out.append(paragraph);
          const preformated = document.createElement("pre");
          paragraph.append(preformated);
          preformated.innerHTML = answer.output.join("<br>");
        }
      }
    };
    xhr.open("GET", "/solutions/" + selector.value);
    xhr.send();
  }
}
