import { useState } from "react";

function App() {
  // hook : react use로 시작하는 기능 - useState, useEffect, useMemo
  // let, const
  // react에서는 일반적으로 사용하는 변수
  // const [사용할 변수, set저장할 변수] = useState(초기값);
  // import {useState} from 'react';

  const [counter, setCounter] = useState(0);
  const [changeTxt, setChangeTxt] = useState("Seoul");

  function plus() {
    setCounter(counter + 1);
  }

  function minus() {
    // setCounter(counter - 1);
    // 음수가 안나오게 하고 싶다면..
    if (counter < 1) {
      setCounter(0);
    } else {
      setCounter(counter - 1);
    }
  }

  function changeTxtName(changeTxt) {
    // 매개변수 사용
    setChangeTxt(changeTxt);
  }

  // // 글자 str
  // const [str, setStr] = useState("yes")
  // // true, false
  // const [isLogin, setIsLogin] = useState(false);
  // // json -> users = {}, [{}]
  // const [users1, setUsers1] = useState({});
  // const [users2, setUsers2] = useState([]);

  return (
    <div>
      <span>{counter}</span>
      <button onClick={plus}>Plus</button>
      <button onClick={minus}>Minus</button>
      {/* <p>글자를 표시하는 태그</p> // seoul -> busan 으로 바꿔볼게여ㅛ */}
      <p>{changeTxt}</p>
      <button onClick={() => changeTxtName("Busan")}>
        클릭하면 글자가 바뀜
      </button>
    </div>
  );
}

export default App;
