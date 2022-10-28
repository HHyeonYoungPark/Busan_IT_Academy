import axios from "axios";
import { useState, useEffect } from "react";
import Load from "./components/Load";
import "./App.css";

function App() {
  const [joke, setJoke] = useState("Random American Joke");
  const [loading, setLoading] = useState(true);

  const URL = "https://icanhazdadjoke.com";
  const fetData = async function (err) {
    const result = await axios.get(URL, {
      headers: {
        Accept: "application/json",
      },
    });
    // console.log(result.data.joke);
    if (err) {
      throw err;
    } else {
      setLoading(false);
      setJoke(result.data.joke);
    }
  };

  // 렌더링(화면 새로고침)이나 화면이 움직이는 동작할 때마다 실행
  // useEffect(() => { });

  // 변수값이 바뀔때마다 실행
  // useEffect(() => {
  // }, [변수명]);

  // 화면 렌더링할 때 한번만 실행
  // useEffect(() => {
  // }, []);

  useEffect(() => {
    fetData();
  }, []);

  if (loading) {
    <Load />;
  }

  return (
    <>
      <h1>{joke}</h1>
      <button onClick={fetData}>누르세요</button>
    </>
  );
}

export default App;
