const express = require("express");
const router = express.Router();
const fs = require("fs");
const vm = require("vm");
const console =require("console")
console.log("Hi")
console.log(__dirname)
const allSolutions = fs
  .readdirSync(__dirname + "/../solutions/")
  .map((name) => name.split(".")[0])
  .filter((name) => name !== "solution")
  .map((name) => eval(`new (require("../solutions/${name}"))`) /*{
    const code = fs.readFileSync(__dirname + "/../solutions/" + name + ".js", "utf-8");
    const sandbox={require,console,__dirname}
    const obj = vm.runInNewContext(code, sandbox);
    return new obj();
  }*/);

router.get("/", function (req, res, next) {
  res.send(
    allSolutions.map((solution) => {
      return {
        id: solution.id,
        label: solution.label,
        order: solution.orderNumber,
      };
    })
  );
});

router.get("/:id", function (req, res, next) {
  const sltn = allSolutions.filter(
    (solution) => solution.id === req.params.id
  )[0];
  res.send({ isPattern: sltn.isPattern, output: sltn.answer() });
});

module.exports = router;
