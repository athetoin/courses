var scriptsForLoad = 0;

[
  "solution",
  "1-01-three-messages",
  "1-02-five-messages",
  "1-03-pattern",
  "1-04-table",
  "1-05-computator",
].forEach((name) => {
  scriptsForLoad++;
  var newScript = document.createElement("script");
  newScript.src = "../public/scripts/" + name + ".js";
  newScript.async = true;
  newScript.onload = onLoadedScript;
  document.head.appendChild(newScript);
});

function onLoadedScript() {
  scriptsForLoad--;
  if (scriptsForLoad == 0) {
    mocha.checkLeaks();
    mocha.run();
  }
}
