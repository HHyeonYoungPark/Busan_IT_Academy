import React from "react";
import { useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";

const Register = () => {
  const navigate = useNavigate();
  const [email, setEmail] = useState("");
  const [passwd, setPasswd] = useState("");

  const frmHandler = async (e) => {
    e.preventDefault();
    await axios
      .post("http://localhost:5000/register", { email, passwd })
      .then((response) => {
        //node(res.send() => 받을때 response.data)
        if (response.data.status === 201) {
          window.alert(response.data.message);
          //              저장되는 key , value
          localStorage.setItem("token", response.data.token);
          localStorage.setItem("email", response.data.email);
          navigate("/");
        } else {
          window.alert("Insert Failed");
        }
      });
  };

  return (
    <div>
      <h1>Register Form</h1>
      <form method="post" onSubmit={frmHandler}>
        <div>
          <input
            type="text"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
          />
        </div>
        <div>
          <input
            type="text"
            value={passwd}
            onChange={(e) => setPasswd(e.target.value)}
          />
        </div>
        <div>
          <input type="submit" value="Register" />
        </div>
      </form>
    </div>
  );
};

export default Register;
