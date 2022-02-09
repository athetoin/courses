document.getElementById("run").onclick = executeSolution;
const selector = document.getElementById("solutions");
selector.onchange = executeSolution;

window.onload = function () {
  getData("/solutions", function (solutions) {
    solutions.sort((a, b) => a.order - b.order);
    solutions.forEach((solution) => {
      const newOption = document.createElement("option");
      newOption.value = solution.id;
      newOption.innerText = solution.label;
      selector.append(newOption);
    });
  });
};

function executeSolution() {
  if (selector.value != "") {
    const out = document.getElementById("out");
    out.querySelectorAll("p").forEach((p) => out.removeChild(p));

    const title = document.getElementById("title");
    title.innerText = selector.options[selector.selectedIndex].text;

    getData("/solutions/" + selector.value, function (answer) {
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
    });
  }
}

function getData(url, callback) {
  var xhr = new XMLHttpRequest();
  xhr.onreadystatechange = function () {
    if (xhr.readyState === 4) {
      callback(JSON.parse(xhr.responseText));
    }
  };
  xhr.open("GET", url);
  xhr.send();
}
