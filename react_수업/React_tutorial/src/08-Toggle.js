// Toggle 버튼

import { useState } from "react";

function App() {
  //true : 누르면 보여주기, false : 숨기기  => boolean 초기값은 false
  //if는 삼항연자산자(?)로 표기
  const [isShow, setIsShow] = useState(false);

  return (
    <>
      <h1>{isShow ? "asdasdasdasdasdadasdasdasadsasd" : "asd"}</h1>
      {/* <button onClick={() => setIsShow(false)}>Hide</button>
      <button onClick={() => setIsShow(true)}>Show</button> */}
      <a href="#" onClick={() => setIsShow(!isShow)}>
        {isShow ? "줄여보기" : "상세보기"}
      </a>
    </>
  );
}

export default App;
