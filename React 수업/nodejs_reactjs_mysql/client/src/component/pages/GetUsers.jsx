import React from "react";
import { useState, useEffect } from "react";
import axios from "axios";
import { Link } from "react-router-dom";

function GetUsers() {
  const [users, setUsers] = useState([]);

  async function getUsers() {
    const { data } = await axios.get("http://localhost:5000/api/users");
    setUsers(data);
  }

  useEffect(() => {
    getUsers();
  }, [users]); // [변수] : 변수의 값이 변할 때 재실행

  async function deleteUser(id) {
    await axios.delete("http://localhost:5000/api/users/deleteUser/" + id);
    getUsers();
  }

  return (
    <div>
      <table border="1" style={{ width: "100%" }}>
        <thead>
          <tr>
            <td>No.</td>
            <td>Userid</td>
            <td>Password</td>
            <td>Username</td>
            <td>Regdate</td>
            <td>-</td>
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
                  <Link>view /</Link>
                  <Link>update /</Link>
                  <Link onClick={() => deleteUser(user.id)}>delete</Link>
                </td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </div>
  );
}

export default GetUsers;
