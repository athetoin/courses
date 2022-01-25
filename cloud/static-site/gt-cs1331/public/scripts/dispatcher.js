var scriptsForLoad = 0;
document.getElementById("run").onclick = executeSolution;
var selector = document.getElementById("solutions")

class Solution{
    id; title;
    answer(){return any;}
    get orderNumber(){
        var parts = this.id.split(".");
        return parseInt(parts[0],10) * 100 + parseInt(parts[1],10);
    }
    get label(){
        return this.id + ": " + this.title
    }
}

var allSolutions = [];

window.onload = function() {
    var solutionNames = [
    "1-1-three-messages",
    "1-2-five-messages"
    ];
    scriptsForLoad = solutionNames.length;
    solutionNames.forEach(name => {
        var newScript = document.createElement("script");
        newScript.src = "scripts/" + name + ".js";
        newScript.async = true;
        newScript.onload = onLoadedScript;
        document.head.appendChild(newScript);
    })
}

function onLoadedScript() {
    scriptsForLoad--;
    if(scriptsForLoad == 0){
        allSolutions.sort((a,b)=>a.orderNumber - b.orderNumber);
        allSolutions.forEach(solution => {
            var newOption = document.createElement("option");
            newOption.value = solution.id;
            newOption.innerText = solution.label;
            selector.append(newOption);
        })
    }
}

function executeSolution() {
    if(selector.value != ""){
        var out = document.getElementById("out");
        out.querySelectorAll("p").forEach(p => out.removeChild(p));

        var solution = allSolutions.filter(item => item.id == selector.value)[0];
        var title = document.getElementById("title");
        title.innerText = solution.label;

        solution.answer().forEach(output => {
                var paragraph = document.createElement('p');
                paragraph.innerText = output;
                out.append(paragraph);
            })
    }
}