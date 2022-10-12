import Axios from "axios";
import Albums from "./component/Albums";
import Loading from "./component/Loading";
import "./App.css";
import { useEffect, useState } from "react";

function App() {
  const URL = "https://jsonplaceholder.typicode.com/albums";
  const [isLoading, setIsLoading] = useState(false);
  const [albums, setAlbums] = useState([]);

  useEffect(() => {
    const fetchData = async function () {
      const result = await Axios.get(URL);
      // console.log(result.data.slice(0, 20)); 확인용
      setAlbums(result.data);
      setIsLoading(false);
    };

    setIsLoading(true);
    fetchData();
  }, []);

  if (isLoading) {
    return <Loading />;
  }

  return (
    <div>
      <Albums albums={albums} />
    </div>
  );
}

export default App;
