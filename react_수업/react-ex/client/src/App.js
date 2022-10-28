import axios from "axios";
import { useEffect } from "react";

function App() {
  async function postData() {
    // axios.get(주소) 데이터 가져올때
    // axios.post(주소, {저장할 자료}) 저장할때
    // axios.put("/user/1") 수정할때
    // axios.delete("user/2") 삭제할때

    const result = await axios.post("http://localhost:5000/setUserid", {
      userid: "ssssssssssss",
    });
    console.log(result.data.msg);
  }

  useEffect(() => {
    postData();
  }, []);

  return <div></div>;
}

export default App;
