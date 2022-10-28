import axios from "axios";
import React, { useEffect, useState } from "react";
import { redirect } from "react-router-dom";

function Home() {
  const [users, setUsers] = useState([]);

  async function getAllData() {
    await axios.get("/getAllData").then((response) => {
      if (response.data.status === 201) {
        setUsers(response.data.users);
        console.log(response.data.message);
      } else {
        console.log("err : get data failed");
      }
    });
  }

  useEffect(() => {
    getAllData();
  }, []);

  async function deleteItem(id) {
    await axios.delete("/delete/" + id).then((response) => {
      if (response.data.status === 201) {
        window.alert(response.data.message);
        getAllData(); // useEffect 실행하는거랑 같음(새로고침)
      } else {
        window.alert("Delete err");
      }
    });
  }

  return (
    <>
      <h2>전체 사원수 : {users.length}명</h2>
      <div className="wrapper">
        {users.length > 0
          ? users.map((user, key) => {
              return (
                <div className="box" key={key}>
                  <h5>{user.id}</h5>
                  <img src={user.attach} alt={user.attach} />
                  <h3>{user.username}</h3>
                  <h4>{user.position}</h4>
                  <h5>{user.regdate}</h5>
                  <p>
                    <button>수정</button>
                    <button onClick={() => deleteItem(user.id)}>삭제</button>
                  </p>
                </div>
              );
            })
          : "등록된 정보가 없습니다."}
      </div>
    </>
  );
}

export default Home;
