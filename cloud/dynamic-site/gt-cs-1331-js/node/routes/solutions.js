const express = require("express");
const router = express.Router();
const fs = require("fs");
const vm = require("vm");
const console = require("console");
console.log("Hi");
console.log(__dirname);
const allSolutions = fs
  .readdirSync(__dirname + "/../solutions/")
  .map((name) => name.split(".")[0])
  .filter((name) => name !== "solution")
  .map((name) =>
    vm.runInNewContext(`new (require("../solutions/${name}"))`, {
      require,
      __filename,
      __dirname,
    })
  );

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
