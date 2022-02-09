const express = require("express");
const router = express.Router();
const fs = require("fs");

const allSolutions = fs
  .readdirSync(__dirname + "/../solutions/")
  .map((name) => name.split(".")[0])
  .filter((name) => name !== "solution")
  .map((name) => eval('new (require("../solutions/' + name + '"))'));

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
