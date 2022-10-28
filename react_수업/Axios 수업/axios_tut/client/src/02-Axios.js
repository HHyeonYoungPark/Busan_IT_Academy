import axios from "axios";
import { useState, useEffect } from "react";

function App() {
  const [users, setUsers] = useState([]); // 외부데이터 저장하는 hook

  const fetchData = async () => {
    const result = await axios.get("https://reqres.in/api/users");
    // console.log(result.data.data[0].id);
    setUsers(result.data.data);
  };

  useEffect(() => {
    fetchData();
  }, []);

  return (
    <>
      {users.map((user, key) => {
        return (
          <div key={key}>
            <img src={user.avatar} alt={user.name} />
            <p> {user.first_name} </p>
          </div>
        );
      })}
    </>
  );
}

export default App;
