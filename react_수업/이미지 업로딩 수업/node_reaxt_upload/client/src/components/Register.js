import React, { useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";

function Register() {
  const [username, setUsername] = useState("");
  const [position, setPosition] = useState("");
  const [attach, setAttach] = useState("");

  const navigate = useNavigate();

  function frmHandler(e) {
    e.preventDefault();
    // axios.post("http://localhost:4004/register", { 값 });
    // axios.post("/register", { 값 });
    let formData = new FormData(); // formData 안에 자료를 전부 이어 붙이기해서 서버로 전송
    formData.append("username", username);
    formData.append("position", position);
    formData.append("attach", attach);

    axios.post("/register", formData).then((response) => {
      if (response.data.status === 201) {
        window.alert(response.data.message);
        navigate("/");
      } else {
        window.alert("Failed...");
        navigate("/");
      }
    });

    // axios.post(주소, 값).then((response) => {주소를 처리후에 작업할 내용})
  }

  return (
    <div>
      <form method="post" encType="multipart/form-data" onSubmit={frmHandler}>
        <div>
          <input
            onChange={(e) => {
              setUsername(e.target.value);
            }}
            type="text"
            name="username"
            required
            placeholder="Username"
          />
        </div>
        <div>
          <input
            onChange={(e) => {
              setPosition(e.target.value);
            }}
            type="text"
            name="position"
            required
            placeholder="Position"
          />
        </div>
        <div>
          <input
            onChange={(e) => {
              setAttach(e.target.files[0]);
            }}
            type="file"
            name="attach"
            required
          />
        </div>
        <div>
          <input type="submit" value="SUBMIT" />
        </div>
      </form>
    </div>
  );
}

export default Register;
