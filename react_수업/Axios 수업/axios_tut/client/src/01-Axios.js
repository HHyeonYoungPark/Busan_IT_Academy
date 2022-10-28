/*
  1. npm i axios - axios 설치
  2. 사용할 파일 상단에 import axios from "axios";
  3. useState를 이용해서 const [] = useState(); 저장 변수 - 초기값은 내용에 따라 [],{}등 달라짐
  4. get(외부데이터 가지고 올때), 
     - const fetchData = async function() { // async - function
        const result = await axios.get(url);  // await - 메소드()앞에
        console.log(result.data);
       }

       post(내부데이터를 외부에 저장할 때)
     - const fetchData = async () => {
        const result = await axios.post(url, {전송할 데이터}); // 전송할 데이터는 key:value 방식
        console.log(result.data);
       }

*/

import axios from "axios";
import { useState, useEffect } from "react";

function App() {
  const [store, setStore] = useState({});

  const fetchData = async function () {
    // async - function
    // await - 메소드()앞에
    const result = await axios.get("https://reqres.in/api/users");
    // console.log(result.data);
    setStore(result.data);
  };

  useEffect(() => {
    fetchData();
  }, []); // []: 대괄호 안붙이면 이벤트가 발생할 때마다 axios를 실행해서 데이터를 가져옴

  // 객체명.map((별명, key) => {
  //    출력html
  // });

  return (
    <>
      {store.map((s, key) => {
        // key - 배열번호
        return (
          <p>
            {s.name}/{s.price}
          </p>
        );
      })}
    </>
  );
}

export default App;
