import "./App.css";
import { useState, useEffect } from "react";
import axios from "axios";
// import { useNavigate } from "react-router-dom";
// useNavigate = react-router-dom 설치

function App() {
  const [userid, setUserid] = useState("");
  const [passwd, setPasswd] = useState("");
  const [username, setUsername] = useState("");
  const [msg, setMsg] = useState("");
  const [users, setUsers] = useState([]); // 전체 회원을 담기 위한 객체

  // const navigate = useNavigate();

  async function handleSubmit(e) {
    e.preventDefault(); // page 넘김 x
    // const result = await axios.post("http://localhost:5000/api/users/addUser", {
    //   userid,
    //   passwd,
    //   username,
    // });
    // console.log(result.data.msg);
    const { data } = await axios.post(
      "http://localhost:5000/api/users/addUser",
      {
        userid,
        passwd,
        username,
      }
    );
    // navigate("/");
    setMsg(data.msg);
  }

  async function getUsers() {
    const { data } = await axios.get("http://localhost:5000/api/users");
    setUsers(data);
  }

  useEffect(() => {
    getUsers();
  }, []);

  async function deleteUser(uid) {
    // await axios.delete("http://localhost:5000/api/users/deleteUser/"+uid);
    await axios.delete(`http://localhost:5000/api/users/deleteUser/${uid}`);
    getUsers();
  }

  return (
    <>
      <div>
        <form method="post" autoComplete="off" onSubmit={handleSubmit}>
          아디
          <input
            type="text"
            name="userid"
            value={userid}
            onChange={(e) => setUserid(e.target.value)}
          />
          <br />
          비번
          <input
            type="text"
            name="passwd"
            value={passwd}
            onChange={(e) => setPasswd(e.target.value)}
          />
          <br />
          이름
          <input
            type="text"
            name="username"
            value={username}
            onChange={(e) => setUsername(e.target.value)}
          />
          <br />
          <button type="submit">Register</button>
        </form>
        <p></p>
        <div>
          {/* <h1 style={msg=='success'? {} : null }>{msg}</h1> */}
          <h1
            style={
              msg == "success"
                ? { backgroundColor: "steelblue", color: "#fff" }
                : null
            }
          >
            {msg}
          </h1>
          <table border="1">
            <thead>
              <tr>
                <td>ID</td>
                <td>Userid</td>
                <td>Password</td>
                <td>Username</td>
                <td>regdate</td>
                <td>Update/Delete</td>
              </tr>
            </thead>
            <tbody>
              {users.map((user, key) => {
                return (
                  <tr key={key}>
                    <td>{user.id}</td>
                    <td>{user.userid}</td>
                    <td>{user.passwd}</td>
                    <td>{user.username}</td>
                    <td>{user.regdate}</td>
                    <td>
                      Update/{" "}
                      <a href="!#" onClick={() => deleteUser(user.id)}>
                        Delete
                      </a>
                    </td>
                  </tr>
                );
              })}
            </tbody>
          </table>
        </div>
      </div>
    </>
  );
}

export default App;
