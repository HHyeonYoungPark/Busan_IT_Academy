const count = require("./numbers");
const func = require("./addFunc");
const { findSourceMap } = require("module");

console.log(count.num1);
console.log(count.num2);

func.x();
func.y();

console.log(func.sum(count.num1, count.num2));
