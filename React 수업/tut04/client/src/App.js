import { useState } from "react";

function App() {
  const [userid, setUserid] = useState("");
  const [passwd, setPasswd] = useState("");
  const [age, setAge] = useState(0);

  const styles = {
    //외부스타일시트(파일을 별도) : css의 클래스와 동일하게 className 사용해야 함
    // style={styles}
    color: "#f00",
    backgroundColor: "#000",
  };

  return (
    <>
      <p style={styles}>아이디: {userid}</p>
      <p>비밀번호: {passwd}</p>
      <p>나이 : {age}</p>
      <input type="text" onChange={(e) => setUserid(e.target.value)} />
      <br />
      <input type="text" onChange={(e) => setPasswd(e.target.value)} />
      <br />
      <input type="text" onChange={(e) => setAge(e.target.value)} />
    </>
  );
}

export default App;

// function App() {
//   const [str, setStr] = useState("");
//   return (
//     <>
//       {/* input handling */}
//       <h1>useState Hook 사용</h1>
//       <h1>{str}</h1>
//       {/* input에 값을 입력하면 h1에 표시됩니다 -> input에 값 입력하는 이벤트는
//             onchange() 메소드를 사용함 */}
//             {/* e.target : 현재 활성화 되어있는 (입력 또는 클릭하고 있는) form */}
//       <input type="text" onChange={(e) => setStr(e.target.value)} />
//     </>
//   );
// }

// export default App;
