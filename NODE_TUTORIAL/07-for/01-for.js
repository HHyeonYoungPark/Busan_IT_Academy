/*
for - of : java 향상된 for
forEach : 빈도
*/

// for(let 별명 of 객체명){
//     console.log(별명);
// }

const colors = ["RED", "GREEN", "BLUE"];
for (let element of colors) {
  console.log(element);
}

/*  
객체명.forEach(() => {
    console.log(별명);
});
*/
console.log("");
colors.forEach((el) => {
  console.log(el);
});

console.log("-----------------------------------------------------");
const str = "KOREA";
for (let s of str) {
  console.log(s);
}

console.log("-----------------------------------------------------");
jsObj = [
  { id: 1, username: "KOREA" },
  { id: 2, username: "U.S.A" },
  { id: 3, username: "JAPAN" },
];
for (let obj of jsObj) {
  console.log(obj);
}

jsObj.forEach((o) => {
  console.log(o);
});
