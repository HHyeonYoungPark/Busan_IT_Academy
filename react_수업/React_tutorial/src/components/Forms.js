// import "./App.css";
import { useState } from "react";

function Forms() {
  const [userid, setUserid] = useState("");
  const [subject, setSubject] = useState("");
  const [agree, setAgree] = useState(false);

  // submit 눌렀을때 실행하는 함수
  function handleData(e) {
    // 버튼이나 a태그는 기본적으로 누르면 다음 페이지로 이동
    // 기본 동작을 중지
    e.preventDefault();
    // console.log(`${userid} : ${subject} : ${agree} `);
    if (userid == "") {
      alert("아이디를 입력하세요");
    }
  }

  return (
    // 회원가입 폼
    <div>
      {/* submit 버튼을 누르면 실행하는 함수는 form 안에 함수 이름만 사용 */}

      <form method="post" onSubmit={handleData}>
        {/* <h1>아이디 : {userid}</h1>
        <h1>과목 : {subject}</h1>
        <h1>동의 : {agree}</h1> */}
        <div>
          아이디 :
          <input type="text" onChange={(e) => setUserid(e.target.value)} />
        </div>
        <div>
          과목명 :
          <select onChange={(e) => setSubject(e.target.value)}>
            <option>Java</option>
            <option>Spring</option>
            <option>NodeJS</option>
            <option>ReactJS</option>
          </select>
        </div>
        <div>
          {/* 선택하면 true, 해제하면 false */}
          <input type="checkbox" onChange={(e) => setAgree(e.target.checked)} />
          회원가입에 동의하십니까?
        </div>
        <input type="submit" value="Register" />
      </form>
    </div>
  );
}

export default Forms;
