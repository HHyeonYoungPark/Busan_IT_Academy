import axios from "axios";
import React, { useState } from "react";

const Login = () => {
  const [email, setEmail] = useState("");
  const [passwd, setPasswd] = useState("");

  const frmHandler = async (e) => {
    e.preventDefault();
    await axios
      .post("http://localhost:5000/login", { email, passwd })
      .then((response) => {
        if (response.data.status === 201) {
          window.alert(response.data.message);
          localStorage.setItem("email", response.data.email);
          localStorage.setItem("token", response.data.token);
          window.location = "/";
        } else if (response.data.status === 400) {
          window.alert(response.data.message);
          window.location = "/login";
        } else if (response.data.status === 404) {
          window.alert(response.data.message);
          window.location = "/register";
        } else {
          window.alert("관리자에게 문의하세요.");
          window.location = "/";
        }
      });
  };

  return (
    <div>
      <h1>Login Form</h1>
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
          <input type="submit" value="Login" />
        </div>
      </form>
    </div>
  );
};

export default Login;
