// function Users(props) {
//   return (
//     // 화면 렌더링 : 화면 구성 - render(class일때)
//     <>
//       <h1>이름 : {props.username}</h1>
//       <h1>주소 : {props.addr}</h1>
//       <h1>
//         tel/hp : {props.contact.tel}/{props.contact.hp}
//       </h1>
//     </>
//   );

import { useState } from "react";

// }
function Users({ username, addr, tel, hp }) {
  const [counter, setCounter] = useState(0);

  //   function add() {
  //     setCounter(counter + 1);
  //   }

  return (
    // 화면 렌더링 : 화면 구성 - render(class일때)
    <>
      <h1>이름 : {username}</h1>
      <h1>주소 : {addr}</h1>
      <h1>
        tel/hp : {tel}/{hp}
      </h1>
      <h1>버튼 카운터</h1>
      <p>{counter}</p>
      {/* 버튼이벤트 안에 함수를 바로 사용할 때는 () => 사용 - 코드가 한줄일때 */}
      <button onClick={() => setCounter(counter + 1)}>Add + 1</button>
      <button onClick={() => setCounter(counter - 1)}>minus - 1</button>
    </>
  );
}

export default Users;
