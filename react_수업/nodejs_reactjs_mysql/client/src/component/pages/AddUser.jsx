import axios from "axios";
import React from "react";
import { useState } from "react";
import { useNavigate } from "react-router-dom";

function AddUser() {
  const [userid, setUserid] = useState("");
  const [passwd, setPasswd] = useState("");
  const [username, setUsername] = useState("");

  const navigate = useNavigate();

  async function handleForm(e) {
    e.preventDefault();
    const info = {
      userid,
      passwd,
      username,
    };
    // await axios.post("http://localhost:5000/api/users/addUser", {userid, passwd, username});
    await axios.post("http://localhost:5000/api/users/addUser", info);
    navigate("/");
  }

  return (
    <div>
      <form method="post" onSubmit={handleForm}>
        아디
        <input
          type="text"
          name="userid"
          onChange={(e) => setUserid(e.target.value)}
        />
        <br />
        비번
        <input
          type="text"
          name="passwd"
          onChange={(e) => setPasswd(e.target.value)}
        />
        <br />
        이름
        <input
          type="text"
          name="username"
          onChange={(e) => setUsername(e.target.value)}
        />
        <br />
        <input type="submit" value="registr" />
      </form>
    </div>
  );
}

export default AddUser;
