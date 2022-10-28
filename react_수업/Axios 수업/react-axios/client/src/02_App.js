import axios from "axios";
import { useEffect, useState } from "react";
import Loading from "./component/Loding";
import "./App.css";

function App() {
  const URL = "https://jsonplaceholder.typicode.com/albums";
  const [albums, setAlbums] = useState([]);
  // boolean 을 이용해서 true일때는 로딩중, false는 전송완료..
  const [isLoading, setIsLoading] = useState(false);

  // axios : 비동기화 처리
  // async : 함수
  // await : 메소드()
  // function getData() {
  //     await axios.get(주소); //가지고 올때
  //     await axios.post(주소, {보낼자료}); //보낼때
  // }

  // useEffect(화살표함수, [])
  useEffect(() => {
    const fetchData = async function () {
      // 내 컴에 데이터가 정상적으로 넘어오는지
      const result = await axios.get(URL); // 실제 자료를 가져오는 메서드
      //console.log(result.data.slice(0, 20)); // slice하면 원하는 개수만큼 자르기 가능
      // 내 컴퓨터에서 데이터를 사용하려면 변수
      // const [사용할 변수명, set사용할 변수명] = useState(초기값)
      setAlbums(result.data.slice(0, 20));
      setIsLoading(false);
    };

    setIsLoading(true); // axios가 자료를 가지고 오기 전까지는 true(Loading...)
    fetchData();
  }, []);

  if (isLoading) {
    // true - 로딩중이면 Loading.js를 화면에 보여줌
    return <Loading />;
  }

  return (
    <div>
      {albums.map((album, key) => {
        // html디자인 -> return()
        return (
          <div key={key}>
            <h2>{album.id}</h2>
            <h1>{album.title}</h1>
          </div>
        );
      })}
    </div>
  );
}

export default App;
