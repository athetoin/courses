const rerun = $("#run");
rerun.on("click", executeSolution);
rerun.hide();
const selector = $("#solutions");
selector.on("change", executeSolution);

$(window).one("load", function () {
  $.get(
    "solutions",
    function (solutions) {
      solutions.sort((a, b) => a.order - b.order);
      solutions.forEach((solution) => {
        $("<option>", { value: solution.id })
          .text(solution.label)
          .appendTo(selector);
      });
    },
    "json"
  );
});

function executeSolution() {
  if (selector.val() != "") {
    selector.children('option[value=""]').prop("disabled", true);

    const out = $("#out");
    out.empty();

    $('section').height('unset');
    $("#title").text(selector.children("option:selected").text());

    rerun.show();

    $.get(
      "solutions/" + selector.val(),
      function (answer) {
        if (!answer.isPattern) {
          answer.output.forEach((output) =>
            $("<p>").text(output).appendTo(out)
          );
        } else {
          $("<pre>")
            .html(answer.output.join("<br>"))
            .appendTo($("<p>"))
            .appendTo(out);
        }
      },
      "json"
    );
  }
}
