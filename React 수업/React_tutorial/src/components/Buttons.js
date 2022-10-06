import { useState } from "react";

function Buttons() {
  const [region, setRegion] = useState("Busan");
  const [counter, setCounter] = useState(0);

  function changeRegion() {
    setRegion("Seoul");
  }

  function add() {
    setCounter(counter + 1);
  }

  function sum() {
    setCounter(counter - 1);
  }

  return (
    <div>
      {/* 버튼을 누르면 글자 초기값을 바꾸는 event (hook : busan -> seoul) */}
      <p>{region}</p>
      <button onClick={changeRegion}>지역바꾸기</button>
      <p></p>
      <h2>Counter : {counter}</h2>
      <button onClick={add}>ADD</button>
      <button onClick={sum}>SUM</button>
    </div>
  );
}

export default Buttons;
