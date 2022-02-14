const uncss = require("uncss");

const files = ["public/index.html"],
  options = {
    ignore: ["p", "pre", ".foundation-mq", /\.is-\w+/, /^\[.+\]/],
  };

var input = uncss(files, options, function (error, output) {
  console.log(output);
});
